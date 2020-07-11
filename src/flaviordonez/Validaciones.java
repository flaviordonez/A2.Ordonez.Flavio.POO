
package flaviordonez;

public class Validaciones {
    private boolean  soloLetras,palindroma;
    private String frase; 
    
    public Validaciones (String frase){
        this.frase = frase;
        
    }
    
    public boolean isPalindromo(){
        
        int n=frase.length();
        for (int i=1; i<frase.length();i++){
            if(frase.charAt(i-1)==frase.charAt(n-i))
                palindroma = true;
            else{
            palindroma=false;
           break;}
        }
        return palindroma;
    }
    
     public boolean soloLetras(){
      for (int i=0;i<frase.length();i++){
           if(frase.charAt(i)=='1'||frase.charAt(i)=='2'||frase.charAt(i)=='3'||frase.charAt(i)=='4'||frase.charAt(i)=='5'||frase.charAt(i)=='6'||frase.charAt(i)=='7'||frase.charAt(i)=='8'||frase.charAt(i)=='9'||frase.charAt(i)=='0'){
             soloLetras=false;
              break;}
           else
              soloLetras=true;
        }
      return soloLetras;
      
   }
}

