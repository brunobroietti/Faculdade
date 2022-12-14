package Oo.Composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();

        compra1.cliente = "Luiz";  // Uma compra tem vários itens e cada item tem apenas uma única compra.Ad         compra1.adicionarItem(new Item("Caneta", 20, 5.50));
        compra1.adicionarItem("Caneta", 20, 5);
        compra1.adicionarItem(new Item("Borracha", 20, 7.50));
        compra1.adicionarItem(new Item("Caderno", 3, 15));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());

        // Sò para mostrar a relação bidirecional!!!
        double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O total é R$"+total);
    }
}