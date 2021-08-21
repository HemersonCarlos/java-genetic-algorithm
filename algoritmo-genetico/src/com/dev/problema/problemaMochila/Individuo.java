package com.dev.problema.problemaMochila;

import java.util.Arrays;
import java.util.Random;

public class Individuo {
    
	private int fitnessPorIndividuo;
	private int pesoDaMochila;
	private int[] genes = new int[6];
	private Tabela tabela = new Tabela();
	
	
	public Individuo() {
		
		Random numeroAleatorio = new Random();
		
		for(int contador = 0; contador < genes.length; contador++) {
			genes[contador] = numeroAleatorio.nextInt(2);	
		}
		
		this.pesoDaMochila = 0;
		this.fitnessPorIndividuo = 0;
	
	}
	
	public void calculaFitnessIndividualDeCadaIndividuo() {
		
		this.pesoDaMochila = 0;
		this.fitnessPorIndividuo = 0;
		
		for(int contador = 0; contador < this.genes.length; contador++) {
			
			if( genes[contador] == 1 ) {
				fitnessPorIndividuo += tabela.getTabelaItens()[contador].getPontoItem();
				pesoDaMochila += tabela.getTabelaItens()[contador].getPesoItem();
			}
		}
	}
	
	
	public void penalizarInadiplencia() {
		
		this.fitnessPorIndividuo = 0;
		this.pesoDaMochila = 0;
		
	}
	
	
	public int[] getGenes() {
		return this.genes;
	}
	
	
	public int getFitnessPorIndividuo() {
		return this.fitnessPorIndividuo;
	}
	
	
	public int getPesoDaMochila() {
		return this.pesoDaMochila;
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(this.getGenes());
	}
}