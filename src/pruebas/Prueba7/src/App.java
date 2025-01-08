public class App {
    public static void main(String[] args) throws Exception {
        Mundial mundial2022 = new Mundial(1, 2022);

        SeleccionFutbol espanya = new SeleccionFutbol(1, "España");
        SeleccionFutbol argentina = new SeleccionFutbol(2, "Argentina");

        Persona e1 = new Futbolista(1, "Pedri", "González", "2002-11-25", 60.0, 1.74, 10, "Centrocampista");
        Persona e2 = new Futbolista(2, "Ferran", "Torres", "2000-02-29", 77.0, 1.84, 11, "Delantero");
        Persona e3 = new Futbolista(3, "Dani", "Olmo", "1998-05-07", 69.0, 1.79, 12, "Delantero");
        Persona e4 = new Entrenador(4, "Luis Enrique", "Martínez", "1970-05-08", 0.0, 1.80, 43);
        Persona e5 = new Fisioterapeuta(5, "Carlos", "Gutierrez", "1975-08-12", 70.00, 1.90, "Ciencias del Deporte", 49);


        Persona a1 = new Futbolista(1, "Emiliano", "Martínez", "1992-09-02", 85.0, 1.95, 23, "Portero");
        Persona a2 = new Futbolista(2, "Lionel", "Messi", "1987-06-24", 67.0, 1.69, 10, "Delantero");
        Persona a3 = new Futbolista(3, "Alexis", "Mac Allister", "1998-12-24", 72.0, 1.76, 20, "Mediocampista");
        Persona a4 = new Entrenador(4, "Lionel", "Scaloni", "1978-05-16", 0.0, 1.76, 44);
        Persona a5 = new Fisioterapeuta(5, "Adrian", "Gonzalez", "1982-09-07", 80.00, 1.80, "Ciencias del Deporte", 43);

        mundial2022.anyadirSeleccion(espanya);
        mundial2022.anyadirSeleccion(argentina);

        espanya.anyadirPersona(e1);
        espanya.anyadirPersona(e2);
        espanya.anyadirPersona(e3);
        espanya.anyadirPersona(e4);
        espanya.anyadirPersona(e5);
        
        argentina.anyadirPersona(a1);
        argentina.anyadirPersona(a2);
        argentina.anyadirPersona(a3);
        argentina.anyadirPersona(a4);
        argentina.anyadirPersona(a5);

        mundial2022.getSeleccion(2).getEntrenador().comer();
        mundial2022.getSeleccion(1).getFisioterapeuta().concentrarse();
        espanya.listarIntegrantes();
        argentina.listarIntegrantes();
        argentina.listarFutbolistasSobrepeso();


    }
}
