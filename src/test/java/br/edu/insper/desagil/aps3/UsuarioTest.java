package br.edu.insper.desagil.aps3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    @Test
    void constroi() {
        Usuario usuario = new Usuario("andreb10", "André Brito");
        assertEquals("andreb10", usuario.getLogin());
        assertEquals("André Brito", usuario.getNome());
    }

    @Test
    void MudaNome() {
        Usuario usuario = new Usuario("andreb10", "André Brito");
        usuario.setNome("André Felipe Bulcão Brito");
        assertEquals("André Felipe Bulcão Brito", usuario.getNome());
    }
}
