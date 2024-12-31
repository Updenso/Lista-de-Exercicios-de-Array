import java.util.Scanner;

public class Array32 {
    public static void main(String[] args) {
        /*
32.	Criar um programa para ler o nome e a altura de 5 pessoas e
 em seguida escreva o nome do aluno mais baixo. (DICA: use dois arrays)
         */
        Scanner sc = new Scanner(System.in);

        String[] nome = {"felipe","Karla","Maya","Jade","Osiris"};
        float[] altura = {1.66f,1.79f,1.84f,1.65f,1.77f};



        System.out.println();

        for (String iNome : nome) {
            System.out.print(iNome + " ");
        }
        System.out.println();

        for (float iAltura : altura) {
            System.out.print(iAltura + " ");
        }

        //--------------------------------------------
        float menor = Integer.MAX_VALUE;
        String nomeDoMenor = "";

        for (int i = 0; i < altura.length; i++) {
            for (int j = 0; j < nome.length; j++) {
                if (altura[i] < menor) {
                    menor = altura[i];
                    nomeDoMenor = nome[i];
                }
            }
        }
        System.out.println("\n\nNome do menor: "+ nomeDoMenor);
        System.out.println("Altura do menor: "+ menor);


    }
}
