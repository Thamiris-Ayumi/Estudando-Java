/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programoo;

/**
 *
 * @author thami
 */ 

// ARRAYS
// Arrays são estruturas para salvar dados de forma sequencial

// Desvantagens:

// 1 - Um array não pode ser redimensionado (Se o array tem 5 posições, durante todo o tempo de execução ele terá apenas 5 posições)
// 2 - Um array só pode armanezenar um único tipo (int, string, boolean - apenas um tipo por vez)

public class Arrays {
    public static void main(String[] args) {
        // Array de inteiros
        int[] arrayInteiros = new int[5]; // Note que é preciso definir o tamanho do array
        
        // Para salvar um valor, utilize a posição
        // 1ª posição = 0, 2ª posição = 1, 3ª posição = 2 [...]
        arrayInteiros[0] = 10;
        arrayInteiros[1] = 7;
        arrayInteiros[2] = 19;
        arrayInteiros[3] = 6;
        arrayInteiros[4] = 20;
        
        int posicao0 = arrayInteiros[0];
        System.out.println("O primeiro número é " + posicao0);
        
        
        // Como percorrer um array e imprimir todos os seus valores:
        // Podemos utilizar um for

        for(int i = 0 ; i < arrayInteiros.length; i++) {
            System.out.println(arrayInteiros[i]);
        }
        
        // Outra forma: (A cada posição atual, é jogado o valor atual para dentro da variável definida)
        for(int posicaoAtual : arrayInteiros){
            System.out.println("Posição atual: " + posicaoAtual);
        }
        
        
        
        
        
        // Podemos também declarar um array já definindo os seus valores  e, consequentemente, a quantidade de posições que ele terá:
        String [] arrayNomes = new String[] {
            "Ana", "João", "Maria", "Pedro"
        };
        
        // Executando esse array criado:
        for (String nome : arrayNomes){
            System.out.println("Nome: " + nome);
        }
    }
}



