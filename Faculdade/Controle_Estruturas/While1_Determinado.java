package Controle_Estruturas;

public class While1_Determinado {
    public static void main(String[] args) {
        int n1 = 1;                 // O While é uma estrutura indeterminada, que é o caso a ser mais usado com o While.

        while(n1 <= 10) {           // Quando o laço do While tiver fim, ele é determinado
            System.out.println(n1); // mas ele costuma ser indeterminado porque não sabemos
            n1 = n1 + 1;            // quantas vezes um bloco de instrução precisa ser repetido.
        }                           // Com ele, a execução das instruções vai continuar até que
    }                               // uma condição seja verdadeira.
}