public class Operations {
    private int r;  

   
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    
    public int sumar(int a, int b) {
        r = a + b;
        return r;
    }

    public int restar(int a, int b) {
        r = a - b;
        return r;
    }

    public int multiplicar(int a, int b) {
        r = a * b;
        return r;
    }

    public int potencia(int base, int exponente) {
        r = (exponente == 0) ? 1 : base * potencia(base, exponente - 1);
        return r;
    }
}