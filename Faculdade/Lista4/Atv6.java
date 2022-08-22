/**
 *  6. Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados
 * de idade, sexo (M/F) e salário. Faça um programa que calcule e mostre:
 * a) A média dos salários do grupo;
 * b) A maior e a menor idade do grupo;
 * c) A quantidade de mulheres na região;
 * d) A idade e o sexo da pessoa que possui o menor salário;
 * Finalize a entrada de dados ao ser digitada uma idade negativa.
 */
package Facul.Lista4;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sexo = "", sexoMenorSal = "";
        int idade, salario, mediaSalario, somaSalario = 0, cont = 0;
        int menorSalario = 0;
        int m = 0, f = 0;
        int mIdade = 0;
        int menorIdade = 0;
        int idadeMenorSal = 0;


        do {
            System.out.print("Digite sua idade: ");
            idade = in.nextInt();
            if(idade < mIdade) {
                mIdade = idade;
            } else if (idade > menorIdade) {
                menorIdade = idade;
            }

            System.out.println("Digite seu sexo 'm' ou 'f': ");
            sexo = in.next();
            if(sexo.equalsIgnoreCase("m")) {
                m++;
            } else {
                f++;
            }

            System.out.print("Digite seu salário: ");
            salario = in.nextInt();
            somaSalario = salario + somaSalario;

            if(salario < menorSalario) {
                menorSalario = salario;
                sexoMenorSal = sexo;
                idadeMenorSal = idade;
            }

            cont++;
        } while(idade < 0);

        // a)
        mediaSalario = somaSalario/cont;
        System.out.println("A média dos salários do grupo é: "+mediaSalario);

        // b)
        System.out.println("Maior idade do grupo: "+mIdade);
        System.out.println("Menor idade do grupo: "+menorIdade);

        // c)
        System.out.println("Quantidade de mulheres da região: "+f);

        // d)
        System.out.println("A pessoa com o menor salário é do sexo "+sexoMenorSal+" e tem "+idadeMenorSal+" anos.");
    }
}
