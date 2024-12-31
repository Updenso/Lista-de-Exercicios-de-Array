import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        /*
29.	Faça um programa para corrigir uma prova com 10 questões de múltipla escolha (a, b, c, d ou e).
Cada questão vale 1 ponto. Leia o gabarito e para cada aluno (cada aluno é igual a um array,
pode considerar no máximo três alunos). Calcule e escreva:
•	Para cada aluno, escreva suas respostas e sua nota.
•	Se foi aprovado ou não. Assumir média >= 7.0 para ser aprovado.
         */
        Scanner sc = new Scanner(System.in);

        String[] aluno = new String[3];
        char[] gabarito = {'a', 'a', 'c', 'd', 'e', 'a', 'b', 'c', 'b', 'e'};
        char[] respostasAluno = new char[10];

        for (int i = 0; i < respostasAluno.length; i++) {
            System.out.print("Questão "+(i+1)+ ": ");
                respostasAluno[i] = sc.next().toLowerCase().charAt(0);

                while (respostasAluno[i] < 'a' || respostasAluno[i] > 'e' ) {
                    respostasAluno[i] = sc.next().toLowerCase().charAt(0);
                }
        }

        int pontos = 0;
        for (int i = 0; i < gabarito.length; i++) {
            if (respostasAluno[i] == gabarito[i]) {
                pontos++;

            }
        }

    double media = (double) gabarito.length / pontos *10;
        if (media >= 7) {
            System.out.println("APROVADO");
        }
        else {
            System.out.println("REPROVADO");
        }


        System.out.println("total de pontos tirados na prova: "+ pontos);


    }
}
