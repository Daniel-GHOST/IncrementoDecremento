package operadoresincrementodecremento;

/**
 * @author Daniel
 */
public class OperadoresIncrementoDecremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program que incrementa o decremeta un valor");
        int x = 5, y, a;
        
        x++; //aqui la variable incrementa en uno el valor ingresado
        
        y = x++;
        
        a = --x;
        System.out.println("EL valor de la variable Y es : "+y);
        System.out.println("El valor de A, es: "+a);
    }
    
}
