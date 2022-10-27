package ClasseListaLigada;

public class ListaLigada<T> {

    private NoPetri<T> primeiro;
    private NoPetri<T> ult;
    private int tamanho;

    public ListaLigada() {
        ult = null;
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionaInicio(T conteudo) {
        NoPetri<T> novoNo = new NoPetri<T>(conteudo, null);
        if(tamanho == 0) {
            primeiro = novoNo;
        }else {
            primeiro.setAntes(novoNo);
            novoNo.setProximo(primeiro);
            primeiro = novoNo;
        }
        tamanho++;
    }

    public void adicionaFinal(T conteudo) {
        NoPetri<T> novoNo = new NoPetri<T>(conteudo, null);
        if (tamanho == 0) {
            primeiro = novoNo;
        } else {
            NoPetri<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            novoNo.setAntes(atual);

            atual.setProximo(novoNo);
            ult = novoNo;
        }
        tamanho++;
    }

    public void Mostrar() {
        if (tamanho != 0) {
            NoPetri<T> atual = primeiro;
            int cont = 0;
            while (atual.getProximo() != null) {
                System.out.println("O dado do Nó na posição " + cont + " é: " + atual.getConteudo());
                atual = atual.getProximo();
                cont++;
            }
            System.out.println("O dado do Nó na posição " + cont + " é: " + atual.getConteudo());
        } else {
            System.out.println("Não há elemento na lista!!!");
        }
    }

    public void Decrescente() {
        if (tamanho != 0) {
            NoPetri<T> atual = ult;
            int cont = 0;
            while (atual.getAntes() != null) {
                System.out.println("O dado do Nó na posição " + cont + " é: " + atual.getConteudo());
                atual = atual.getAntes();
                cont++;
            }
            System.out.println("O dado do Nó na posição " + cont + " é: " + atual.getConteudo());
        } else {
            System.out.println("Não há elemento na lista!!!");
        }
    }
}
