/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetojavateste;

import java.util.Scanner;

/**
 *
 * @author thami
 */


// Arquivo da Aula1 de Java (Instituto de Ensino - IF)
// Link: https://youtu.be/pkHo5VMeQFs


public class ProjetoJavaTeste {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // O Scanner serve para ler algum tipo de dado do usuário (semelhante ao INPUT)
        
        // OBS: Note que a principio, a classe Scanner não está disponivel dentro da classe "ProjetoJavaTeste", portanto, devemos importá-la.
        // Basta clicar na lâmpada e clicar na opção "Add import for java.util.Scanner"
        // Note que lá em cima do projeto, surgiu uma nova linha com o tipo "import", portanto agora podemos criar novas variáveis do tipo Scanner.
        Scanner entrada = new Scanner(System.in);
        
        
        // Solicitando a var nome 
        System.out.println("Por favor, informe o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Seja bem-vindo(a), " + nome + "!");
        
        
        // Solicitando a var idade
        System.out.println(nome + ", informe a sua idade:");
        int idade = entrada.nextInt();
        entrada.nextLine(); //Após utilizar o nextInt ou nextDouble, é necessário chamar o nextLine para não pular o próximo comando.
        
        System.out.println("Sua idade é " + idade);
        
        
        // Note que, o nextLine() receberá apenas uma variável do TIPO STRING, portanto caso queira adicionar outros tipos de informação, devemos utilizar:
        
        // scan.nextLine(); -----> Recebe texto (String)
        // scan.nextInt();  -----> Recebe número inteiro
        // scan.nextDouble(); ---> Recebe número decimal
        // scan.nextBooelan(); ---> Recebe true ou false
        
    }
}

// Para executar o código atual de forma rápida, clique em Shift + F6
// Para digitar o comando public static void main(String[] args){} de forma mais rápida, basta digitar "main" + Tab
// Para digitar o comando System.out.println(""); de forma mais rápida, basta digitar "sout" + Tab






// Um exercício para praaticar:

public class ExerciciosAula1 {
    // Crie um algoritmo para ler a soma de dois números e depois retornar a soma deles
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Informe um número: ");
        int n1 = entrada.nextInt();
        System.out.println("Primeiro número escolhido: " + n1);
        
        System.out.println("Informe o outro número:");
        int n2 = entrada.nextInt();
        System.out.println("Segundo número escolhido: " + n2);
        
        System.out.println("A soma de ambos os números: " + (n1 + n2));
    }
     }


