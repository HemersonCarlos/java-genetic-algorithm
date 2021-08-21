package com.dev.problema.problemaMochila;

import java.util.Arrays;

public class TestePolulacao {

	public static void main(String[] args) {
		
		Populacao populacao1 = new Populacao();
		
		populacao1.inicializandoPopulacao();
		
		populacao1.calcularFitnessPorIndividuoDaPopulacao();
		
		System.out.println("Popula��o -> " + Arrays.toString(populacao1.getIndividuos()));
		System.out.println("--------------");
		System.out.println("Fitness da popula��o -> " + populacao1.imprimirFitnessDaPopulacao());
		System.out.println("--------------");
		System.out.println("Peso mochila da popula��o -> " + populacao1.imprimirPesosDasMochilasDaPopulacao());
		System.out.println("--------------");
		System.out.println("(Primeiro melhor indiv�duo) - com maior pontua��o e peso da mochila respeitando a regra de 30 kg no m�ximo!");
		System.out.println("Indiv�duo -> " + populacao1.getPrimeiroIndividuoComMaiorPontuacao().toString());
		System.out.println("Fitness -> " + populacao1.getPrimeiroIndividuoComMaiorPontuacao().getFitnessPorIndividuo());
		System.out.println("Peso da mochila -> " + populacao1.getPrimeiroIndividuoComMaiorPontuacao().getPesoDaMochila());
		System.out.println("--------------");
		System.out.println("(Segundo melhor indiv�duo) - com maior pontua��o e peso da mochila respeitando a regra de 30 kg no m�ximo!");
		System.out.println("Indiv�duo -> " + populacao1.getSegundoIndividuoComMaiorPontuacao().toString());
		System.out.println("Fitness -> " + populacao1.getSegundoIndividuoComMaiorPontuacao().getFitnessPorIndividuo());
		System.out.println("Peso da mochila -> " + populacao1.getSegundoIndividuoComMaiorPontuacao().getPesoDaMochila());
		System.out.println("--------------");
		System.out.println("(�ndice do primeiro pior indiv�duo) - com menor pontua��o e peso da mochila respeitando a regra de 30 kg no m�ximo!");
		System.out.println("�ndice -> " + populacao1.getIndiceDoPrimeiroPiorIndividuoComMenorPontuacao());
		System.out.println("--------------");
		System.out.println("(�ndice do segundo pior indiv�duo) - com menor pontua��o e peso da mochila respeitando a regra de 30 kg no m�ximo!");
		System.out.println("�ndice -> " + populacao1.getIndiceDoSegundoPiorIndividuoComMenorPontuacao());
		System.out.println("--------------");
		System.out.println("Valor de fitness do melhor indiv�duo -> " + populacao1.getValorDeFitnessDoMelhorIndividuo());
		System.out.println("--------------");
	}
	
}
