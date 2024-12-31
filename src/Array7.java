public class Array7 {
    public static void main(String[] args) {
/*
7.	Criar um programa que irá popular (comando for, while ou do while)
apenas com números pares um array de inteiros com 100 posições.
O resultado final deve ser: 2 4 6 8 .... O programa deverá também imprimir o resultado.
*/
        int[] arrInt = new int[100];
        for (int i = 0; i < arrInt.length; i++) {
           arrInt[i] = (1 + i)* 2;
           System.out.print(arrInt[i]+ " ");
            }


    }
}
