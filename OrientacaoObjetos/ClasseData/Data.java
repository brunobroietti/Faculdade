package ClasseData;

public class Data {
    int dia;  //Temos 3 atributos: dia, mes e ano.
    String mes;
    int ano;
    
    Data() {
        dia = 1;
        mes = "Janeiro";
        ano = 1970;
    }

    Data(int diaInicial, String mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        return String.format(dia+" de "+mes+" de "+ano+".");
    }
}
