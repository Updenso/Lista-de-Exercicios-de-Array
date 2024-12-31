import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
        /*
30.	Criar um programa para:
•	Ler uma String
•	Copiar seu conteúdo (invertido) para um vetor. Dica: utilizar o método charAt(i) presente na classe String.
•	Imprimir o novo array
•	Exemplo: para a entrada “teste” a saída deverá ser “etset”
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva uma palavra: ");
        String originalStr = sc.nextLine();
        String invertido = "";
        System.out.println("palavra original: " + originalStr);

        for (int i = 0; i < originalStr.length(); i++) {
            invertido = originalStr.charAt(i) + invertido;
        }

        System.out.println("palavra invertida: "+ invertido);
    }
}
