package br.edu.insper.desagil.aps3;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    // Inicializa um usuário
    public Usuario usuario;

    // Inicia o mapa do pedido
    private Map<Integer, Integer> pratos;

    // Valores recebidos na construção da classe
    public Pedido(Usuario usuario) {
        this.pratos = new HashMap<>();
        this.usuario = usuario;
    }

    // Método que adiciona um prato ao pedido e quantidade
    public void adiciona(Prato prato) {
        // Se a chave não existir, adiciona ela como a quantidade inicial (1)
        if (!pratos.containsKey(prato.getId())) {
            pratos.put(prato.getId(), 1);
        }
        // Se a chave já existir, adiciona 1 ao valor existente
        else {
            pratos.put(prato.getId(), pratos.get(prato.getId()) + 1);
        }
    }

    public int totalDePratosDiferentes() {
        return pratos.size();
    }

    public int totalDePratos() {
        int total = 0;
        for (int quantidade : pratos.values()) {
            total += quantidade;
        }
        return total;
    }
}
