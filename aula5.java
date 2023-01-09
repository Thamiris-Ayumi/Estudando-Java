// Trabalhando com O.O (Programação Orientada à Objetos)

// Um exemplo de O.O: 
// Trata-se de quando DADO e FUNCIONALIDADE sobre ele andam juntos.

// Quando por exemplo, ao criar um site no qual seja necessário fazer a validação de um campo CPF, 
// essa validação consiga ser feita de forma conjunta enquanto o usuário está digitando o CPF.



// Um exemplo de criação de class:
public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
}
// As variáveis saldo, agencia, numero e titular são chamados de atributos (objetos)

// Ao criar um objeto podemos observar que ele irá possuir esses 4 atributos



// Para criar uma nova conta bancária para o usuário
public class CriaConta {

    public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 200;
    System.out.println(primeiraConta.saldo);
    }
}

// primeiraConta é a variável que se refere a esse novo usuário
// Antes da palavra "saldo" precisamos nos referenciar ao "primeiraConta." para que consiga pegar o saldo referente

public class CriaConta { 
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200; 
        System.out.println(primeiraConta.saldo); 

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);    
        }
}