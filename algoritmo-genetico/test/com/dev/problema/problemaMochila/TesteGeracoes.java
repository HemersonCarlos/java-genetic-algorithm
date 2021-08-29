package com.dev.problema.problemaMochila;

import java.util.Random;

public class TesteGeracoes {

	public static void main(String[] args) {

		Random numeroAlatorio = new Random();
		Geracoes geracoes = new Geracoes();
		Tabela tabelaItens = new Tabela();

		geracoes.getPopulacao().inicializandoPopulacao();
		geracoes.getPopulacao().calcularFitnessPorIndividuoDaPopulacao();

		System.out.println("Geração: " + geracoes.getContagemDaGeracoes() + " / Melhor fitness da geração: " + geracoes.getPopulacao().getValorDeFitnessDoMelhorIndividuo());

		while (geracoes.getContagemDaGeracoes() < 35) {

			geracoes.somarContagemDaGeracoes();

			geracoes.selecionarOsDoisMelhoresIndividuos();

			geracoes.crossover();

			if (numeroAlatorio.nextInt() % 7 < 2) {
				geracoes.mutacao();
			}

			geracoes.adicionarFilhoNaPopulacao();

			geracoes.getPopulacao().calcularFitnessPorIndividuoDaPopulacao();

			System.out.println("Geração: " + geracoes.getContagemDaGeracoes() + " / Melhor fitness da geração: " + geracoes.getPopulacao().getValorDeFitnessDoMelhorIndividuo());

		}

		System.out.println("\nTerminou na geração: " + geracoes.getContagemDaGeracoes());
		System.out.println("\nMelhor pontuação: " + geracoes.getPrimeiroMelhorIndividuo().getFitnessPorIndividuo());
		System.out.println("Peso da mochila: " + geracoes.getPrimeiroMelhorIndividuo().getPesoDaMochila());
		System.out.print("Genes: ");

		for (int i = 0; i < geracoes.getPrimeiroMelhorIndividuo().getGenes().length; i++) {
			System.out.print(geracoes.getPrimeiroMelhorIndividuo().getGenes()[i]);
		}

		System.out.println("");

		System.out.println("\nPopulação: " + geracoes.getPopulacao().toString());
		System.out.println("Fitness dos indivíduos da população: " + geracoes.getPopulacao().imprimirFitnessDaPopulacao());
		System.out.println("Peso dos indivíduos da população: " + geracoes.getPopulacao().imprimirPesosDasMochilasDaPopulacao());
		System.out.println("\nItens:\n" + tabelaItens.toString() + "");

	}

}
