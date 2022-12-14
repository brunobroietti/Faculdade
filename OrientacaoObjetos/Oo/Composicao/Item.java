package Oo.Composicao;

import Oo.Composicao.Compra;

public class Item {
    String nome;
    int quantidade;
    double preco;
    Compra compra;
    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}