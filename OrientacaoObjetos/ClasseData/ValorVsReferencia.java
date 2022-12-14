package ClasseData;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //Atribuição por valor (Tipo primitivo).

        a++;
        b--;

        System.out.println(a+" "+b);

        Data d1 = new Data(1, "Março", 2022);
        Data d2 = d1; //Atribuição por referência (Objeto).

        d1.dia = 31;
        d2.mes = "Dezembro";
        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDaraParavalorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDaraParavalorPadrao(Data d) {
        d.dia = 1;
        d.mes = "Janeiro";
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a) {
        a++;
    }
}