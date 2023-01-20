// Criando uma associação entre classes

// Primeiro, vamos criar a classe "Endereco"

public class Endereco {
    public String rua;
    public String numero;
    public String bairro;
    public String cidade;
    
    public void imprimirEnd(){
        System.out.println("RUA: " + this.rua);
        System.out.println("NÚMERO: " + this.numero);
        System.out.println("BAIRRO: " + this.bairro);
        System.out.println("CIDADE: " + this.cidade);
    }
    
}


// Depois, dentro da classe Cliente iremos criar um atributo associado ao Endereco

    public String nome;
    public String email;
    public String telefone;
    public String status;
    // Criando um atributo associado a class "Endereco"
    public Endereco end;


    // Criando um método para o Cliente (comportamentos)
    public void imprimirDados(){
        System.out.println("###### FICHA DO CLIENTE ######");
        System.out.println("NOME: " + this.nome);
        System.out.println("EMAIL: " + this.email);
        System.out.println("TEL: " + this.telefone);
        System.out.println("STATUS: " + this.status);
        this.end.imprimirEnd(); /* Criando um método também */
    }



// Dentro do ProgramOO:
    public static void main(String[] args) {
        
        // Para criar um novo cliente (já criamos uma class chamada "Cliente", portanto devemos importá-la , clicando na lãmpada ao lado)
        Cliente c1 = new Cliente("Paulo");
        c1.email = "paulo@email.com";
        c1.telefone = "(11)91234-5678";
        // Adicionando endereço
        Endereco end = new Endereco();
        end.rua = "Rua Brasil";
        end.numero = "123";
        end.bairro = "Centro";
        end.cidade = "São Paulo";
        
        // Salvando endereços para os clientes
        c1.end = end;
        c1.imprimirDados();