package Tarea10.src;

public class App {
    public static void main(String[] args) throws Exception {
        Mundial mundial2022 = new Mundial(22,2022) ;
        
        SeleccionFutbol espanya = new SeleccionFutbol(1,"España");
        SeleccionFutbol argentina = new SeleccionFutbol(2, "Argentina");

        mundial2022.anyadirSeleccion(1,"España");
        mundial2022.anyadirSeleccion(2, "Argentina");

        espanya.jugadores.add(new Futbolista(1, "Unai", "Simón", "1997-06-11", 88.0, 1.90, 23, "Portero"));
        espanya.jugadores.add(new Futbolista(2, "César", "Azpilicueta", "1989-08-28", 78.0, 1.78, 2, "Defensa"));
        espanya.jugadores.add(new Futbolista(3, "Eric", "García", "2001-01-09", 73.0, 1.82, 3, "Defensa"));
        espanya.jugadores.add(new Futbolista(4, "Pau", "Torres", "1997-01-16", 80.0, 1.91, 4, "Defensa"));
        espanya.jugadores.add(new Futbolista(5, "Sergio", "Busquets", "1988-07-16", 76.0, 1.89, 5, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(6, "Marcos", "Llorente", "1995-01-30", 74.0, 1.84, 6, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(7, "Álvaro", "Morata", "1992-10-23", 82.0, 1.89, 7, "Delantero"));
        espanya.jugadores.add(new Futbolista(8, "Koke", "Resurrección", "1992-01-08", 74.0, 1.76, 8, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(9, "Gavi", "Paez", "2004-08-05", 70.0, 1.73, 9, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(10, "Pedri", "González", "2002-11-25", 60.0, 1.74, 10, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(11, "Ferran", "Torres", "2000-02-29", 77.0, 1.84, 11, "Delantero"));
        espanya.jugadores.add(new Futbolista(12, "Dani", "Olmo", "1998-05-07", 69.0, 1.79, 12, "Delantero"));
        espanya.jugadores.add(new Futbolista(13, "David", "Raya", "1995-09-15", 80.0, 1.83, 13, "Portero"));
        espanya.jugadores.add(new Futbolista(14, "José", "Gayà", "1995-05-25", 69.0, 1.72, 14, "Defensa"));
        espanya.jugadores.add(new Futbolista(15, "Rodri", "Hernández", "1996-06-22", 82.0, 1.91, 16, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(16, "Jordi", "Alba", "1989-03-21", 69.0, 1.70, 18, "Defensa"));
        espanya.jugadores.add(new Futbolista(17, "Ansu", "Fati", "2002-10-31", 66.0, 1.78, 17, "Delantero"));
        espanya.jugadores.add(new Futbolista(18, "Carlos", "Soler", "1997-01-02", 76.0, 1.80, 19, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(19, "Nico", "Williams", "2002-07-12", 62.0, 1.78, 12, "Delantero"));
        espanya.jugadores.add(new Futbolista(20, "Alejandro", "Balde", "2003-10-18", 66.0, 1.75, 14, "Defensa"));
        espanya.jugadores.add(new Futbolista(21, "Yeremy", "Pino", "2002-10-20", 65.0, 1.72, 21, "Delantero"));
        espanya.jugadores.add(new Futbolista(22, "Robert", "Sánchez", "1997-11-18", 90.0, 1.97, 22, "Portero"));
        espanya.jugadores.add(new Futbolista(23, "Hugo", "Guillamón", "2000-01-31", 75.0, 1.78, 15, "Defensa"));
        espanya.jugadores.add(new Futbolista(24, "Marco", "Asensio", "1996-01-21", 70.0, 1.82, 10, "Delantero"));
        espanya.jugadores.add(new Futbolista(25, "Pablo", "Sarabia", "1992-05-11", 70.0, 1.74, 22, "Delantero"));
        espanya.jugadores.add(new Futbolista(26, "Álvaro", "Rodríguez", "1995-07-22", 81.0, 1.88, 24, "Defensa"));

        for (int i = 0; i < espanya.jugadores.size(); i++) {
            System.out.println(espanya.jugadores.get(i));
        }
    }
}
