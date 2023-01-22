//--------------- CRIANDO INTERFACES ----------------------


// Criando uma Interface
// É possível definir as assinaturas dos métodos que todas as classes-filhas deverão possuir
public interface InterfaceFormaGeo {
    
    // Definindo os métodos obrigatórios
    public String descricaoForma(); // Irá retornar qual é a forma (quadrado, círculo, triângulo etc)
    public double calculaArea();    // Note que cada forma terá uma fórmula diferente de cálculo
}



// -------------- CRIANDO UMA CLASSE QUADRADO -----------------

// Para aplicar a implementação:
public class Quadrado implements InterfaceFormaGeo{
    
    @Override
    public String descricaoForma(){
        return "Quadrado";
    }
    
    // Criando a var dos lados das formas
    private double lado;
    
    
    @Override
    public double calculaArea() {
        return lado * lado;
    }
    
    // Criando os métodos Getter and Setter (Alt + Insert)
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
}




// -------------- CRIANDO UMA CLASSE CÍRCULO -----------------

public class Circulo implements InterfaceFormaGeo {
    
    private double raio;
    
    @Override
    public String descricaoForma(){
        return "Circulo";
    }
    
    // Método para calcular a área do círculo
    // Fórmula:     A = pi * (r * r)
    
    @Override
    public double calculaArea(){
        return 3.14 * (raio * raio);
    }

    // Criando os métodos Getter and Setter (Alt + Insert)
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
}


// ----------------- CRIANDO AS INSTÂNCIAS -----------------------------

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programoo;

import formasgeometricas.Circulo;
import formasgeometricas.ImprimirFormas;
import formasgeometricas.Quadrado;

/**
 *
 * @author thami
 */
public class TestaFormaGeometrica {
   
    public static void main(String[] args) {
        
        // Definindo valores para as var
        Quadrado q = new Quadrado();
        q.setLado(10);
        
        Circulo c = new Circulo();
        c.setRaio(2.4);
        
        // Criando uma instância de imprimir formas
        ImprimirFormas imp = new ImprimirFormas();
        imp.imprimir(q);
        imp.imprimir(c);
    }
}




// ----------- CRIANDO UM MÉTODO PARA IMPRIMIR OS DADOS ---------------------

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formasgeometricas;

/**
 *
 * @author thami
 */

public class ImprimirFormas {
    // Criando um método para imprimir as informações de uma forma geometrica (polimorfismo)
    // POLIMORFISMO = usar o mesmo elemento de formas diferentes
    
    // Ao definir um parâmetro do tipo FG, siginifica ser possível receber qualquer classe que Implemente a interface "InterfaceFormaGeo"
    public void imprimir(InterfaceFormaGeo fg){
        System.out.println("Forma Geométrica: " + fg.descricaoForma());
        System.out.println("Área: " + fg.calculaArea());
        System.err.println("-----------------------------------");
    }
}

