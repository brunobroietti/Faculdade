package ClasseListaLigada;

import java.util.List;

public class ExecNoPetri {
    public static void main(String[] args) {
        ListaLigada listaOn = new ListaLigada<>();

        listaOn.adicionaInicio(100);
        listaOn.adicionaFinal(200);
        listaOn.adicionaFinal(300);
        listaOn.Mostrar();
        System.out.println();
        listaOn.Decrescente();
    }
}
