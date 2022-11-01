package ClassePessoa;

public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta("Bruno", 19, 1234567891, 219,20000.00, "Conta corrente");
        System.out.println("Nome do titular: "+c1.getNomeTitular());
        System.out.println("Idade: "+c1.getIdade());
        System.out.println("Cpf: "+c1.getCpf());
        System.out.println("Número da conta: "+c1.getNumeroConta());
        System.out.println("Saldo da conta: "+c1.getSaldo());
        System.out.println("Tipo da conta: "+c1.getTipoConta());
        System.out.println();

        Conta c2 = new Conta("Luiz", 19, 901982131, 314,100000.00, "Conta corrente");
        System.out.println("Nome do titular: "+c2.getNomeTitular());
        System.out.println("Idade: "+c2.getIdade());
        System.out.println("Cpf: "+c2.getCpf());
        System.out.println("Número da conta: "+c2.getNumeroConta());
        System.out.println("Saldo da conta: "+c2.getSaldo());
        System.out.println("Tipo da conta: "+c2.getTipoConta());
    }
}
