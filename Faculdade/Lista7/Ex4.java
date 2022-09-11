/*
   Faça um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a união entre
os 2 vetores anteriores, ou seja, que contém os números dos dois vetores. Não deve conter
números repetidos.
 */
package Facul.Lista7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int cont;
        ArrayList<Integer> vet3 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe  o valor do vetor 1 na posicao "+i);
            vet1[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe  o valor do vetor 2 na posicao "+i);
            vet2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            cont = 0;
            for (int j = 0; j < 10; j++){
                if (vet1[i] == vet2[j]){
                    cont++;
                }
            }
            if (cont == 0){
                vet3.add(vet1[i]);
            }
        }

        for(int i = 0; i < 10; i++) {
            cont = 0;
            for(int j = 0; j < 10; j++) {
                if(vet2[i] == vet1[j]) {
                    cont++;
                }
            }
            if(cont == 0) {
                vet3.add(vet2[i]);
            }
        }

        for(int i = 0; i < vet3.size(); i++) {
            System.out.println(vet3.get(i));
        }
    }
}
