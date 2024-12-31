import java.util.Random;

public class Array16 {
    public static void main(String[] args) {
        /*
16.	Criar um programa que irá:
•	Criar um array com 10 posições;
•	Popular com números aleatórios (int).
•	Imprimir o array (os números devem estar em uma única linha)
•	Para cada número menor com 50, substituir por 0.
•	Para cada número maior ou igual a 50, substituir por 1.
•	Imprimir o array (os números devem estar em uma única linha)

*/

        int[] arrInt = new int[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = new Random().nextInt(100+1);
            System.out.print(arrInt[i] + " ");
        }

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] > 50) {
                arrInt[i] = 1;
            }
           else {
                arrInt[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }


    }
}
