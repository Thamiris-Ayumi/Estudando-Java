// Utilizando WHILE e contador

public class TestaWhile {

    public static void main(String[] args) {
        int contador = 0;

        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }
        
        System.out.println(contador);

    }
}

// O resultado será esse:
0
1
2
3
4
5
6
7
8
9
10





// Testando SOMATÓRIAS com while:

// Neste caso, ele irá somar o número atual com o próximo 

public class TestaSomatoria {

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while(contador <= 10) {
            total = total + contador;
            contador++;
        }
        
        System.out.println(total);
    }
}


// O resultado será esse:
0
1
3
6
10
15
21
28
36
45
55



// Utilizando FOR

public class TestaFor {

    public static void main(String[] args) {
        for(int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }
    }
}


// O resultado será esse:
0
1
2
3
4
5
6
7
8
9
10




// Criando TABUADA do 1 ao 10:

public class Tabuada {

        public static void main(String[] args) {
            for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                for(int contador = 0; contador <= 10; contador++) {
                    System.out.print(multiplicador * contador);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
}



// O resultado será esse:
0 1 2 3 4 5 6 7 8 9 10
0 2 4 6 8 10 12 14 16 18 20
0 3 6 9 12 15 18 21 24 27 30
0 4 8 12 16 20 24 28 32 36 40
0 5 10 15 20 25 30 35 40 45 50
0 6 12 18 24 30 36 42 48 54 60
0 7 14 21 28 35 42 49 56 63 70
0 8 16 24 32 40 48 56 64 72 80
0 9 18 27 36 45 54 63 72 81 90
0 10 20 30 40 50 60 70 80 90 100
