import java.util.Random;

public class Array22 {
    public static void main(String[] args) {
        /*
        22.	Criar um programa que irá popular (aleatório) um array (a1) com 20 posições.
        Criar e popular um outro array (a2) contendo os valores das posições pares de a1.
        Criar e popular um outro array (a3) contendo os valores das posições ímpares de a1.
        Imprimir a1, a2 e a3 (uma linha por array).
        */
        System.out.println("\n---------------Normal---------------");
        int[] arr1 = new int[20];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new Random().nextInt(100);
            System.out.print("["+i+ "]: "+arr1[i] + " ");
        }

        System.out.println("\n--------------Pares----------------");

        int[] arr2 = new int[arr1.length];
        int pares = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] % 2 ==0) {
                arr2[i] = arr1[i];
                pares = i;
                System.out.print("\nindice par["+ pares+"]: "+ arr2[i] + " ");
            }
        }

        System.out.println("\n-------------Impares-----------------");

        int[] arr3 = new int[arr1.length];
        int impar =0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr3[i] = arr1[i];
                impar = i;
                System.out.print("\nindice par["+ impar+"]: "+arr3[i] + " ");
            }
        }

    }
}
