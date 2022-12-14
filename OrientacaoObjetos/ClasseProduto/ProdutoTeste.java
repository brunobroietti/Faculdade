package ClasseProduto;

public class ProdutoTeste {
    public static void main(String[] args) {
        double precoFinal1, precoFinal2, mediaCarrinho; // Variáveis.

        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 12.56;
        Produto.desconto = 0.50;

        System.out.println(p1.nome+". Preço: "+p1.precoComDesconto());
        System.out.println(p2.nome+". Preço: "+p2.precoComDesconto());

        precoFinal1 = p1.precoComDesconto(Produto.desconto); //Com parenteses é método.
        precoFinal2 = p2.preco * (1 - Produto.desconto); //Sem parenteses é atributo.
        mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println("Média do carrinho = "+mediaCarrinho);
        System.out.println(precoFinal1+" "+precoFinal2);
    }
}