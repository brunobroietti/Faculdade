package Oo.Encapsulamento.CasaA;

public class Ana {

    @SuppressWarnings("unused")
    private String segredo = "...";  // Modificador private.
    String facoDentroDeCasa = "...";       // Modificador default ou pacote, sendo só visto
    protected String formaDeFalar = "..."; // e acessado se a classe for do mesmo pacote.
    public String todosSabem = "...";
}
