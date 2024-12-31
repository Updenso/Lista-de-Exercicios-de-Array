import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        /*
12.	Criar um array com 5 nomes de estados brasileiros.
Usuário deverá digitar um nome de estado e se o mesmo estiver no array, o programa retorna “achou”,
caso contrário “não achou”.
*/
        Scanner sc = new Scanner(System.in);
        String[] arrString = new String[5];

        System.out.println("Digite 5 estados brasileiro: ");
        for (int i = 0; i < arrString.length; i++) {
            System.out.print("Estado " + (i + 1) + ": ");
            arrString[i] = sc.nextLine();
        }

        System.out.println("Digite e verifique se o estado esta presente no array: ");
        String verificarEstado = sc.nextLine();
        boolean encontrar = false;

        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].equalsIgnoreCase(verificarEstado)) {
                encontrar = true;
                break;
            }
        }

        if (encontrar) {
            System.out.println("Achou!");
        } else {
            System.out.println("Não achou!");
        }
        sc.close();
    }
}
