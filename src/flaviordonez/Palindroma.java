package flaviordonez;

import java.util.Scanner;

public class Palindroma {

   
    public static void main(String[] args) {
        
        Scanner teclado =new Scanner (System.in);
        System.out.println("Ingrese la frase para comprobar si es PALINDROMA: ");
        String frase = teclado.nextLine();
        
        Mensaje mensaje1 = new Mensaje(frase);
        System.out.println("La frase sin espacios es:");
        System.out.println(mensaje1.getFraseConFormato()) ;
        String fraseConFormato = mensaje1.getFraseConFormato();
        
        Validaciones validacion1 = new Validaciones(fraseConFormato);
        boolean letras = validacion1.soloLetras();
        boolean palindroma =validacion1.isPalindromo();
        
        System.out.println("La frase ingresada tiene solo letras: "+ letras);
        
        if (palindroma==true)
        System.out.println("La frase ingresada es palindroma");
        else
            System.out.println("La frase ingresada no es palindroma");
        
    }
    
}
