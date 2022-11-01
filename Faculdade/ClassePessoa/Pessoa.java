package ClassePessoa;

public class Pessoa {
    String nomeTitular;
    int cpf;
    int idade;

    public Pessoa(String nome, int cpf, int idade) {
        this.nomeTitular = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
