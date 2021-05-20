public class Contador {
    
    protected int incremento;
    protected int limite;
    protected int valorIniciar;
    
   public Contador() {
        this.valorIniciar= 1;
        this.limite = 10;
        this.incremento = 1;
    }

    public Contador(int limi) {
        this.incremento = 1;
        this.valorIniciar = 0;
        this.limite = limi;
    }

   public int  incremento() {
          return this.valorIniciar + 1;
    }

   

    public int limite() {
        return 10;
    }

}
