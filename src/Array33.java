import java.util.Scanner;

public class Array33 {
    public static void main(String[] args) {
        /*
        33.	Criar um programa que irá gerar um array com a sequência de Fibonacci até um número N.
        A sequência de Fibonacci, é uma sequência de números inteiros, começando por 1 e 1, na qual,
        cada termo subsequente corresponde à soma dos dois anteriores.
        Ex: para N=7, o resultado será: 1, 1, 2, 3, 5, 8, 13
        */
Scanner sc = new Scanner(System.in);
        System.out.print("digite N sequencias fibonacci:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("N deve ser maior que 0.");
        } else {
            int[] fibonacci = new int[n];

            // Definindo os dois primeiros valores da sequência
            if (n >= 1) fibonacci[0] = 1;
            if (n >= 2) fibonacci[1] = 1;

            // Preenchendo o restante do array com a lógica de Fibonacci
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            // Exibindo a sequência
            System.out.println("Sequência de Fibonacci:");
            for (int num : fibonacci) {
                System.out.print(num + " ");
            }
        }

    }
}
