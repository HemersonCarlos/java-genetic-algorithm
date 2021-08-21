package com.dev.problema.problemaMochila;

import java.util.Arrays;

public class Tabela {
	
	private Item tabelaItens[] = new Item[6];
	
	public Tabela() {
	
		tabelaItens[0] = new Item("Saco de dormir", 15, 15);
		tabelaItens[1] = new Item("Corda", 3, 7);
		tabelaItens[2] = new Item("Canivete", 2, 10);
		tabelaItens[3] = new Item("Tocha", 5, 5);
		tabelaItens[4] = new Item("Garrafa", 9, 8);
		tabelaItens[5] = new Item("Comida", 20, 17);
		
	}
	
	public Item[] getTabelaItens() {
		
		return this.tabelaItens;
		
	}
	
	@Override
	public String toString() {
		
		return Arrays.toString(tabelaItens);
		
	}
	
}
