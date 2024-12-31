import java.util.Random;

public class Array18 {
    public static void main(String[] args) {
        /*
18.	Criar um programa que:
•	Crie e popule dois arrays (a1 e a2) de cinco posições com números aleatórios.
•	Imprima estes dois arrays (uma linha por array)
•	Crie e popule um terceiro array a3 na qual a3[x] = a1[x]+a2[x];
•	Imprima a3 (em uma única linha)
        */

        int[] arrIntA = new int[5];

        for (int i = 0; i < arrIntA.length; i++) {
            arrIntA[i] = new Random().nextInt(10);
            System.out.print(arrIntA[i]+ " ");
        }

        System.out.println("\n--------------\n");

        int[] arrIntB = new int[5];
        for (int i = 0; i < arrIntB.length; i++) {
            arrIntB[i] = new Random().nextInt(10);
            System.out.print(arrIntB[i] + " ");
        }

        System.out.println("\n--------------\n");

        int[] arrIntC = new int[5];
        for (int i = 0; i < arrIntC.length; i++) {

            arrIntC[i] = arrIntA[i] + arrIntB[i];
            System.out.print(arrIntC[i] + " ");
        }

    }
}
