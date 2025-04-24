public class Operations {
    private int a; 
    private int b ; 
    private int r;

    public Operations(int a, int b) {
        this.a = a;
        this.b = b;
    }

 
    public int geta() { return a; }
    public void seta(int a) { this.a = a; }

    public int getb() { return b; }
    public void setb(int num2) { this.b = b; }

   
    public void sumar() {
        r = a + b;
       
    }

    public void restar() {
    r = a - b;

    }

    public void multiplicar() {
        r=  a * b;
    
    }
    
  public int getResult(){
      System.out.print("Result = ");
      return r; 
  }
          
    
    
}