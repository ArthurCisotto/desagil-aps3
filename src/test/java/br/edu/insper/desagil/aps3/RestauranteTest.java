package br.edu.insper.desagil.aps3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestauranteTest {
	
	private Prato prato1;
	private Prato prato2;
	private List<Prato> listaDePratos;
	private Restaurante restaurante;
	
	@BeforeEach
	private void setUp() {
		listaDePratos = new ArrayList<>();
		
        prato1 = new Prato(1, "Açaí", 18.98);
        prato2 = new Prato(2, "Bolo de Chocolate", 12.99);
        
        listaDePratos.add(prato1);
        listaDePratos.add(prato2);
        
		restaurante = new Restaurante("Kzacafe", listaDePratos);
	}

    @Test
    void constroi() {
    	assertEquals("Kzacafe", restaurante.getNome());
    	assertEquals(2, restaurante.getListaDePratos().size());
    }
    
    @Test
    void verificaSomaDosPrecos() {
    	assertEquals(31.97, restaurante.somaDosPrecos(), 0.00001);
    }
}
