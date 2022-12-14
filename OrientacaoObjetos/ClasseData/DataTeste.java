package ClasseData;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(); //Instância d1.
        d1.ano = 2021; //Posso mudar só o ano.

        var d2 = new Data(18, "dezembro", 1973);  //Instância d2
        // Temos duas datas criadas, ou seja, duas instâncias criadas dento do mesmo pacote.
        // Instâncias criadas a partir da Classe Data, ou seja, a partir do tipo data
        d2.ano = 2022;        //que criamos/que foi definido.

        System.out.println(d1.obterDataFormatada()); //Trazendo por método.
        System.out.println(d2.dia+" de "+d2.mes+" de "+d2.ano+"."); //Sem método.
    }
}