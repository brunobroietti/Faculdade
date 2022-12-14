package ClasseProduto;

public class Produto { // Tudo que está na classe é um MEMBRO da classe.
    String nome; // Atributos.
    double preco;  // Variável de instância, precisamos criar uma instância para acessa-lá.
    static double desconto = 0.25; /* Variável STATIC, acessamos ela utilizando a classe.
                                   - 'desconto' é um membro da Classe 'Produto'.
                                   - Não precisa criar uma instância para acessar um membro 'static'.
                                   - 'Static' significa que o membro/atributo 'desconto' pertence à classe 'Produto'
                                   dessa forma, quando formos acessarmos, usariamos: sout(Produto.desconto);. Pois
                                   'desconto' pertence à classe por conta do STATIC.
                                   - Também pode ser chamada como variável de classe. */

    Produto() {  // Construtor 1. Para ser um construtor precisa ter o mesmo nome da classe.
                 // Construtor não tem retorno e tem que ter o mesmo nome da CLASSE.
    }            // Construtor é um método que vai ajudar a criar instâncias a partir de uma classe.

    Produto(String nomeInicial, double precoInicial) { // Construtor 2.
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
