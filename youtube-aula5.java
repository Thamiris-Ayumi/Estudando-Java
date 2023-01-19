/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programoo;

import classes.Cliente;

/**
 *
 * @author thami
 */



// Arquivo da Aula6 de Java (Instituto de Ensino - IF)
// Link: https://youtu.be/6w_7dxysUuE


// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// CRIANDO A CLASS CLIENTE


// Estrutura básica de Atributos e Métodos
// Atributo = variáveis da classe (exemplo: nome, idade, email, CPF, telefone)
// Metódo =  procedimento que pode ser executado no objeto do tipo Cliente

// Podemos ter atributos e métodos de três tipos:
// "Public" - acessível em qualquer parte do sistema
// "Protected" - acessíveis dentro do mesmo pacote ou por classes da mesma família
// "Private" - acessíveis apenas dentro da class atual

public class Cliente {
    // Neste caso, todos os clientes vão possuir os mesmos tipos de atributos
    public String nome;
    public String email;
    public String telefone;
    
   // Criando um método para o Cliente (comportamentos)
    public void imprimirDados(){
        System.out.println("###### FICHA DO CLIENTE ######");
        System.out.println("NOME: " + this.nome);
        System.out.println("EMAIL: " + this.email);
        System.out.println("TEL: " + this.telefone);
    }
    
   // Coloque o tipo de variável que o método irá retornar (int, double, boolean)
   // Caso não retorne NADA, coloque VOID     

   // This - chamar algo da própria classe
}


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// OBS: Para procurar algum tipo de atributo já definido dentro da classe:
// Ctrl + Space Bar


// Programçâo Orientada a Objetos

// Class = agrupa elementos com a mesma característica (exemplo as tabelas em BD)
// Iremos trabalhar com a interação de vários objetos em conjunto


// Anteriormente, já criamos uma class chamada "Cliente" (basta ir em Source Packages, clicar com a direita e depois Java Package)
public class ProgramOO {

    public static void main(String[] args) {
        
        // Para criar um novo cliente (já criamos uma class chamada "Cliente", portanto devemos importá-la , clicando na lãmpada ao lado)
        Cliente c1 = new Cliente();
        c1.nome = "Paulo";
        c1.email = "paulo@email.com";
        c1.telefone = "(11)91234-5678";
        
        
        Cliente c2 = new Cliente();
        c2.nome = "Emilly";
        c2.email = "emilly@email.com";
        c2.telefone = "(11)98765-4321";
        
        
        // Para exibir o nome do primeiro cliente
        System.out.println("Nome: " + c1.nome);
        System.out.println("Email: " + c1.email);
        
        // Para exibir o nome do segundo cliente
        System.out.println("Nome: " + c2.nome);
        System.out.println("Email: " + c2.email);
        
        
        // Para não precisar copiar e colar diversas vezes os atributos a serem exibidos, podemos criar um "método" (comportamento) na classe cliente
        
        
        // Utilizando o método para imprimir dados
        c1.imprimirDados();
        c2.imprimirDados();
    }
}
