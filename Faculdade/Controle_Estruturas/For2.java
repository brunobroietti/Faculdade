package Controle_Estruturas;

public class For2 {
    public static void main(String[] args) {

        int n1 = 1;
        for(;n1 <= 10;) {     //For como se fosse um While, pois as variáveis estão fora do for. Dessa forma
            System.out.println("N1 = "+n1);  // faria mais sentido usar o While porque o for é uma estrutura
            n1++;                            // de repetição determina e o While é indeterminada, então se usa as variáveis dentro
        }                                    // do FOR como por Ex: for(n1 = 1; n1 <= 10; n1++)  OU
    }                                        //                     for(n1 = 1;n1 <= 10;n1 = n1 + 1) OU
}                                            //                     for(n1 = 1; n1 <= 10; n1+=1) OU
                                             //  int n1 = 1;        for(n1; n1 <= 10; n1++)... ETC