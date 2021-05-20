import static org.junit.Assert.*;
import org.junit.Test;


public class testPrueba {

  

    @Test
       public void testIncremento() {
           Contador incre = new Contador(10);
           int ini = incre.incremento();  
            assertEquals(1,ini);
       } 
       
    @Test
      public void testValorInicial() {
           Contador inicial = new Contador(0,1,10);
            assertEquals(0,inicial.incremento());
       }
  
     

     
}
