package com.dev.problema.problemaMochila;

public class Item {

	private String nomeItem;
	private int pesoItem;
	private int pontoItem;
	
	public Item(String nomeItemInformado, int pesoItemInformado, int pontoItemInformado) {
		this.nomeItem = nomeItemInformado;
		this.pesoItem = pesoItemInformado;
		this.pontoItem = pontoItemInformado;
	}
	
	public String getNomeItem() {
		return this.nomeItem;
	}
	
	public int getPesoItem() {
		return this.pesoItem;
	}
	
	public int getPontoItem() {
		return this.pontoItem;
	}
	
	@Override
	public String toString() {
		return "Item: " + this.getNomeItem() + " - Peso: " + this.getPesoItem() + " - Ponto: " + this.getPontoItem();
	}
}