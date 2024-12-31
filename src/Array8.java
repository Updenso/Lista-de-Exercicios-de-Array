import java.util.Random;

public class Array8 {
    public static void main(String[] args) {
        /*
         8.	Criar um programa que irá calcular a média aritmética de um array já preenchido com 5 números do tipo float
        */
        float[] arrFloat = new float[5];
        float soma = 0;
        float media;

        for (int i = 0; i < arrFloat.length; i++) {
            arrFloat[i] = new Random().nextFloat(10);
            System.out.print(arrFloat[i]+ " ");
            soma += arrFloat[i];
        }
        System.out.println();
        media = soma / arrFloat.length;
        System.out.printf("Media: %.2f", media);
    }
}
