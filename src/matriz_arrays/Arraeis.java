package matriz_arrays;

import java.util.Arrays;

public class Arraeis {
    public static void main(String[] args) {

        // type [] variablaName = new type [size];

        // com valores
        int[] notas = {8, 6, 9, 7};
        String[] nomes = {"Ana", "Bia", "Caio"};

        //o tamanho
        int[] notas2 = new int[4];  // [0, 0, 0, 0]

        System.out.println(notas[0]);
        System.out.println(notas[3]);

        notas[1] = 10; //altera: {8, 10, 9, 7}

        System.out.println(notas.length); //length - String: length() - List: size()

        // percorrendo arrays: precisa do indice
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posição " + i + ": " + notas[i]);
            /*
            Posição 0: 8
            Posição 1: 10
            Posição 2: 9
            Posição 3: 7
             */
        }
        // for-each: somente os valores
        for (int nota : notas) { // variavel é uma copia, alterar a var nota não muda o array
            System.out.println(nota); //8, 10, 9, 7
        }

        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        double media = (double) soma / notas.length;
        System.out.println(media);

        //ARRAYS SÃO REFERÊNCIAS
        int[] a = {1, 2, 3};
        int[] b = a;
        // variavel b aponta para o mesmo array da variavel a
        // b é o nome alternativo

        //COMO COPIAR DE VERDADE
        int[] b2 = Arrays.copyOf(a, a.length); // nova "casa" com cópia dos valores

        b[0] = 99;
        System.out.println(a[0]); //1
        System.out.println(b2[0]); //99

    }
}
