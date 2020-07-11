
package flaviordonez;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MensajeTest {
    
    @Test
    public void testGetFormato(){
        System.out.println("Validacion del metodo getFraseConFormato");
        Mensaje mensaje1 = new Mensaje("holaloko");
        String esperado=("holaloko");
        String resultado=mensaje1.getFraseConFormato();
        assertEquals(esperado,resultado);
    }
    
}