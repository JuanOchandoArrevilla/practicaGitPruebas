public class Contador {
    
    protected int incremento;
    protected int limite;
    protected int valorIniciar;
    
   public Contador(int valorIniciar, int incremento, int limite) {
        this.valorIniciar = this.valorIniciar;
        this.limite = this.limite;
        this.incremento = this.incremento;
    }

    public Contador(int limi) {
        this.incremento = 1;
        this.valorIniciar = 0;
        this.limite = limi;
    }

   public int  incremento() {
        this.valorIniciar += this.incremento;
        if (valorIniciar == this.limite) {
            this.valorIniciar = 0;
        }
          return this.valorIniciar ;
    }

    public int valorInicial() {
       return this.valorIniciar;
    }

    public int limite() {
        return this.limite;
    }

}
