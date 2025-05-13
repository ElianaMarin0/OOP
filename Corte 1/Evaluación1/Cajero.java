// Importaciones necesarias
import javax.swing.*; // Para JOptionPane
import java.text.DecimalFormat; // Para dar formato al saldo

// Clase principal que contiene el método main
public class Cajero {
    public static void main(String[] args) {
        // Crear objeto de la clase Saldo
        Saldo cuenta = new Saldo();

        // Crear formato con separador de miles y sin decimales
        DecimalFormat formato = new DecimalFormat("#,###");

        // Bucle principal del menú del cajero automático
        while (true) {
            // Opciones que se mostrarán al usuario
            String[] opciones = {"Depósito", "Retiro", "Consultar saldo", "Salir"};

            // Mostrar menú principal
            int eleccion = JOptionPane.showOptionDialog(null,
                    "Cajero automático, ¿qué desea realizar?", // Mensaje
                    "Cajero Automático", // Título
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            // Si el usuario cierra el cuadro o elige "Salir"
            if (eleccion == -1 || eleccion == 3) {
                break; // Salir del programa
            }

            // Opción 0: Depósito
            if (eleccion == 0) {
                String entrada = JOptionPane.showInputDialog("Ingrese el monto a depositar:");

                if (entrada != null) {
                    try {
                        double monto = Double.parseDouble(entrada);

                        if (monto < 0) {
                            JOptionPane.showMessageDialog(null, "El monto debe ser positivo.");
                        } else {
                            cuenta.depositar(monto);
                            JOptionPane.showMessageDialog(null,
                                    "Depósito exitoso.\nSaldo: $" + formato.format(cuenta.getSaldo()));
                        }
                    } catch (NumberFormatException e) {
                        // Si el usuario ingresa texto no numérico
                        JOptionPane.showMessageDialog(null, "Entrada inválida.");
                    }
                }
            }

            // Opción 1: Retiro
            else if (eleccion == 1) {
                String entrada = JOptionPane.showInputDialog("Ingrese el monto a retirar:");

                if (entrada != null) {
                    try {
                        double monto = Double.parseDouble(entrada);

                        if (monto < 0) {
                            JOptionPane.showMessageDialog(null, "El monto debe ser positivo.");
                        } else {
                            if (cuenta.retirar(monto)) {
                                JOptionPane.showMessageDialog(null,
                                        "Retiro exitoso.\nSaldo: $" + formato.format(cuenta.getSaldo()));
                            } else {
                                JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
                            }
                        }
                    } catch (NumberFormatException e) {
                        // Si el usuario ingresa texto no numérico
                        JOptionPane.showMessageDialog(null, "Entrada inválida.");
                    }
                }
            }

            // Opción 2: Consultar saldo
            else if (eleccion == 2) {
                JOptionPane.showMessageDialog(null,
                        "Saldo actual: $" + formato.format(cuenta.getSaldo()));
            }
        }
    }
}
