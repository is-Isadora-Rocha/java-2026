package matriz_arrays;

import java.util.Arrays;

public class alterarArrai {
    static void zerar(int[] arr){  //dar acesso ao mesmo array por outro nome
        arr[0] = 0; //altera o array
    }

    static void trocar(int[] arr2) {
        arr2 = new int[]{0, 0, 0};
    }

    public static void main(String[] args) {
        int[] notas = {8, 6, 9};

        zerar(notas); // é como se rodasse: int[] arr = notas;
        System.out.println(notas[0]); // {0} (mudou a psoição 0 do array original)  - exibe somente a primeira posição

        trocar(notas);
        System.out.println(Arrays.toString(notas)); //exibe o array inteiro

        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 99;
    }
}
