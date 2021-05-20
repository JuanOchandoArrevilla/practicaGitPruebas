public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Contador pru = new Contador(10);
             pru.incremento();
             pru.incremento();
            
       System.out.println( pru.valorInicial());
       
        
    }
}
