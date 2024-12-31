import javax.lang.model.type.IntersectionType;
import java.util.Random;
import java.util.Scanner;

public class Array31 {
    public static void main(String[] args) {
        /*
31.	Criar um programa para ler dois arrays de inteiros X e Y, cada um com 5 elementos.
Calcular e mostrar os arrays resultantes em cada caso abaixo:
•	Diferença entre X e Y: todos os elementos de X que não estão em Y. Cuidado: não é subtração de números.
•	Interseção entre X e Y: apenas os elementos que aparecem nos dois vetores
         */
    int[] arrX = new int[5];
    int[] arrY = new int[5];
        System.out.println("array X");
        for (int i = 0; i < arrX.length; i++) {
            arrX[i] = new Random().nextInt(10)+1;
            System.out.print(arrX[i] + " ");
        }

        System.out.println("\n array Y");

        for (int i = 0; i < arrY.length; i++) {
            arrY[i] = new Random().nextInt(10)+1;
            System.out.print(arrY[i] + " ");
        }

        System.out.print("\nInterseção\n");

        for (int i = 0; i < arrX.length; i++) {
            for (int j = 0; j < arrY.length; j++) {
                if (arrX[i] == arrY[i]) {
                    System.out.print(arrX[i] + " ");
                    break;
                }
            }
        }

        System.out.print("\nDiferença\n");

        for (int i = 0; i < arrX.length; i++) {
            boolean verificar =false;
            for (int j = 0; j < arrY.length; j++) {
                if (arrX[i] == arrY[i]) {
                    verificar = true;
                    break;
                }
            }
            if (!verificar) {
                System.out.print(arrX[i] + " ");
            }
        }

    }
}
