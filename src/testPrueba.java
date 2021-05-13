import static org.junit.Assert.*;
import org.junit.Test;


public class testPrueba {
    @Test
       public void testIncremento() {
            Contador suma = new Contador(2);
            int apa = suma.incremento();  
            assertEquals(2,apa);
       } 
       
  
}
