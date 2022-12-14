package Oo.Encapsulamento;

public class Pessoa {

    private String nome;
    private int idade;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    // Getter é o que lê
    public int getIdade() {
        return idade;
    }

    // Setter é o que altera
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return getNome()+" "+getSobrenome();
    }

    @Override
    public String toString() {
        return "Olá eu sou o "+getNome()+" e tenho "+getIdade()+" anos.";
    }
}
