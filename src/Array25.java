import java.util.Random;

public class Array25 {
    public static void main(String[] args) {
        /*
        25.	Criar um programa que irá popular um array de 16 posições.
        Imprima o array. Troque os 8 primeiros valores pelos 8 últimos e vice-e-versa. Imprima o array
        */

        int[] arrInt = new int[16];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = new Random().nextInt(100);
        }
        System.out.println("\nArray original:");
        for (int num : arrInt) {
            System.out.print(num + " ");
        }
        System.out.println();

        int inicio = 0;
        int fim = arrInt.length - 1;
        for (int i = 0; i < 8; i++) {
            int aux = arrInt[inicio + i];
            arrInt[inicio + i] = arrInt[fim - i];
            arrInt[fim - i] = aux;
        }

        System.out.println("Array modificado:");
        for (int num : arrInt) {
            System.out.print(num + " ");
        }
    }
}
