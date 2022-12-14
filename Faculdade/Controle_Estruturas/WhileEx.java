package Controle_Estruturas;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota, media;
        int somaNota = 0;
        int quantidadeNota = 0;
        int sair = 0;

        while(sair != -1) {
            System.out.print("Digite uma nota: ");
            nota = in.nextInt();

            if(nota <= 10 && nota >= 0) {
                somaNota = nota + somaNota;
                quantidadeNota++;
            } else {
                System.out.println("Nota inválida...");
            }
            System.out.print("Digite -1 para sair: ");
            sair = in.nextInt();
        }
        media = somaNota/quantidadeNota;
        System.out.println("O total das notas somadas: "+somaNota);
        System.out.println("Quantidade de notas: "+quantidadeNota);
        System.out.println("Média das notas da sala: "+media);

        in.close();
    }
}
