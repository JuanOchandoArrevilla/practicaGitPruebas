import static org.junit.Assert.*;
import org.junit.Test;


public class testPrueba {
    @Test
       public void testIncremento() {
            Contador suma = new Contador(2);
            int apa = suma.incremento();  
            assertEquals(2,apa);
       } 
       
    @Test 
    public void testValorInicial() {
        Contador inicio = new Contador(1);
        int ini = inicio.valorInicial();
        assertEquals(1,ini);
    }

    @Test

    public void testLimite() {
        Contador limite = new Contador();
        int limi = limite.limite();
        assertEquals(limi,10);
    }

}
