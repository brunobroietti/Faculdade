/**
 *  2. Faça um programa que receba uma senha formada de quatro números inteiros,
 * verifique se a senha está correta e, caso não esteja, solicite novamente a senha. Se a
 * senha entrada for a correta, deverá ser apresentada a mensagem “Senha Correta”,
 * caso contrário, “Senha Incorreta”.
 */
package Facul.Lista4;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tentativa = null, senha = "";

        while(senha.length() != 4) {
            System.out.print("Digite uma senha: ");
            senha = in.nextLine();
        }

        while(!senha.equals(tentativa)) {
            System.out.print("Confirme sua senha: ");
            tentativa = in.nextLine();
            if(!tentativa.equals(senha)) {
                System.out.println("Senha incorreta!");
                System.out.println();
            }
        }
        System.out.println("Senha correta!");

        in.close();
    }
}
