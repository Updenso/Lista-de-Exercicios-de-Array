public class Array9 {
    public static void main(String[] args) {
        /*9.Criar um programa que irá imprimir a potência de 2 dos números presentes em um array
        já preenchido com 5 números do tipo int.
        Para o array [2,4,5,2,-1] a saída será: 4 16 25 4 1
        */

        double[] arrDouble = {2,4,5,2,-1};

        for (int i = 0; i < arrDouble.length; i++) {
            System.out.print(arrDouble[i]+ " ");
        }
        System.out.println();

        for (int i = 0; i < arrDouble.length; i++) {
            arrDouble[i] = Math.pow(arrDouble[i],2);
            System.out.print(arrDouble[i]+ " ");
        }
    }
}
