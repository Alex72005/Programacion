package Pruebas.Prueba_11.src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ValoracionDAO {
    public void insertar(Valoracion valoracion) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "INSERT INTO Valoracion (id_contenido, nombre_usuario, puntuacion, comentario) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, valoracion.getId_contenido());
        ps.setString(2, valoracion.getNombre_usuario());
        ps.setInt(3, valoracion.getPuntuacion());
        ps.setString(4, valoracion.getComentario());
        ps.executeUpdate();
        ConexionBD.desconectar(con);
    }

    public ArrayList<Contenido> mostrarSinValoracion() throws SQLException {
        ArrayList<Contenido> sinValoracion = new ArrayList<>();
        Connection con = ConexionBD.conectar();
        String sql = "SELECT * FROM Contenido c LEFT JOIN Valoracion v on c.id = v.id_contenido where v.id_contenido is NULL";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Contenido c = new Contenido();
            c.setId(rs.getInt("id"));
            c.setTitulo(rs.getString("titulo"));
            c.setTipo(rs.getString("tipo"));
            c.setGenero(rs.getString("genero"));
            c.setDuracion_min(rs.getInt("duracion_min"));
            c.setEstreno(rs.getString("estreno"));
            c.setValoracion(rs.getDouble("valoracion"));
            sinValoracion.add(c);
        }

        ConexionBD.desconectar(con);
        return sinValoracion;
    }

}
