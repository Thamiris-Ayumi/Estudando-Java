// Criando variáveis no java

public class TestaVariaveis {

    public static void main(String[] args){
        System.out.println("Olá, novo teste!");

        // Declarando variáveis do tipo INT (inteiro)
        int idade;

        idade = 18;

        System.out.println(idade);
        // ln = pula linha


        // Utilizando operadores matemáticos na variável já existente
        idade = 30 + 10;
        System.out.println(idade);

        idade = 10 + (20*2);
        System.out.println(idade);


        // Adicionando a variável à string (precisa usar o sinal de +)
        System.out.println("A idade é " + idade + ", parabéns!");

    }

}





public class TestaPontoFlutuante {

    public static void main(String[] args){

        // Declarando variáveis do tipo DOBLE (ponto flutuante / número decimal)
        double salario;
        salario = 1250.70;

        System.out.println("Meu salário é " + salario);


        // Efetuando uma operação matemática
        double divisao = 3.14 / 2;

        System.out.println(divisao);

    }
}






//  Exemplo de erro comum:
    int brindes = 15;
    int pessoas = 2;
    System.out.println(brindes / pessoas);

    (Resultado = 7.5) = Errado


// Este código é o errado.
// Pois quando fazemos operações entre inteiros o resultado SEMPRE será INTEIRO e não de ponto flutuante.
// O resultado na verdade seria 7.







// Adaptando um valor double para int
public class TestaConversao {

    public static void main(String[] args){
        double salario = 1270.50;   
        int valor = (int) salario;

        System.out.println(valor);
    }
}



// Trabalhando com caracteres
public class TestaCaracteres {

    public static void main(String[] args){
        // O char guarda apenas um ÚNICO caractere  
        char letra = 'a';

        System.out.println(letra);


        // Utilizando String (precisa de aspas duplas)
        String frase = "Cursos online de tecnologia";
        System.out.println(frase);

    }
}


