import java.util.Random;

public class Array17 {
    public static void main(String[] args) {
        /*
        17.	Criar um programa que irá popular um array com  10 posições com números ímpares (1 3 5 7 ...)
         e depois imprima este array de forma inversa.
        */
        int[] arrInt = new int[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = 2 * i + 1;
            System.out.print(arrInt[i]+ " ");
        }

        System.out.println("\n--------------\n");

        for (int i = arrInt.length - 1; i >= 0; i--) {
            System.out.print(arrInt[i] + " ");
        }
    }
}
