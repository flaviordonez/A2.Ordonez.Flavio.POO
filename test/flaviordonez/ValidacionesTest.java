
package flaviordonez;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidacionesTest {
    Validaciones validacion1 = new Validaciones("ama");
    @Test
    public void testIsPalindroma(){
       System.out.println("Validacion del metodo IsPalindroma");
       boolean esperado=true;
       boolean resultado = validacion1.isPalindromo();
       assertEquals(esperado,resultado);
       
    }
    @Test
    public void testSoloLetras(){
        System.out.println("Validacion del metodo soloLetras");
        boolean resultado=validacion1.soloLetras();
        assertTrue(resultado);
    }
}
