import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        /*
28.	Criar um programa que irá popular um array de N elementos e gerar um outro array com estes N elementos em ordem inversa.
Exemplo: Se X = [10,-3,4,2,80] deverá ser gerado um array Y = [80,2,4,-3,10].
O valor de N deverá ser informado pelo usuário
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digitar N laços de repetições: ");
        int n = sc.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < arrA.length; i++) {
            System.out.print("digite numeros: ");
            arrA[i] = sc.nextInt();
        }
        System.out.println("Array original (X): ");
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arrA.length; i++) {
            arrB[i] = arrA[arrA.length - 1 - i];
        }
        System.out.println("Array reverso (Y): ");
        for (int i = 0; i < arrB.length; i++) {
            System.out.print(arrB[i] + " ");
        }
    }
}
