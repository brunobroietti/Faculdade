package Oo.Composicao;

public class Carro {
    Motor motor = new Motor();

    void acelerar() {
        if(motor.fatorInjecao < 2.5) {
            motor.fatorInjecao += 0.5;
        }
    }

    void frear() {
        if(motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.5;
        }
    }

    void ligar() {
        motor.ligado = true;
    }  // 'void' não retorna.

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}