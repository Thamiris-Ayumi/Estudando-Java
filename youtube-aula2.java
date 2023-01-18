/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojavateste;

import javax.swing.JOptionPane;

/**
 *
 * @author thami
 */


// Arquivo da Aula2 de Java (Instituto de Ensino - IF)
// Link: https://youtu.be/5OGXCrM4a9c

// Este código serve para exibir diferentes elementos na tela (exemplo: inputs, pequenos alerts)
public class BibliotecaJOptionPane {
    
    public static void main(String[] args){
        // Exibe um alert
        JOptionPane.showMessageDialog(null, "Hello, World!");
        
        // Exibe Input na tela
        String nome = JOptionPane.showInputDialog("Por favor, digite seu nome: ");
        
        // Retornando o valor da variável nome
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
        
        
  
        // Mensagem de confirmação com o user (Yes, No, Cancel)
        
        // Se retornar 0 = user clicou em Sim
        // Se retornar 1 = user clicou em Não
        // Se retornar 2 = user clicou em Cancelar
        
        int resposta = JOptionPane.showConfirmDialog(null, "Escolha uma das opções: ");
        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Você clicou em SIM");
        } else if (resposta == 1){
            JOptionPane.showMessageDialog(null, "Você clicou em NÃO");
        } else {
            JOptionPane.showMessageDialog(null, "Você clicou em CANCELAR");
        }
    }
}
