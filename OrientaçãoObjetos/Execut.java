package Fundamentos;

import java.util.Scanner;

public class Execut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op = -1;
        int i;

        System.out.println("Digite o tamanho do array: ");
        Array array1 = new Array(in.nextInt());
        array1.percorre();
        while(op != 0) {
            System.out.println("1 - Informar dados dentro do array;");
            System.out.println("2 - Busca elemento;");
            System.out.println("3 - Remover dados do array;");
            System.out.println("0 - Para finalizar.");
            op = in.nextInt();

            switch(op) {
                case 1:
                    for(i = 0; i < array1.tamanho; i++) {
                        System.out.println("Digite o valor do "+i+"° elemento: ");
                        array1.insere(in.nextInt());
                    }
                        break;
                case 2:
                    System.out.println("Digite a posição do dado que você quer");
                    for(i = 0; i < array1.tamanho; i++) {
                        System.out.println(i);
                    }
                    System.out.println("Escolha uma: ");
                    System.out.println(array1.BuscaElemento(in.nextInt()));
                    break;
                case 3:
                    System.out.println("Digite o array que quer remover");
                    for(i = 0; i < array1.tamanho; i++) {
                        System.out.println(i);
                    }
                    System.out.println("Escolha um: ");
                    array1.remove(in.nextInt());
                    break;
            }
        }
    }
}
