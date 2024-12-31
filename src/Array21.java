import java.util.Scanner;

public class Array21 {
    public static void main(String[] args) {
        /*
21.	Criar um programa que irá popular um array de N posições.
Usuário irá informar o valor de N (considerar N>0) e na sequência informar os N números.
Após ler os N números o programa deverá percorrer o array e
informar qual é o maior e o menor número digitado e a posição destes números.
Ex: para o array 4,-1,10,45,0 o resultado será:
Maior 45
Posição 3
Menor -1
Posição 1
*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite N laços de repetições: ");
        int n = sc.nextInt();

        if (n <=0) {
            System.out.println("O valor de N deve ser maior que zero.");
            return;
        }

        int[] arrInt = new int[n];
            for (int i = 0; i < arrInt.length; i++) {
                System.out.print("digite numeros para posição ["+ i+"]:");
                    arrInt[i] = sc.nextInt();
            }

            for (int i = 0; i < arrInt.length; i++) {
                System.out.print(arrInt[i] + " ");
            }

            int mairNumero = arrInt[0];
            int posicaoMaior = 0;
            for (int i = 1; i < arrInt.length; i++) {

                if (arrInt[i] > mairNumero) {
                    mairNumero = arrInt[i];
                    posicaoMaior = i;
                }
            }
            System.out.println("\nMaior numero: "+ mairNumero);
            System.out.println("\nPosição do maior número: [" + posicaoMaior+"]");

    }
}
