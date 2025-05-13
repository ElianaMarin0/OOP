public class Ops {

    private int numero1;
    private int numero2;

    // Método para obtener el valor de numero1
    public int getNumero1() {
        return numero1;
    }

    // Método para establecer el valor de numero1
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    // Método para obtener el valor de numero2
    public int getNumero2() {
        return numero2;
    }

    // Método para establecer el valor de numero2
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // Método para la suma
    public int sumar() {
        return getNumero1() + getNumero2();
    }

    // Método para la resta
    public int restar() {
        return getNumero1() - getNumero2();
    }

    // Método para la multiplicación
    public int multiplicar() {
        return getNumero1() * getNumero2();
    }
}