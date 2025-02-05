package Tareas.Tarea_7.src;

public class Dni {
    private String numeros;
    private char letra;

    public Dni(String dn){
        if  (validarDni(dn)){
            this.numeros = obtenerNumeros(dn);
            this.letra = dn.charAt(8);
        }
        else{
            System.out.println("DNI inválido: " + dn);
            this.numeros = "";
            this.letra = ' ';
        }
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String n){
        this.numeros = n;
    }

    public char getLetra() {
        return letra;
    }

    public void seLetra(char l){
        this.letra = l;
    }

    public String toString() {
        return numeros + letra;
    }



    // Extrae los 8 primeros caracteres (dígitos) del DNI usando concatenación
    private String obtenerNumeros(String dn) {
        String numeros = "";
        for (int i = 0; i < 8; i++) {
            numeros += dn.charAt(i);
        }
        return numeros;
    }

     // Valida el formato del DNI y la letra
     private boolean validarDni(String dn) {
        if (dn.length() == 9 && esLetra(dn.charAt(8))) {
            for (int i = 0; i < 8; i++) {
                if (dn.charAt(i) < '0' || dn.charAt(i) > '9') {
                    return false;
                }
            }
            char letraDni = dn.charAt(8);
            return calcularLetra(obtenerNumeros(dn)) == letraDni;
        }
        return false;
    }

    // Verifica si un carácter está dentro del rango de letras mayúsculas o minúsculas
    private boolean esLetra(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    // Calcula la letra del DNI basado en los 8 primeros dígitos
    private char calcularLetra(String numeros) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; // empiezo a contar desde el 0
        int numero = Integer.parseInt(numeros);
        return letras.charAt(numero % 23);
    }

}
