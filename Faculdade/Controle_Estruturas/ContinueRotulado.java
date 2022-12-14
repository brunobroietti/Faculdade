package Controle_Estruturas;

public class ContinueRotulado {
    public static void main(String[] args) {
        int i, j;

        externo: for(i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == 1) {
                    continue externo;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim!");
    }
}
