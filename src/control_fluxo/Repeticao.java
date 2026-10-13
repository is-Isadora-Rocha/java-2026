package control_fluxo;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        // for (inicialização ; condição ; atualização)
        for (int i = 0; i < 5; i++){ //enquanto var i for menor que 5, add +1
            System.out.println("Volta numero " + i); //0 a 4
        }

        //regressiva
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        // de 2 em 2
        for (int i = 0; i <= 10; i += 2){
            System.out.print(i);
        }

        // de 1 a 100
        int soma = 0;
        for (int i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.println(soma);

        //ARRAY
        int [] notas = {8, 6, 9, 7};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + i + ": " + notas[i]);
            /*
            *   Nota 0: 8
                Nota 1: 6
                Nota 2: 9
                Nota 3: 7
                * */
        }
        // para cada nota dentro de notas
        for (int nota : notas) {
            System.out.println(nota); // 8 6 9 7
        }

        List<String> nomes = List.of("Ana", "Bia", "Caio");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //ANINHADOS
        for (int linha = 1; linha <= 3; linha++){
            for (int coluna = 1; coluna <= 3; coluna++){
                System.out.print(linha * coluna + "\t");
            }
            System.out.println();
            /*
            *   1	2	3
                2	4	6
                3	6	9
            * */
        }

        //WHILE - repetir enquanto for verdadeira
        int contador = 0;
        while (contador < 3) {
            System.out.println("Contador: " + contador);
            contador++;
            /*  Contador: 0
                Contador: 1
                Contador: 2*/
        }

        //SORTEIO
        Random sorteio = new Random();
        int num = sorteio.nextInt(10); // 0 a 9
        int tentativas = 1;

        while (num != 7) {
            num = sorteio.nextInt(10);
            tentativas++;
        }
        System.out.println("Saiu o 7 após " + tentativas + " tentativas");

        // DO - WHILE
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - jogar");
            System.out.println("2 - Configurações");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();
        } while (opcao != 0);
        System.out.println("Até logo!");

        //BREAK E CONTINUE
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;   // para tudo
            }
            System.out.println(i); // 1, 2, 3
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;   // pula o 3
            }
            System.out.println(i); // 1, 2, 4, 5
        }


    }
}
