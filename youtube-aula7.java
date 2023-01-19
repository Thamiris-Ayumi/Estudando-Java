/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author thami
 */




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
    public String status;
    
    
// --------------- CONSTRUTOR DA CLASSE -----------------------------------------------------------------------
    // Este é o CONSTRUTOR DA CLASSE
    // O código do construtor é executado automaticamente, sempre que uma nova instância (new) é criada.
    // O construtor define o estado inicial do objeto.

    public Cliente(String nome){
        // Portanto, a partir de agora todos os clientes terão um nome obrigatoriamente e estarão ativos
        
        this.nome = nome;
        this.status = "Ativo"; // Isso significa que todos os novos clientes criados estão no estado ativo
    }
    
   // Criando um método para o Cliente (comportamentos)
    public void imprimirDados(){
        System.out.println("###### FICHA DO CLIENTE ######");
        System.out.println("NOME: " + this.nome);
        System.out.println("EMAIL: " + this.email);
        System.out.println("TEL: " + this.telefone);
        System.out.println("STATUS: " + this.status);
    }
    
   // Coloque o tipo de variável que o método irá retornar (int, double, boolean)
   // Caso não retorne NADA, coloque VOID     

   // This - chamar algo da própria classe
   
}
