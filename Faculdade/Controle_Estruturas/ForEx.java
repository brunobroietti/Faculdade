// Não pode usar valor numérico para controlar o laço!
package Controle_Estruturas;

public class ForEx {
    public static void main(String[] args) {

        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
