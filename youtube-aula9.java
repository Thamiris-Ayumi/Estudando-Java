/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author thami
 */


// Utilizando o método de ENCAPSULAMENTO
// No encapsulamento, o que é importante fica "public" e o que for método fica encapsulado

public class Produto {
    // A partir de agora, sempre vamos criar nossas classes com os atributos "private" e esses atributos só serão acessados por meio de métodos
    private String codigoDeBarras; // Exemplo: suponha-se que o cód de barras tenha 13 dígitos e precisamos fazer uma validação
    private String NomeProduto;
    private double valor;
    
    // Para acessar os atributos (salvar ou recuperar seus valores), teremos um método "set" e um "get" para cada variável.
    // Para fazer isso, pressione as teclas ALT + INSERT
    // Depois, clique em "Getter and Setter" e selecione todos os campos de Produto
    // Clique em Generate All e automaticamente serão criados os métodos abaixo:

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        // Criando uma validação para o cód de barras
        if (codigoDeBarras.length()== 13){
            this.codigoDeBarras = codigoDeBarras;
        } else {
            System.out.println("O código de barras necessita ter 13 dígitos");
        }
        
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}



//-------------------- DENTRO DO PROGRAMOO-------------------------------------------

// Criando um novo produto com o método de ENCAPSULAMENTO
        Produto p1 = new Produto();
        // Neste caso preciamos utilizar o set pois o atributo estava private
        p1.setCodigoDeBarras("1234567890123");
        p1.setNomeProduto("Notebook");
        System.out.println("Código de Barras: " + p1.getCodigoDeBarras());
        System.out.println("Nome do produto: " + p1.getNomeProduto());