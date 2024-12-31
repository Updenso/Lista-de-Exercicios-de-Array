import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
/*
    10.	Criar um programa que irá perguntar ao usuário a quantidade de números que será lido.
Após essa leitura, o programa deverá construir e inicializar um array com N posições.
O programa ainda deverá perguntar N vezes ao usuário para digitar um número.
Cada número digitado deverá preencher uma posição do array. Ao final, o programa deverá imprimir o array.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite N vezes que um numero será lido:");
        int n = sc.nextInt();

        int[] arrInt = new int[n];

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Digite os numeros: ");
            arrInt[i] = sc.nextInt();
        }

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }
    }
}
