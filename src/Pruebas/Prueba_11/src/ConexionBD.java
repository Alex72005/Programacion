package Pruebas.Prueba_11.src;

import java.sql.*;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/netflix";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectar() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
        
    }

    public static void desconectar(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Error al desconectar: " + e.getMessage());
        }
    }
}
