public class Contador {
    
    protected int incremento;
    protected int limite;
    protected int valorIniciar;
    protected int actual;
    
   public Contador(int valorIniciar, int incremento, int limite) {
        this.valorIniciar = this.valorIniciar;
        this.incremento = this.incremento;
        this.limite = this.limite;
    }

    public Contador(int limi) {
        this.incremento = 1;
        this.valorIniciar = 0;
        this.limite = limi;
    }

   public int  incremento() {
       this.actual = this.valorIniciar;
       this.actual += this.incremento;
        if (this.actual > this.limite) {
            this.actual = this.valorIniciar;
        }
          return this.actual ;
    }

    public int valorInicial() {
        return this.valorIniciar;
    }

    

}
