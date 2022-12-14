/**
 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero
 * aleatório em uma variável.
 *    O Jogador tem 10 tentativas para adivinhar o número gerado.
 *    Ao final de cada tentativa, imprima a quantidade de
 * tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
 */
package Controle_Estruturas.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int tent, aleatorio, chute;
        aleatorio = random.nextInt(100);

        for(tent = 9; tent >= 0;tent--) {
            System.out.print("Chute um número: ");
            chute = in.nextInt();

            if(chute == aleatorio) {
                System.out.print("Parabéns, você acertou.");
                break;
            } else if(chute > aleatorio) {
                System.out.println("Chute alto.");
                System.out.println("Sobram "+tent+" tentativas.");
                System.out.println();
            } else if(chute < aleatorio) {
                System.out.println("Chute baixo.");
                System.out.println("Sobram "+tent+" tentativas.");
                System.out.println();
            }
        }
    }
}
