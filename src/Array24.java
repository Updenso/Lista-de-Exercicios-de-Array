import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        /*
        24.	Criar um programa para preencher um array com N posições
        (usuário deverá informar N números) e verificar se existem valores iguais. Se sim, escreva-os.
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite N laços de repetição: ");
        int n = sc.nextInt();
        int[] arrInt = new int[n];

        // Preencher o array
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Digite um número: ");
            arrInt[i] = sc.nextInt();
        }

        // Verificar duplicados
        boolean temDuplicados = false;
        System.out.println("\nValores duplicados encontrados:");

        for (int i = 0; i < arrInt.length; i++) {
            for (int j = i + 1; j < arrInt.length; j++) {
                if (arrInt[i] == arrInt[j]) {
                    System.out.println("Valor duplicado: " + arrInt[i]);
                    temDuplicados = true;
                    break;
                }
            }
        }

        if (temDuplicados != true) {
            System.out.println("Nenhum valor duplicado encontrado.");
        }
    }
}
