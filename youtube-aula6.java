// ------------------- HERANÇA ---------------------------------

// Herança é a capacidade de uma classe para herdar atributos e métodos de outras classes
// Exemplo, neste caso, criamos outras 2 classes de cliente, pois o cliente físico utiliza CPF e o jurídico utiliza CNPJ

// Neste contexto a classe "Cliente" será a super classe e "ClienteFisico" e "ClienteJuridico" são sub classes
// Portanto, todos os atributos "public"/"protected" e todos os métodos da classe-mãe serão herdadaos pelas classes-filhas


// Para criar a herança entre classes basta adicionar "extends" + nome classe-mãe
public class ClienteFisico extends Cliente {
    
    public String cpf;
    
    @Override //Esta anotação significa que ele sobrescreve um método anterior (para adicionar basta clicar na lâmpada)
    public void imprimirDados(){
        // Use o "this" para imprimirDados da classe-filha
        // Use o "super" para imprimirDados da classe-mãe
        
        
        // Chamando o método da classe-mãe
        super.imprimirDados();
        System.out.println("CPF: " + this.cpf);
    }
    
}


public class ClienteJuridico extends Cliente {
    public String cnpj;
    
    @Override //Esta anotação significa que ele sobrescreve um método anterior (para adicionar basta clicar na lâmpada)
    public void imprimirDados(){
        // Use o "this" para imprimirDados da classe-filha
        // Use o "super" para imprimirDados da classe-mãe
        
        
        // Chamando o método da classe-mãe
        super.imprimirDados();
        System.out.println("CNPJ: " + this.cnpj);
    }
}





// ----------------- DENTRO DO PROGRAMOO -------------------------------------------

        // Criando um novo cliente físico (lembre-se de importar a classe ClienteFisico
        ClienteFisico cf1 = new ClienteFisico();
        cf1.nome = "Pedro";
        cf1.email = "pedro@email.com";
        cf1.telefone = "(11)0123-4567";
        cf1.cpf = "111.222.333-44";
        
        // Criando um novo cliente jurídico (lembre-se de importar a classe ClienteJuridico
        ClienteJuridico cj1 = new ClienteJuridico();
        cj1.nome = "Empresa 1";
        cj1.email = "empresa1@email.com";
        cj1.telefone = "(11)0123-4567";
        cj1.cnpj = "111.222.333/0001-11";
        
        
        // Para imprimir dados já com os dados cpf e cnpj sobrescritos:
        cf1.imprimirDados();
        cj1.imprimirDados();



