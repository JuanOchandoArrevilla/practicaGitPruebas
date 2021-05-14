import static org.junit.Assert.*;
import org.junit.Test;


public class testPrueba {
    @Test
       public void testIncremento() {
           Contador incre = new Contador();
           int ini = incre.incremento();  
            assertEquals(1,ini);
       } 
       
    @Test
      public void testValorInicial() {
           Contador inicial = new Contador();
           int inicio = inicial.valorInicial();
           assertEquals(0,inicio);
       }
     

}
