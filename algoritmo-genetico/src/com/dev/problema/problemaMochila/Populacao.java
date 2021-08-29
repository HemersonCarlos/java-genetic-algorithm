package com.dev.problema.problemaMochila;

import java.util.Arrays;

public class Populacao {

	private Individuo[] individuos = new Individuo[6];
	private int[] pontosFitnessIndividuos = new int[6];
	private int[] pesosMochilaIndividuos = new int[6];
	private int valorDeFitnessDoMelhorIndividuo = 0;
	private int primeiraMenorPontuacao = 0;

	public void inicializandoPopulacao() {

		for (int contador = 0; contador < individuos.length; contador++) {
			individuos[contador] = new Individuo();
		}
	}

	public Individuo getPrimeiroIndividuoComMaiorPontuacao() {

		int valorAtualComparado = 0;
		int indiceDoIndividuoComMaiorValorDeFitness = 0;

		for (int contador = 0; contador < individuos.length; contador++) {
			if (individuos[contador].getFitnessPorIndividuo() > valorAtualComparado
					&& individuos[contador].getPesoDaMochila() <= Regra.PESO_MAXIMO_DA_MOCHILA) {
				valorAtualComparado = individuos[contador].getFitnessPorIndividuo();
				indiceDoIndividuoComMaiorValorDeFitness = contador;
			}
		}

		valorDeFitnessDoMelhorIndividuo = individuos[indiceDoIndividuoComMaiorValorDeFitness].getFitnessPorIndividuo();
		return individuos[indiceDoIndividuoComMaiorValorDeFitness];
	}

	public Individuo getSegundoIndividuoComMaiorPontuacao() {

		int valorAtualComparado = 0;
		int indiceDoIndividuoComSegundoMaiorValorDeFitness = 0;

		for (int contador = 0; contador < individuos.length; contador++) {
			if (individuos[contador].getFitnessPorIndividuo() > valorAtualComparado
					&& individuos[contador].getPesoDaMochila() <= Regra.PESO_MAXIMO_DA_MOCHILA
					&& individuos[contador].getFitnessPorIndividuo() != this.getValorDeFitnessDoMelhorIndividuo()) {
				valorAtualComparado = individuos[contador].getFitnessPorIndividuo();
				indiceDoIndividuoComSegundoMaiorValorDeFitness = contador;
			}
		}

		return individuos[indiceDoIndividuoComSegundoMaiorValorDeFitness];
	}

	public int getIndiceDoPrimeiroPiorIndividuoComMenorPontuacao() {

		int valorAtualComparado = Integer.MAX_VALUE;
		int indiceDoIndividuoComMenorValorDeFitness = 0;

		for (int contador = 0; contador < individuos.length; contador++) {
			if (individuos[contador].getFitnessPorIndividuo() < valorAtualComparado
					&& individuos[contador].getPesoDaMochila() <= Regra.PESO_MAXIMO_DA_MOCHILA) {
				valorAtualComparado = individuos[contador].getFitnessPorIndividuo();
				indiceDoIndividuoComMenorValorDeFitness = contador;
			}
		}

		this.primeiraMenorPontuacao = valorAtualComparado;
		return indiceDoIndividuoComMenorValorDeFitness;
	}

	public int getIndiceDoSegundoPiorIndividuoComMenorPontuacao() {

		int valorAtualComparado = Integer.MAX_VALUE;
		int indiceDoIndividuoComMenorValorDeFitness = 0;

		for (int contador = 0; contador < individuos.length; contador++) {
			if (individuos[contador].getFitnessPorIndividuo() < valorAtualComparado
					&& individuos[contador].getPesoDaMochila() <= Regra.PESO_MAXIMO_DA_MOCHILA
					&& (individuos[contador].getFitnessPorIndividuo() == this.getPrimeiraMenorPontuacao()
							&& contador != this.getIndiceDoPrimeiroPiorIndividuoComMenorPontuacao())) {
				valorAtualComparado = individuos[contador].getFitnessPorIndividuo();
				indiceDoIndividuoComMenorValorDeFitness = contador;
			}
		}

		return indiceDoIndividuoComMenorValorDeFitness;
	}

	public void calcularFitnessPorIndividuoDaPopulacao() {

		for (int contador = 0; contador < individuos.length; contador++) {
			individuos[contador].calculaFitnessIndividualDeCadaIndividuo();

			if (individuos[contador].getPesoDaMochila() > Regra.PESO_MAXIMO_DA_MOCHILA) {
				individuos[contador].penalizarInadiplencia();
			}

			pontosFitnessIndividuos[contador] = individuos[contador].getFitnessPorIndividuo();
			pesosMochilaIndividuos[contador] = individuos[contador].getPesoDaMochila();
		}

		this.getPrimeiroIndividuoComMaiorPontuacao();
	}

	public Individuo[] getIndividuos() {
		return this.individuos;
	}

	@Override
	public String toString() {
		return Arrays.toString(this.getIndividuos());
	}

	public String imprimirFitnessDaPopulacao() {
		return Arrays.toString(pontosFitnessIndividuos);
	}

	public String imprimirPesosDasMochilasDaPopulacao() {
		return Arrays.toString(pesosMochilaIndividuos);
	}

	public int getValorDeFitnessDoMelhorIndividuo() {
		return this.valorDeFitnessDoMelhorIndividuo;
	}

	public int getPrimeiraMenorPontuacao() {
		return this.primeiraMenorPontuacao;
	}

}