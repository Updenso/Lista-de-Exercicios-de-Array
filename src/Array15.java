import java.util.Random;

public class Array15 {
    public static void main(String[] args) {
        /*
15.	Criar um programa que irá:
•	Criar um array com 10 posições;
•	Popular com números aleatórios (int).
•	Imprimir o array (os números devem estar em uma única linha)
•	Para cada número ímpar, substituir com o próximo número par.
•	Imprimir o array (os números devem estar em uma única linha)
      */
        int[] arrInt = new int[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = new Random().nextInt(10);
            System.out.print(arrInt[i] + " ");

        }

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0 ){
                arrInt[i] = arrInt[i] +1;
            }
        }
        System.out.println();
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]+ " ");
        }
    }
}
