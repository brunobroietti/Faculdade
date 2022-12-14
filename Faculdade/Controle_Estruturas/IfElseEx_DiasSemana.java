/*
Digitar os dias da semana e aparecer de acordo com o dia
Ex:
- Terça -> 3
- Quinta -> 5
- Sexta ->
 */
package Controle_Estruturas;

import java.util.Scanner;

public class IfElseEx_DiasSemana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite algum dia da semana: ");
        String dia = in.nextLine();

        if("Domingo".equalsIgnoreCase(dia)) {
            System.out.print("1");
        } else if("Segunda".equalsIgnoreCase(dia)) {
            System.out.println("2");
        } else if("Terça".equalsIgnoreCase(dia) || "Terca".equalsIgnoreCase(dia)) {
            System.out.println("3");
        } else if("Quarta".equalsIgnoreCase(dia)) {
            System.out.println("4");
        } else if("Quinta".equalsIgnoreCase(dia)) {
            System.out.println("5");
        } else if("Sexta".equalsIgnoreCase(dia)) {
            System.out.println("6");
        } else if("Sábado".equalsIgnoreCase(dia) || "Sabado".equalsIgnoreCase(dia)) {
            System.out.println("7");
        }
    }
}
