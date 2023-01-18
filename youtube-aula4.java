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

public class TratamentoExcecoes {
    
        // Uma exceção é disparada quando o fluxo "normal" da aplicação sofre uma ação inesperada, portanto o algoritmo não sabe como executar
        // Exemplos que podem ocorrer:
        // Conversão de tipo de dados
        // Tentativa de acessar uma posição inexistente dentro de um array
        // Fazer um divisão por 0
    
    public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog("Qual é a sua idade?");
        
        // Para verificar se o user é maior de idade, precisamos converter de string para int
        try{
            int intIdade = Integer.parseInt(idade);
        
            if (intIdade >= 18){
                JOptionPane.showMessageDialog(null, "Então, você é maior de idade");
            } else {
                JOptionPane.showMessageDialog(null, "Então, você é menor de idade");
            }
        }

        // Exception x = nome da exceção
        catch(Exception x) {
            JOptionPane.showMessageDialog(null, "Erro ao converter o número: " + x.getMessage());
        }
        // Exemplo: caso o user tivesse digitado "Vinte anos", exibiria um "erro" e seria disparado essa exceção e acabam parando o restante da aplicação (não passa para as próximas etapas)
        // Para evitar que isso ocorra, adicionamos um "try" junto a var idade
        // Caso ocorra alguma execeção dentro do TRY, será pulado para executar o CATCH
        // A exceção continuará sendo disparada, porém ele não parará a aplicação
        
    }
}
