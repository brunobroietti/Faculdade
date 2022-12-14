package Oo.Encapsulamento.CasaB;

import Oo.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
   // Não precisa criar instância, pois vamos acessar por herança e não por composição;

    void testeAcessos() {
        // System.out.println(segredo);
        // System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
        // ou
        System.out.println(new Ana().todosSabem);
    }
}