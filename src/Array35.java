import java.util.Random;

public class Array35 {
    public static void main(String[] args) {
        /*
35. Criar um programa que irá popular um array com 10 elementos inteiros.
O programa deverá imprimir este array, ordenar o array e imprimir novamente.
DICA: pesquisa pelo método de ordenação Bubble Sort.
         */

        int[] bubble = new int[10];

        System.out.println("Array Desordenado");
        for (int i = 0; i < bubble.length; i++) {
            bubble[i] = new Random().nextInt(50);
            System.out.print(bubble[i] + " ");
        }

        System.out.println("\nArray Ordenado");
        for (int i = 0; i < bubble.length; i++) {
            for (int j = i+1; j < bubble.length; j++) {
                if (bubble[i] > bubble[j]) {
                    int auxiliar = bubble[i];
                    bubble[i] = bubble[j];
                    bubble[j] = auxiliar;
                }
            }
        }

        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i] + " ");
        }

    }
}
