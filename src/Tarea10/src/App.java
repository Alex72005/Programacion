package Tarea10.src;

public class App {
    public static void main(String[] args) throws Exception {
        Mundial mundial2022 = new Mundial(22,2022) ;
        SeleccionFutbol espanya = new SeleccionFutbol(5,"España");

        mundial2022.anyadirSeleccion(5,"España");

        /*for (int i = 0; i < mundial2022.selecciones.size(); i++) {
            System.out.println(mundial2022.selecciones.get(i));
        }
        */

        mundial2022.listarSelecciones();
    }
}
