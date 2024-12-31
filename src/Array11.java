import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
/*
11.	Altere o exercício anterior, para que o programa imprima a soma e o produto dos elementos do array.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite N vezes que um numero será lido:");
        int n = sc.nextInt();
        int[] arrInt = new int[n];
        int soma = 0;

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Digite os numeros: ");
            arrInt[i] = sc.nextInt();

            soma = soma + arrInt[i]; // novo soma = antigo soma + vetor preenchido por numeros digitados pelo usuario
        }

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }

        System.out.println("\nSoma: "+ soma);
    }
}
