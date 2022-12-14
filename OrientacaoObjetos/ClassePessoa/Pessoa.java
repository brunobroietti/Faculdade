package ClassePessoa;

public class Pessoa {
    String nomeTitular;
    String dataDeNascimento;
    int cpf;
    int idade;

    public Pessoa(String nome, String dataDeNascimento, int cpf, int idade) {
        this.nomeTitular = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }
}