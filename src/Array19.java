import java.util.Random;

public class Array19 {
    public static void main(String[] args) {
        /*
        19.	Criar um programa que irá mostrar a quantidade de números ímpares
        e também a soma dos mesmos em um array (10 posições e já preenchido).
        Programa deve também imprimir o array.
        */

        int[] arrInt = new int[10];
        int contador= 0;
        int somar=0;

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = new Random().nextInt(100);
            System.out.print(arrInt[i] + " ");
        }

        System.out.println("\n-------------\n");
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                contador++;
                somar += arrInt[i];
            }
        }
        System.out.println("quantidade de numeros impares: "+ contador+"\na soma dos impares: " +somar);
    }
}
