package com.dev.problema.problemaMochila;

import java.util.Arrays;

public class TesteIndividuo {

	public static void main(String[] args) {

		Individuo individuo1 = new Individuo();

		individuo1.calculaFitnessIndividualDeCadaIndividuo();

		System.out.println(Arrays.toString(individuo1.getGenes()));

		System.out.println("Somat�ria dos pontos (fitness function) -> " + individuo1.getFitnessPorIndividuo());

		System.out.println("Somat�ria do peso da mochila do individuo -> " + individuo1.getPesoDaMochila());

		System.out.println("Tamanho do genes -> " + individuo1.getGenes().length);

		System.out.println("(Metade) Tamanho do genes -> " + individuo1.getGenes().length / 2);

		System.out.println("Peso m�ximo da mochila (Regra) -> " + Regra.PESO_MAXIMO_DA_MOCHILA);

	}

}
