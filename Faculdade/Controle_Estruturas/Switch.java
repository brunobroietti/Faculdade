package Controle_Estruturas;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha 1 ou 2: ");
        int n1 = in.nextInt();

        switch (n1) {
                case 1:
                System.out.println("azul");
                case 2:
                System.out.println("vermelho");
            default:
                System.out.println("Não há essa alternativa");
        }
    }
}
