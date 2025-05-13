// Importamos JOptionPane para mostrar mensajes
import javax.swing.JOptionPane;

// Clase que representa el saldo del cajero
public class Saldo {
    // Atributo privado que guarda el saldo de la cuenta
    private double saldo = 0.0;

    // Método para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    // Método para realizar un depósito
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            // Mostrar error si el monto es negativo o cero
            JOptionPane.showMessageDialog(null, "El monto debe ser positivo.");
        }
    }

    // Método para realizar un retiro
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        } else if (monto <= 0) {
            // Mostrar error si el monto es negativo o cero
            JOptionPane.showMessageDialog(null, "El monto debe ser positivo.");
        } else {
            // Mostrar error si no hay fondos suficientes
            JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
        }
        return false;
    }
}

