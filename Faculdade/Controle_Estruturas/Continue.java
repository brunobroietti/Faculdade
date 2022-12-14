package Controle_Estruturas;

public class Continue {
    public static void main(String[] args) {
        int i;

        for(i = 0; i <= 10; i++) {
            if(i == 5)
                continue;             //   Se o continue; for encontrado ele ira interromper apenas aquela repetição.
            System.out.println(i);    //   Neste exemplo ao rodar o código, o continue; fez o 5 não aparecer
        }                             // pois ele interrompeu esse laço de repetição. Ele interrompe, porem continua.
    }
}
