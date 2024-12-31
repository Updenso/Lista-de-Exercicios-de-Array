public class Array6 {
    public static void main(String[] args) {
/*
6.	Criar um programa que irá popular (comando for, while ou do while) um array de inteiros com 10 posições.
O resultado final deve ser: 10 20 30 40 50 60 70 80 90 100.
O programa deverá também imprimir o resultado.
*/
        int[] arrInt = new int[10];
        for (int i = 0; i < arrInt.length ; i++) {
           arrInt[i] = (i+ 1)* 10;

           System.out.print(arrInt[i] + " ");
        }

    }
}
