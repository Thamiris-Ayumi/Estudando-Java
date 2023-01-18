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
public class Conversao {
    
    // Criando um algoritmo para receber um número do user (via JOptionPane) e exibir o valor desse número ao quadrado
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null, "Digite um número: ");
        
        // Efetuar uma operação matemática na var "número"
        // Portanto, vamos converter de String -> Int
        
        // Realizando a conversão
        int x = Integer.parseInt(numero);
        
        // Efetuando a operação
        int quadrado = x * x;
        
        // Para exibir o resultado, precisamos retornar a var para o tipo string novamente:
        String resultadoQuadrado = String.valueOf(quadrado);
        JOptionPane.showMessageDialog(null, "O resultado de " + numero + " elevado ao quadrado é " + quadrado);
    }
}


// Resumo das Conversôes:

// String --> INT = Integer.parseInt();
// INT --> String = String.valueOf();
// String --> Double = Double.parseDouble();
// String --> Boolean = Boolean.parseBoolean();

// INT/Double/Boolean --> String =  String.valueOf();