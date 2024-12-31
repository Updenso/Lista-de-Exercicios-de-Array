import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        /*
14.	Criar um programa que irá procurar um número (informado pelo usuário) em um array
 (10 posições, já preenchido e com repetições). Se achar, mostrar quis as posições.
         */
        Scanner sc = new Scanner(System.in);
        int[] arrInt = new int[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[0] = 2;
            arrInt[1] = 4;
            arrInt[2] = 6;
            arrInt[3] = 3;
            arrInt[4] = 52;
            arrInt[5] = 1;
            arrInt[6] = 9;
            arrInt[7] = 14;
            arrInt[8] = 2;
            arrInt[9] = 46;
            System.out.print(arrInt[i] + " ");
        }

        System.out.println("\nDigite quantas tentativas: ");
        int tentativas = sc.nextInt();
        boolean encontrar = false;

        for (int j = 0; j < tentativas; j++) {

            System.out.println("\nDigite um numero verifique se esta no array: ");
            int verificarNumero = sc.nextInt();
            encontrar = false;

            for (int i = 0; i < arrInt.length; i++) {
                if (verificarNumero == arrInt[i]) {
                    System.out.println("Número encontrado na posição: " + i);
                    encontrar = true;
                    break;
                }
            }
            if (!encontrar) {
                System.out.println(" Não encontrou");
            }
        }


    }
}
