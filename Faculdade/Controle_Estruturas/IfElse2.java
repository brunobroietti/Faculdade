package Controle_Estruturas;

import javax.swing.*;

public class IfElse2 {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe um número:");
        int n1 = Integer.parseInt(valor);

        if (n1 % 2 == 0) {
            System.out.println("Número par.");
        } else
            System.out.println("Número ímpar.");
    }
}
