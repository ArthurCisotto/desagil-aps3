package br.edu.insper.desagil.aps3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PedidoTest {
    @Test
    void constroi() {
        // Constrói um usuário
        Usuario usuario = new Usuario("andreb10", "André Brito");

        // Constrói um pedido
        Pedido pedido = new Pedido(usuario);

        // Verifica se o usuário do pedido não foi inicializado como null
        assertNotEquals(null, pedido.usuario);

        // Verifica se o total de pratos e de pratos diferentes é igual a zero
        assertEquals(0, pedido.totalDePratosDiferentes());
        assertEquals(0, pedido.totalDePratos());
    }

    @Test
    void adicionaDoisPratosDiferentes() {
        Usuario usuario = new Usuario("andreb10", "André Brito");
        Pedido pedido = new Pedido(usuario);

        Prato prato1 = new Prato(1, "Açaí", 19.99);
        Prato prato2 = new Prato(2, "Bolo de Chocolate", 5.49);

        // Adiciona os pratos ao pedido
        pedido.adiciona(prato1);
        pedido.adiciona(prato2);

        // Verifica se o total de pratos e de pratos diferentes é igual a 2
        assertEquals(2, pedido.totalDePratosDiferentes());
        assertEquals(2, pedido.totalDePratos());
    }

    @Test
    void adicionaDoisPratosComQuantidadesDiferentes() {
        Usuario usuario = new Usuario("andreb10", "André Brito");
        Pedido pedido = new Pedido(usuario);

        Prato prato1 = new Prato(1, "Açaí", 19.99);
        Prato prato2 = new Prato(2, "Bolo de Chocolate", 5.49);

        // Adiciona duas vezes o primeiro prato e uma vez o segundo prato
        pedido.adiciona(prato1);
        pedido.adiciona(prato1);
        pedido.adiciona(prato2);

        // Verifica se o total de pratos e de pratos diferentes é igual a 2
        assertEquals(2, pedido.totalDePratosDiferentes());
        assertEquals(3, pedido.totalDePratos());
    }
}
