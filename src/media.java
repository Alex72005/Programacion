public class media {
    public static void main(String[] args) {
        String linea1 = "1, Alejandro Santos Merina , asm0125@alu.medac.es";
        String linea2 = "1;7;8;9;6;4";

        double suma = 0;
       

        String [] notas = linea2.split(";");

        for (int i = 1; i < notas.length; i++) {
            double nota = Integer.parseInt(notas[i]);
            suma += nota;
        }
        
        double media = suma / (notas.length - 1);
        System.out.println(media);

        for (int i = 1; i < linea1.length(); i++) {
                        
        }



    }
}
