// CLASSES ABSTRATAS
// A classe abstrata não pode ser instanciada, apenas herdada. 
// Ex: Classe "Funcionario" = abstrata  --------- classes "Gerente" e "Vendedor" = classes-filhas de Funcionário
// Portanto, a classe Funcionario "não existe", um funcionário pode ser apenas gerente ou vendedor

// Sendo assim, uma classe abstrata não pode ter um objeto criado a partir de sua instanciação. 
// Essas classes são muito importantes quando não queremos criar um objeto a partir de uma classe “geral”, apenas de suas “subclasses”.


// --------------------- CLASSE FUNCIONÁRIO ---------------------------------------------------------------------------
// Para criar uma classe abstrata:
public abstract class Funcionario {
    private int id;
    private String nome;
    private double salarioBase;
    
    
    // Métodos abstratos definem uma assinatura de método que obrigatoriamente deve ser herdado pelas classes-filhas
    // Criando um método abstrato
    public abstract double calculaSalario();
    
    // Por se tratar de atributos privados, precisamos utilizar Getter and Setter
    // Para isso, basta apertar Alt + Insert e selecionar todos os campos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}






// --------------- CLASSE VENDEDOR ------------------------------------------------------------------

public class Vendedor extends Funcionario {
    // Além de todos os atributos herdados de Funcionario, o Vendedor também possui comissão 
    private double comissao;

    public double calculaSalario(){
        return this.getSalarioBase() + comissao;
    }
    
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
}




// --------------- CLASSE GERENTE------------------------------------------------------------------

public class Gerente extends Funcionario {
    // Além de todos os atributos herdados de Funcionario, o Gerente também possui bonificação
    private double bonus;
    private double impostoRenda;
    
    @Override //Esta anotação significa que ele sobrescreve um método anterior
    public double calculaSalario(){
        return this.getSalarioBase() + this.bonus - this.impostoRenda;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getImpostoRenda() {
        return impostoRenda;
    }

    public void setImpostoRenda(double impostoRenda) {
        this.impostoRenda = impostoRenda;
    }
  
}


//------------------ CLASSE TESTAFUNCIONARIOS -----------------------------------------------------------------------
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programoo;

import classes.Gerente;
import classes.Vendedor;

/**
 *
 * @author thami
 */


public class TestaFuncionarios {
    public static void main(String[] args) {
        // Podemos criar apenas a partir da classe vendedor e 
        
        // Criando um novo vendedor
        Vendedor v = new Vendedor();
        v.setId(1);
        v.setNome("João");
        v.setSalarioBase(1500);
        v.setComissao(250);
        System.out.println(v.calculaSalario());
        
        // Criando um novo gerente
        Gerente g = new Gerente();
        g.setId(2);
        g.setNome("Ana");
        g.setSalarioBase(2000);
        g.setBonus(250);
        g.setImpostoRenda(200);
        System.out.println(g.calculaSalario());
        
    }
}



