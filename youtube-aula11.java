/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thami
 */

// List é uma interface do java que permite salvar dados independentes como se fosse um array

// Vantagens:
// 1 - Não é preciso saber a quantidade de posições que a lista possui, pois ela é definida conforme os dados são adicionados ou excluídos
// 2 - Podemos salvar difentes tipos de variáveis dentro de uma mesma lista

public class Listas {
    public static void main(String[] args) {
        // Como criar uma lista (basta digitar "List" e na lâmpada, escolher o "Add import for java.util.List"
        
        List lista = new ArrayList();
        lista.add(10); // posição 0
        lista.add(20); // posição 1
        lista.add(30); // posição 2
        
        lista.add("Teste com String"); // posição 3
        
        // Para exibir os valores:
        System.out.println(lista.get(1));
        // Por se tratar de uma List, podemos ter tipos de variáveis diferentes dentro da mesma lista:
        System.out.println(lista.get(3));
    }
}
