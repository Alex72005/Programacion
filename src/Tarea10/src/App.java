package Tarea10.src;

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
        Persona e4 = new Futbolista(12, "Dani", "Olmo", "1998-05-07", 69.0, 1.79, 12, "Delantero");
        Persona e4 = new Futbolista(13, "David", "Raya", "1995-09-15", 80.0, 1.83, 13, "Portero");
        Persona e4 = new Futbolista(14, "José", "Gayà", "1995-05-25", 69.0, 1.72, 14, "Defensa");
        Persona e4 = new Futbolista(15, "Rodri", "Hernández", "1996-06-22", 82.0, 1.91, 16, "Centrocampista");
        Persona e4 = new Futbolista(16, "Jordi", "Alba", "1989-03-21", 69.0, 1.70, 18, "Defensa");
        Persona e4 = new Futbolista(17, "Ansu", "Fati", "2002-10-31", 66.0, 1.78, 17, "Delantero");
        Persona e4 = new Futbolista(18, "Carlos", "Soler", "1997-01-02", 76.0, 1.80, 19, "Centrocampista");
        Persona e4 = new Futbolista(19, "Nico", "Williams", "2002-07-12", 62.0, 1.78, 12, "Delantero");
        Persona e4 = new Futbolista(20, "Alejandro", "Balde", "2003-10-18", 66.0, 1.75, 14, "Defensa");
        Persona e4 = new Futbolista(21, "Yeremy", "Pino", "2002-10-20", 65.0, 1.72, 21, "Delantero");
        Persona e4 = new Futbolista(22, "Robert", "Sánchez", "1997-11-18", 90.0, 1.97, 22, "Portero");
        Persona e4 = new Futbolista(23, "Hugo", "Guillamón", "2000-01-31", 75.0, 1.78, 15, "Defensa");
        Persona e4 = new Futbolista(24, "Marco", "Asensio", "1996-01-21", 70.0, 1.82, 10, "Delantero");
        Persona e4 = new Futbolista(25, "Pablo", "Sarabia", "1992-05-11", 70.0, 1.74, 22, "Delantero");
        Persona e4 = new Futbolista(26, "Álvaro", "Rodríguez", "1995-07-22", 81.0, 1.88, 24, "Defensa");

        mundial2022.getSeleccion(1).anyadirPersona(e1);

        
        
        
        
        

        for (int i = 0; i < espanya.jugadores.size(); i++) {
            System.out.println(espanya.jugadores.get(i));
        }

        System.out.println();

         /* Añadir jugadores argentina y mostramos */
        argentina.jugadores.add(new Futbolista(1, "Emiliano", "Martínez", "1992-09-02", 85.0, 1.95, 23, "Portero"));
        argentina.jugadores.add(new Futbolista(2, "Franco", "Armani", "1986-10-16", 86.0, 1.89, 1, "Portero"));
        argentina.jugadores.add(new Futbolista(3, "Gerónimo", "Rulli", "1992-05-20", 84.0, 1.89, 12, "Portero"));
        argentina.jugadores.add(new Futbolista(4, "Nahuel", "Molina", "1998-04-06", 70.0, 1.75, 26, "Defensa"));
        argentina.jugadores.add(new Futbolista(5, "Cristian", "Romero", "1998-04-27", 79.0, 1.85, 13, "Defensa"));
        argentina.jugadores.add(new Futbolista(6, "Nicolás", "Otamendi", "1988-02-12", 81.0, 1.83, 19, "Defensa"));
        argentina.jugadores.add(new Futbolista(7, "Lisandro", "Martínez", "1998-01-18", 77.0, 1.75, 25, "Defensa"));
        argentina.jugadores.add(new Futbolista(8, "Nicolás", "Tagliafico", "1992-08-31", 69.0, 1.72, 3, "Defensa"));
        argentina.jugadores.add(new Futbolista(9, "Marcos", "Acuña", "1991-10-28", 72.0, 1.72, 8, "Defensa"));
        argentina.jugadores.add(new Futbolista(10, "Rodrigo", "De Paul", "1994-05-24", 70.0, 1.80, 7, "Mediocampista"));
        argentina.jugadores.add(new Futbolista(11, "Leandro", "Paredes", "1994-06-29", 75.0, 1.80, 5, "Mediocampista"));
        argentina.jugadores.add(new Futbolista(12, "Enzo", "Fernández", "2001-01-17", 75.0, 1.78, 24, "Mediocampista"));
        argentina.jugadores.add(new Futbolista(13, "Alexis", "Mac Allister", "1998-12-24", 72.0, 1.76, 20, "Mediocampista"));
        argentina.jugadores.add(new Futbolista(14, "Lionel", "Messi", "1987-06-24", 67.0, 1.69, 10, "Delantero"));
        argentina.jugadores.add(new Futbolista(15, "Julián", "Álvarez", "2000-01-31", 70.0, 1.70, 9, "Delantero"));
        argentina.jugadores.add(new Futbolista(16, "Ángel", "Di María", "1988-02-14", 75.0, 1.80, 11, "Delantero"));
        argentina.jugadores.add(new Futbolista(17, "Lautaro", "Martínez", "1997-08-22", 75.0, 1.74, 22, "Delantero"));
        argentina.jugadores.add(new Futbolista(18, "Paulo", "Dybala", "1993-11-15", 73.0, 1.77, 21, "Delantero"));
        argentina.jugadores.add(new Futbolista(19, "Thiago", "Almada", "2001-04-26", 63.0, 1.71, 16, "Delantero"));
        argentina.jugadores.add(new Futbolista(20, "Gonzalo", "Montiel", "1997-01-01", 70.0, 1.75, 4, "Defensa"));
        argentina.jugadores.add(new Futbolista(21, "Germán", "Pezzella", "1991-06-27", 78.0, 1.85, 6, "Defensa"));
        argentina.jugadores.add(new Futbolista(22, "Juan", "Foyth", "1998-01-12", 76.0, 1.87, 2, "Defensa"));
        argentina.jugadores.add(new Futbolista(23, "Guido", "Rodríguez", "1994-04-12", 75.0, 1.85, 18, "Mediocampista"));
        argentina.jugadores.add(new Futbolista(24, "Exequiel", "Palacios", "1998-10-05", 71.0, 1.77, 14, "Mediocampista"));
        argentina.jugadores.add(new Futbolista(25, "Alejandro", "Gómez", "1988-02-15", 68.0, 1.67, 17, "Delantero"));
        argentina.jugadores.add(new Futbolista(26, "Ángel", "Correa", "1995-03-09", 70.0, 1.71, 15, "Delantero"));

        for (int i = 0; i < argentina.jugadores.size(); i++) {
            System.out.println(argentina.jugadores.get(i));
        }

        System.out.println();

        /* Mostramos jugadores de la seleccion argentina con sobrepeso */
        for (int i = 0; i < argentina.jugadores.size(); i++){
            Futbolista jugador = argentina.jugadores.get(i);
            if (jugador.tieneSobrepeso()) {
                System.out.println(jugador);
            }
        }
    }
}
