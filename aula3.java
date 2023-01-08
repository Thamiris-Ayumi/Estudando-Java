// Utilizando condicionais IF / ELSE

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else {
            if(quantidadePessoas >= 2) {
                System.out.println("você não tem 18, mas " + "pode entrar, pois está acompanhado");
            } else {
                System.out.println("infelizmente você não pode entrar");
            }
        }
    }
}






// Utilizando BOOLEAN (só aceita TRUE ou FALSE)

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 16;
        boolean acompanhado = true;

        // Neste caso abaixo, como estávamos utilizando variável boolean, caso o valor de acompanhado seja true, já será válidado
        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}





// Comando SWITCH

// Quando precisamos validar vários ifs ao mesmo tempo, podemos utilizar o switch (uma solução para os ifs encadeados)

// Ele funciona assim:
switch (variavelASerTestada) {
    case opção1:
            // comando(s) caso a opção 1 tenha sido escolhida
            break;
    case opção2:
            // comando(s) caso a opção 2 tenha sido escolhida
            break;
    case opção3:
            // comando(s) caso a opção 3 tenha sido escolhida
            break;
    default:
            // comando(s) caso nenhuma das opções anteriores tenha sido escolhida
}




// Um exemplo de funcionamento para imprimir o nome do mês:

public class TestaMes {

    public static void main(String[] args) {

        int mes = 10;

        switch (mes) {
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                System.out.println("O mês é Maio");
                break;
            case 6:
                System.out.println("O mês é Junho");
                break;
            case 7:
                System.out.println("O mês é Julho");
                break;
            case 8:
                System.out.println("O mês é Agosto");
                break;
            case 9:
                System.out.println("O mês é Setembro");
                break;
            case 10:
                System.out.println("O mês é Outubro");
                break;
            case 11:
                System.out.println("O mês é Novembro");
                break;
            case 12:
                System.out.println("O mês é Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}




// O break irá interromper a execução do caso que o contém, para as outras condições não serem analisadas e executadas.

// Se nenhuma condição for aceita, o código do default é que será executado. Por exemplo, se o mês for 13, a impressão será Mês inválido.
