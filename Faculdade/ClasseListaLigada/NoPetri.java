package ClasseListaLigada;

import Fila.No;

public class NoPetri<T> {
    private T conteudo;
    private NoPetri<T> proximo;
    private NoPetri<T> antes;

    public NoPetri(T conteudo, NoPetri<T> proximo) {
        this.conteudo = conteudo;
        this.proximo = proximo;
    }

    public T getConteudo() {return conteudo;}

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoPetri<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoPetri<T> proximo) {this.proximo = proximo;}
    
    public NoPetri<T> getAntes(){ return antes; }
    
    public void setAntes(NoPetri<T> antes) {this.antes = antes;}
}
