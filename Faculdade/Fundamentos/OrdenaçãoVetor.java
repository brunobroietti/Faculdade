package Facul;

import java.util.Scanner;

public class OrdenaçãoVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor;
        int tamanho, aux;

        System.out.println("Informe o tamanho do vetor: ");
        tamanho = in.nextInt();

        vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira um elemento no vetor: ");
            vetor[i] = in.nextInt();
        }

        // Ordenação crescente do vetor.
        for (int j = 0; j < tamanho; j++) {
            for (int i = 0; i < tamanho - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
        tamanho--;
    }

        System.out.println("Elementos ordenados.");
        // Laço de repetição para exibir vetor ordenado.
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
