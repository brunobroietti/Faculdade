package Controle_Estruturas;

public class For3 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {  //Posso criar uma variável do mesmo nome fora do FOR.
            for(int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }
        }
        System.out.println();
    }
}
