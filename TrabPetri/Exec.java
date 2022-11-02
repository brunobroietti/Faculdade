package TrabPetri;

public class Exec {
    public static void main(String[] args) {

        Conta c1 = new Conta("Bruno", 1234567891, 219, 20000.00);
        System.out.println(c1.getNomeTitular());
        System.out.println(+c1.getCpf());
        System.out.println(c1.getNumeroDaConta());
        System.out.println(c1.getSaldo());
        System.out.println();
    }
}
