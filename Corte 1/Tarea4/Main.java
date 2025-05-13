import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        // Crear un objeto de la clase Ops que contiene las operaciones
        Ops operadores = new Ops();

        // Pedir el primer número al usuario
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el primer número (entero):"));

        // Pedir el segundo número al usuario
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el segundo número (entero):"));

        // Usar los métodos set para almacenar los números
        operadores.setNumero1(numero1);
        operadores.setNumero2(numero2);

        // Usar un bucle para que el usuario ingrese una opción válida
        boolean opcionValida = false;
        int opcion = 0;

        while (!opcionValida) {
            // Opciones de operaciones que el usuario puede elegir
            String[] opciones = {"Suma", "Resta", "Multiplicación"};
            
            // Mostrar ventana para que el usuario elija la operación
            String seleccion = (String) JOptionPane.showInputDialog(
                    null, "Elija una operación:", "Operaciones",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            // Verificar cuál operación se seleccionó
            if (seleccion != null) {
                // Comparar directamente con los strings para la operación elegida
                if (seleccion.equals("Suma")) {
                    opcion = 1;
                    opcionValida = true;
                } else if (seleccion.equals("Resta")) {
                    opcion = 2;
                    opcionValida = true;
                } else if (seleccion.equals("Multiplicación")) {
                    opcion = 3;
                    opcionValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor intente de nuevo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selección cancelada.");
                return; // Termina el programa si el usuario cancela
            }
        }

        // Realizar la operación seleccionada
        int resultado = 0;

        // Usamos un 'switch' que depende del valor de la opción
        switch (opcion) {
            case 1:
                resultado = operadores.sumar();
                break;
            case 2:
                resultado = operadores.restar();
                break;
            case 3:
                resultado = operadores.multiplicar();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                return;
        }

        // Mostrar el resultado de la operación
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}