import java.util.Random;
import java.util.Scanner;

public class Array34 {
    public static void main(String[] args) {
        /*
34.	Criar um programa que irá ler 2 arrays X e Y de N elementos cada um.
Intercale os elementos desses 2 arrays formando assim, um novo array Z de 2N elementos.
Exemplo: Se X = 3,5,2,8,4 e Y = 1,7,6,5,2, então Z = 3,1,5,7,2,6,8,5,4,2. Imprimir os arrays X, Y e Z.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("digite N laços de repetição: ");
        int n = sc.nextInt();

        int[] arrX = new int[n];
        int[] arrY = new int[n];
        int[] arrZ = new int[arrX.length + arrY.length];

        System.out.println("ARRAY - X");
        for (int i = 0; i < arrX.length; i++) {
            arrX[i] = new Random().nextInt(10);
        }
            for (int x : arrX) {
                System.out.print(x + " ");
            }
        System.out.println();
        System.out.println("ARRAY - Y");
        for (int i = 0; i < arrY.length; i++) {
            arrY[i] = new Random().nextInt(10);
        }
        for (int y : arrY) {
            System.out.print(y + " ");
        }

        System.out.println();

        System.out.println("ARRAY DUPLO");
        for (int i = 0; i < arrX.length; i++) {
            arrZ[i] = arrX[i];
            for (int j = 0; j < arrY.length; j++) {
                arrZ[i + arrX.length] = arrY[i];
            }
        }

        for (int i = 0; i < arrZ.length; i++) {
            System.out.print(arrZ[i] + " ");
        }





    }
}
