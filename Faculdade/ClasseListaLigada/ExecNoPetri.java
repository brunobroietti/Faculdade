package ClasseListaLigada;

import java.util.List;

public class ExecNoPetri {
    public static void main(String[] args) {
        ListaLigada listaOn = new ListaLigada<>();

        listaOn.adicionaInicio(1);
        listaOn.adicionaFinal(2);
        listaOn.adicionaFinal(3);
        listaOn.adicionaInicio(4);
        listaOn.adicionaFinal(5);
        listaOn.adicionaInicio(6);
        listaOn.adicionaFinal(7);
        listaOn.Mostrar();
        System.out.println();
        listaOn.Decrescente();
    }
}
