import java.util.Random;
import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        /*
26.	Criar um programa que irá popular (entre 1 e 50) um array com N números
(N>0 e informado pelo usuário) e determinar a porcentagem de números maiores ou iguais a 25
 e a porcentagem de números menores que 25.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite N laços de repetição: ");
        int n = sc.nextInt();
        if (n <= 0) {
            return;
        }
        int[] arrInt = new int[n];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = new Random().nextInt(50) + 1;
            System.out.print(arrInt[i] + " ");
        }

        double contarMaior = 0, contarMenor = 0;

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] >= 25) {
                contarMaior++;
            } else {
                contarMenor++;
            }
        }

        double porcentoMaior = (contarMaior /n) * 100;
        double porcentoMenor = (contarMenor / n) * 100;
        System.out.println("\nPorcentagem dos maiores: " + porcentoMaior / 100 +"%");
        System.out.println("Porcentagem de menores: " + porcentoMenor /100 +"%");
    }
}
