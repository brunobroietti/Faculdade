package Facul.Prova;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float mass1, mass, massUltima;
        int seg = 0, mint = 0, h = 0;

        System.out.println("Digite a massa exata do material: ");
        mass1 = in.nextFloat();
        mass = mass1;

        while(mass > 0.5) {
            mass = mass / 2;
            seg = seg + 50;
        }
        massUltima = mass;
        while(seg >= 60) {
            seg = seg - 60;
            mint++;
        }

        while(mint >= 60) {
            mint = mint - 60;
            h++;
        }

        System.out.println("O valor da massa inicial é: "+mass1);
        System.out.println("O valor da massa final é : "+massUltima);
        System.out.println();
        System.out.println("Horas: "+h);
        System.out.println("Minutos: "+mint);
        System.out.println("Segundos:"+seg);

    }
}
