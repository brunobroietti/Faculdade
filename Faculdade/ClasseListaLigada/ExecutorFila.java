package Fila;

public class ExecutorFila {
    public static void main(String[] args) {
        Fila fila = new Fila<>();
        System.out.println(fila.vazia());
        fila.enfileira(10);
        System.out.println(fila.vazia());
        fila.mostraFila();
        fila.enfileira(20);
        fila.desenfileira();
        fila.mostraFila();
    }
}
