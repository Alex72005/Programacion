package DNI.src;
public class Dni {
    private String numeros;
    private char letra;

    public Dni(String n){
        this.numeros = n;
        this.letra = calcularLetra();
    }

    public String getNumeros(){
        return this.numeros;
    }

    public void setNumeros(String num){
        this.numeros = num;
    }

    public char getLetra(){
        return this.letra;
    }

    public void setLetra(char l){
        this.letra = l;
    }

    public String toString(){
        return "Dni: " + this.numeros + this.letra;
    }
    private char calcularLetra(){
        int numerosInt = Integer.parseInt(this.numeros);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = numerosInt % 23;

        letra = letras[resto];
        return letra; 
    }
}
