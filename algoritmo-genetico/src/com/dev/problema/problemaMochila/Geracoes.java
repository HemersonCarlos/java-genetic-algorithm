package com.dev.problema.problemaMochila;

import java.util.Random;

public class Geracoes {

	private Populacao populacao = new Populacao();
	private Individuo primeiroMelhorIndividuo;
	private Individuo segundoMelhorIndividuo;
	private Individuo primeiroFilhoDoCruzamento;
	private Individuo segundoFilhoDoCruzamento;
	private int contagemDeGeracoes = 0;

	public void selecionarOsDoisMelhoresIndividuos() {

		this.getPrimeiroMelhorIndividuo();

		this.getSegundoMelhorIndividuo();

	}

	public void crossover() {

		this.primeiroFilhoDoCruzamento = new Individuo();
		this.segundoFilhoDoCruzamento = new Individuo();

		int metadeGenesDoPrimeiroMelhorIndividuo = this.getPrimeiroMelhorIndividuo().getGenes().length / 2;
		int restoGenesDoSegundoMelhorIndividuo = metadeGenesDoPrimeiroMelhorIndividuo;

		for (int contador = 0; contador < metadeGenesDoPrimeiroMelhorIndividuo; contador++) {
			this.primeiroFilhoDoCruzamento.getGenes()[contador] = this.primeiroMelhorIndividuo.getGenes()[contador];
			this.segundoFilhoDoCruzamento.getGenes()[contador] = this.segundoMelhorIndividuo.getGenes()[contador];
		}

		for (int contador = restoGenesDoSegundoMelhorIndividuo; contador < this.segundoMelhorIndividuo.getGenes().length; contador++) {
			this.primeiroFilhoDoCruzamento.getGenes()[contador] = this.segundoMelhorIndividuo.getGenes()[contador];
			this.segundoFilhoDoCruzamento.getGenes()[contador] = this.primeiroMelhorIndividuo.getGenes()[contador];
		}

	}

	public void mutacao() {

		Random numeroAleatorio = new Random();

		int pontoDeMutacao = numeroAleatorio.nextInt(this.getPopulacao().getIndividuos()[0].getGenes().length);

		if (this.primeiroFilhoDoCruzamento.getGenes()[pontoDeMutacao] == 0) {

			this.primeiroFilhoDoCruzamento.getGenes()[pontoDeMutacao] = 1;

		} else {

			this.primeiroFilhoDoCruzamento.getGenes()[pontoDeMutacao] = 0;

		}

		pontoDeMutacao = numeroAleatorio.nextInt(this.getPopulacao().getIndividuos()[0].getGenes().length);

		if (this.segundoFilhoDoCruzamento.getGenes()[pontoDeMutacao] == 0) {

			this.segundoFilhoDoCruzamento.getGenes()[pontoDeMutacao] = 1;

		} else {

			this.segundoFilhoDoCruzamento.getGenes()[pontoDeMutacao] = 0;
		}

	}

	public void adicionarFilhoNaPopulacao() {

		this.primeiroMelhorIndividuo.calculaFitnessIndividualDeCadaIndividuo();
		this.segundoMelhorIndividuo.calculaFitnessIndividualDeCadaIndividuo();

		int indiceDoPrimeiroPiorIndividuo = this.getPopulacao().getIndiceDoPrimeiroPiorIndividuoComMenorPontuacao();
		int indiceDoSegundoPiorIndividuo = this.getPopulacao().getIndiceDoSegundoPiorIndividuoComMenorPontuacao();

		this.getPopulacao().getIndividuos()[indiceDoPrimeiroPiorIndividuo] = this.primeiroFilhoDoCruzamento;
		this.getPopulacao().getIndividuos()[indiceDoSegundoPiorIndividuo] = this.segundoFilhoDoCruzamento;

	}

	public void somarContagemDaGeracoes() {
		this.contagemDeGeracoes++;
	}

	public Individuo getPrimeiroMelhorIndividuo() {
		return this.primeiroMelhorIndividuo = this.getPopulacao().getPrimeiroIndividuoComMaiorPontuacao();
	}

	public Individuo getSegundoMelhorIndividuo() {
		return this.segundoMelhorIndividuo = this.getPopulacao().getSegundoIndividuoComMaiorPontuacao();
	}

	public Populacao getPopulacao() {
		return this.populacao;
	}

	public int getContagemDaGeracoes() {
		return this.contagemDeGeracoes;
	}
}
