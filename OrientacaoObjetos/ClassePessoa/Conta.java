package ClassePessoa;

public class Conta extends Pessoa {
    private int numeroConta;
    private double saldo;
    private String tipoConta;

    public Conta(String nomeTitular, String dataDeNascimento, int idade, int cpf, int numeroConta, double saldo, String tipoConta) {
        super(nomeTitular, dataDeNascimento, cpf, idade);
        this.nomeTitular = nomeTitular;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
        }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) {
        if (valor > 0) {
            if (this.saldo < valor) {
                System.out.println("Não é possível sacar um valor maior do que o saldo.");
            } else {
                this.saldo = this.saldo - valor;
            }
        } else {
            System.out.println("Impossível sacar um valor negativo.");
        }
    }

    public void deposito(double valor, Conta conta) {
        if(valor > 0) {
            conta.saldo = conta.saldo + valor;
            System.out.println();
            System.out.println("Depósito concluído com sucesso.");
        } else {
            System.out.println("Não é possível depositar valores negativos ou iguais a 0.");
        }
    }

    public void imprimeNomeTitular() {
        System.out.println("O nome do titular é: " + this.nomeTitular);
    }

    public void informaSaldo() {
        System.out.println("O saldo atual da conta do(a): " + this.nomeTitular + " é igual a: " + this.saldo);
    }

    public void transfere(Conta contaDestino, double valor) {
        if(valor > 0  && valor <= this.saldo) {
            contaDestino.saldo += valor;
            this.saldo -= valor;
            System.out.println();
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Não é possível transferir valores negativos ou iguais a 0.");
        }
    }

    public String devolveTipoConta() {
        return this.tipoConta;
    }
}
