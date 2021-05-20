import static org.junit.Assert.*;
import org.junit.Test;


public class testPrueba {

    @Test
    public void tesIncrementoDefaul() {
        Contador defa = new Contador();
        int fu = defa.incremento();
        assertEquals(1,fu);
    }

    @Test
       public void testIncremento() {
           Contador incre = new Contador(10);
           int ini = incre.incremento();  
            assertEquals(1,ini);
       } 
       
    @Test
      public void testValorInicial() {
           Contador inicial = new Contador();
           int inicio = inicial.valorInicial();
           int pi = inicial.valorInicial();
           assertEquals(pi,inicio);
       }
     
     @Test
     public void testLimite() {
        Contador limite = new Contador();
        int limi = limite.limite();
        assertEquals(10, limi);
        
    } 

     

     
}
