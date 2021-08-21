package com.dev.problema.problemaMochila;

import java.util.Arrays;

public class TestePolulacao {

	public static void main(String[] args) {
		
		Populacao populacao1 = new Populacao();
		
		populacao1.inicializandoPopulacao();
		
		populacao1.calcularFitnessPorIndividuoDaPopulacao();
		
		System.out.println("População -> " + Arrays.toString(populacao1.getIndividuos()));
		System.out.println("--------------");
		System.out.println("Fitness da população -> " + populacao1.imprimirFitnessDaPopulacao());
		System.out.println("--------------");
		System.out.println("Peso mochila da população -> " + populacao1.imprimirPesosDasMochilasDaPopulacao());
		System.out.println("--------------");
		System.out.println("(Primeiro melhor indivíduo) - com maior pontuação e peso da mochila respeitando a regra de 30 kg no máximo!");
		System.out.println("Indivíduo -> " + populacao1.getPrimeiroIndividuoComMaiorPontuacao().toString());
		System.out.println("Fitness -> " + populacao1.getPrimeiroIndividuoComMaiorPontuacao().getFitnessPorIndividuo());
		System.out.println("Peso da mochila -> " + populacao1.getPrimeiroIndividuoComMaiorPontuacao().getPesoDaMochila());
		System.out.println("--------------");
		System.out.println("(Segundo melhor indivíduo) - com maior pontuação e peso da mochila respeitando a regra de 30 kg no máximo!");
		System.out.println("Indivíduo -> " + populacao1.getSegundoIndividuoComMaiorPontuacao().toString());
		System.out.println("Fitness -> " + populacao1.getSegundoIndividuoComMaiorPontuacao().getFitnessPorIndividuo());
		System.out.println("Peso da mochila -> " + populacao1.getSegundoIndividuoComMaiorPontuacao().getPesoDaMochila());
		System.out.println("--------------");
		System.out.println("(Índice do primeiro pior indivíduo) - com menor pontuação e peso da mochila respeitando a regra de 30 kg no máximo!");
		System.out.println("Índice -> " + populacao1.getIndiceDoPrimeiroPiorIndividuoComMenorPontuacao());
		System.out.println("--------------");
		System.out.println("(Índice do segundo pior indivíduo) - com menor pontuação e peso da mochila respeitando a regra de 30 kg no máximo!");
		System.out.println("Índice -> " + populacao1.getIndiceDoSegundoPiorIndividuoComMenorPontuacao());
		System.out.println("--------------");
		System.out.println("Valor de fitness do melhor indivíduo -> " + populacao1.getValorDeFitnessDoMelhorIndividuo());
		System.out.println("--------------");
	}
	
}
