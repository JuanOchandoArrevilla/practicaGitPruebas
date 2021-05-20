public class Contador {
    
    protected int incremento;
    protected int limite;
    protected int valorIniciar;
    
   public Contador() {
        this.valorIniciar = 0;
        this.limite = 10;
        this.incremento = 1;
    }

    public Contador(int limi) {
        this.incremento = 1;
        this.valorIniciar = 0;
        this.limite = limi;
    }

   public int  incremento() {
        this.valorIniciar += 1;
        if (valorIniciar == this.limite) {
            this.valorIniciar = 0;
        }
          return this.valorIniciar ;
    }

    public int valorInicial() {
       return this.valorIniciar = 0;
    }

    public int limite() {
        return this.limite;
    }

}
