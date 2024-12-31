import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        /*
        20.	Popule um array de Strings (n1) com cinco nomes.
        Popule um array de int (v1) com valores (entre 0 e 10).
        O valor v1[x] corresponde ao nome n1[x].
        Seu programa deverá imprimir quem tem a maior nota (nome:valor).
        */
        Scanner sc = new Scanner(System.in);

        String[] arrString =new String[5];
        for (int i = 0; i < arrString.length; i++) {
            System.out.print("digite um nome: ");
            arrString[i] = sc.nextLine();
        }

        System.out.println("\n-------------\n");

        int[] arrInt = new int[5];
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("digite um valor: ");
            arrInt[i] = sc.nextInt();
            if(arrInt[i] >=0 && arrInt[i] <= 10) {
                continue;
            } else {
                System.err.println("fora do range");
               break;
            }
        }

            int[] arrInfo = new int[5];
        for (int i = 0; i < arrInfo.length ; i++) {
            System.out.println("nome:"+arrString[i] +" : "+"valor:"+arrInt[i]);
        }

        System.out.println("\n-------------\n");
        int maior = arrInt[0];
        String nomeMaior = arrString[0];

        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] > maior) {
                maior = arrInt[i];
                nomeMaior = arrString[i];
            }

        }
        System.out.println("( nome:"+nomeMaior +" : "+"valor:"+ maior+" )");
    }
}
