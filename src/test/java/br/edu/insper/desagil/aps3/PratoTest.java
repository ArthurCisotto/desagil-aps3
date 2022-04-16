package br.edu.insper.desagil.aps3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PratoTest {
    @Test
    void constroi() {
        Prato prato = new Prato(1, "Açaí", 18.98);

        assertEquals(1, prato.getId());
        assertEquals("Açaí", prato.getName());
        assertEquals(18.98, prato.getPrice(), 0.00001);

        Prato prato2 = new Prato(2, "Bolo de Chocolate", 12.99);
        assertEquals(2, prato2.getId());
        assertEquals("Bolo de Chocolate", prato2.getName());
        assertEquals(12.99, prato2.getPrice(), 0.00001);

        assertNotEquals(prato, prato2);
        assertNotEquals(1, prato2.getId());

    }
}
