
package flaviordonez;

public class Mensaje {
    private String frase;
    private String fraseConFormato;
    
    public void darFormato(){
        frase=frase.replace(" ", "");
        frase=frase.replaceAll("[.,:;]", "");
        fraseConFormato=frase.toLowerCase();
        
}

public String getFraseConFormato(){
    darFormato();
    return fraseConFormato;
}

public Mensaje(String frase){
    this.frase=frase;
}
}

