package Fundamentos;

public class Array {
    int tamanho;
    private int[] array;

    public Array(int tamanho){
        this.tamanho = tamanho;
        this.array = new int[this.tamanho];
    }

    public void insere(int valor) {
        int i = validacao();
        if (i == -1) {
            System.out.println("Sem espaço no vetor!");
        } else {
            this.array[i] = valor;
        }
    }

    public void remove(int posicao) {
        int i, temp;
        for (i = posicao; i < this.tamanho-1; i++) {
            temp = this.array[i];
            this.array[i] = this.array[i + 1];
            this.array[i + 1] = temp;
        }
        this.array[this.tamanho - 1] = -1;
    }

    public int BuscaElemento(int posicao){
        return this.array[posicao];
    }

    private int validacao() {
        int i;
        for(i = 0; i < this.tamanho; i++) {
            if(this.array[i] == -1) {
                return i;
            }
        }
        return 0;
    }

    public void percorre() {
        int i;
        for(i = 0; i < this.tamanho; i++) {
            this.array[i] = -1;
        }
    }
}
