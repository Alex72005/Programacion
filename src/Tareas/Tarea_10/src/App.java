package Tareas.Tarea_10.src;

public class App {
    public static void main(String[] args) throws Exception {
        Mundial mundial2022 = new Mundial(22, 2022);

        mundial2022.anyadirSeleccion(1, "España");
        mundial2022.anyadirSeleccion(2, "Argentina");

        /* Añadir jugadores españa y mostramos*/
        Persona e1 = new Futbolista(1, "Unai", "Simón", "1997-06-11", 88.0, 1.90, 23, "Portero");
        Persona e2 = new Futbolista(2, "César", "Azpilicueta", "1989-08-28", 78.0, 1.78, 2, "Defensa");
        Persona e3 = new Futbolista(3, "Eric", "García", "2001-01-09", 73.0, 1.82, 3, "Defensa");
        Persona e4 = new Futbolista(4, "Pau", "Torres", "1997-01-16", 80.0, 1.91, 4, "Defensa");
        Persona e5 = new Futbolista(5, "Sergio", "Busquets", "1988-07-16", 76.0, 1.89, 5, "Centrocampista");
        Persona e6 = new Futbolista(6, "Marcos", "Llorente", "1995-01-30", 74.0, 1.84, 6, "Centrocampista");
        Persona e7 = new Futbolista(7, "Álvaro", "Morata", "1992-10-23", 82.0, 1.89, 7, "Delantero");
        Persona e8 = new Futbolista(8, "Koke", "Resurrección", "1992-01-08", 74.0, 1.76, 8, "Centrocampista");
        Persona e9 = new Futbolista(9, "Gavi", "Paez", "2004-08-05", 70.0, 1.73, 9, "Centrocampista");
        Persona e10 = new Futbolista(10, "Pedri", "González", "2002-11-25", 60.0, 1.74, 10, "Centrocampista");
        Persona e11 = new Futbolista(11, "Ferran", "Torres", "2000-02-29", 77.0, 1.84, 11, "Delantero");
        Persona e12 = new Futbolista(12, "Dani", "Olmo", "1998-05-07", 69.0, 1.79, 12, "Delantero");
        Persona e13 = new Futbolista(13, "David", "Raya", "1995-09-15", 80.0, 1.83, 13, "Portero");
        Persona e14 = new Futbolista(14, "José", "Gayà", "1995-05-25", 69.0, 1.72, 14, "Defensa");
        Persona e15 = new Futbolista(15, "Rodri", "Hernández", "1996-06-22", 82.0, 1.91, 16, "Centrocampista");
        Persona e16 = new Futbolista(16, "Jordi", "Alba", "1989-03-21", 69.0, 1.70, 18, "Defensa");
        Persona e17 = new Futbolista(17, "Ansu", "Fati", "2002-10-31", 66.0, 1.78, 17, "Delantero");
        Persona e18 = new Futbolista(18, "Carlos", "Soler", "1997-01-02", 76.0, 1.80, 19, "Centrocampista");
        Persona e19 = new Futbolista(19, "Nico", "Williams", "2002-07-12", 62.0, 1.78, 12, "Delantero");
        Persona e20 = new Futbolista(20, "Alejandro", "Balde", "2003-10-18", 66.0, 1.75, 14, "Defensa");
        Persona e21 = new Futbolista(21, "Yeremy", "Pino", "2002-10-20", 65.0, 1.72, 21, "Delantero");
        Persona e22 = new Futbolista(22, "Robert", "Sánchez", "1997-11-18", 90.0, 1.97, 22, "Portero");
        Persona e23 = new Futbolista(23, "Hugo", "Guillamón", "2000-01-31", 75.0, 1.78, 15, "Defensa");
        Persona e24 = new Futbolista(24, "Marco", "Asensio", "1996-01-21", 70.0, 1.82, 10, "Delantero");
        Persona e25 = new Futbolista(25, "Pablo", "Sarabia", "1992-05-11", 70.0, 1.74, 22, "Delantero");
        Persona e26 = new Futbolista(26, "Álvaro", "Rodríguez", "1995-07-22", 81.0, 1.88, 24, "Defensa");
        Persona e27 = new Entrenador(27, "Luis Enrique", "Martínez", "1970-05-08", 0.0, 1.80, 43);


        mundial2022.getSeleccion(1).anyadirPersona(e1);
        mundial2022.getSeleccion(1).anyadirPersona(e2);
        mundial2022.getSeleccion(1).anyadirPersona(e3);
        mundial2022.getSeleccion(1).anyadirPersona(e4);
        mundial2022.getSeleccion(1).anyadirPersona(e5);
        mundial2022.getSeleccion(1).anyadirPersona(e6);
        mundial2022.getSeleccion(1).anyadirPersona(e7);
        mundial2022.getSeleccion(1).anyadirPersona(e8);
        mundial2022.getSeleccion(1).anyadirPersona(e9);
        mundial2022.getSeleccion(1).anyadirPersona(e10);
        mundial2022.getSeleccion(1).anyadirPersona(e11);
        mundial2022.getSeleccion(1).anyadirPersona(e12);
        mundial2022.getSeleccion(1).anyadirPersona(e13);
        mundial2022.getSeleccion(1).anyadirPersona(e14);
        mundial2022.getSeleccion(1).anyadirPersona(e15);
        mundial2022.getSeleccion(1).anyadirPersona(e16);
        mundial2022.getSeleccion(1).anyadirPersona(e17);
        mundial2022.getSeleccion(1).anyadirPersona(e18);
        mundial2022.getSeleccion(1).anyadirPersona(e19);
        mundial2022.getSeleccion(1).anyadirPersona(e20);
        mundial2022.getSeleccion(1).anyadirPersona(e21);
        mundial2022.getSeleccion(1).anyadirPersona(e22);
        mundial2022.getSeleccion(1).anyadirPersona(e23);
        mundial2022.getSeleccion(1).anyadirPersona(e24);
        mundial2022.getSeleccion(1).anyadirPersona(e25);
        mundial2022.getSeleccion(1).anyadirPersona(e26);
        mundial2022.getSeleccion(1).anyadirPersona(e27);
        
        System.out.println();

        System.out.println("Selección Española");
        mundial2022.getSeleccion(1).listarIntegrantes();

        Persona a1 = new Futbolista(1, "Emiliano", "Martínez", "1992-09-02", 85.0, 1.95, 23, "Portero");
        Persona a2 = new Futbolista(2, "Lionel", "Messi", "1987-06-24", 67.0, 1.69, 10, "Delantero");
        Persona a3 = new Futbolista(3, "Alexis", "Mac Allister", "1998-12-24", 72.0, 1.76, 20, "Mediocampista");
        Persona a4 = new Entrenador(28, "Lionel", "Scaloni", "1978-05-16", 0.0, 1.76, 44);

        mundial2022.getSeleccion(2).anyadirPersona(a1);
        mundial2022.getSeleccion(2).anyadirPersona(a2);
        mundial2022.getSeleccion(2).anyadirPersona(a3);
        mundial2022.getSeleccion(2).anyadirPersona(a4);

        System.out.println();

        System.out.println("Selección Argentina");
        mundial2022.getSeleccion(2).listarIntegrantes();
        
        System.out.println();

        System.out.println("Jugadores de la Selección Argentina con sobrepeso");
        mundial2022.getSeleccion(2).listarFutbolistasSobrepeso();
    }
}
