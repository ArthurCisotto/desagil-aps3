package br.edu.insper.desagil.aps3;

import java.util.List;

public class Restaurante {
	
	private String nome;
	private List<Prato> listaDePratos;
	
    public Restaurante(String nome, List<Prato> listaDePratos) {
        this.nome = nome;
        this.listaDePratos = listaDePratos;
    }

	public String getNome() {
		return nome;
	}

	public List<Prato> getListaDePratos() {
		return listaDePratos;
	}
	
    public double somaDosPrecos() {
    	double soma = 0.0;
    	for (Prato prato: listaDePratos) {
    		soma += prato.getPrice();
    }
    	return soma;
    }
}
