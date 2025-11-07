package BD.Cine.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BD.Cine.src.modelo.Pelicula;
import BD.Cine.src.util.ConexionBD;

public class PeliculaDAO {
    public void insertar(Pelicula pelicula) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "INSERT INTO Peliculas (Titulo, Genero, Duracion) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pelicula.getTitulo());
        ps.setString(2, pelicula.getGenero());
        ps.setInt(3, pelicula.getDuracion());
        ps.executeUpdate();
        ConexionBD.desconectar(con);
    }

    public ArrayList<Pelicula> listar() throws SQLException {
        Connection con = ConexionBD.conectar();
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        String sql = "SELECT * FROM Peliculas";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(); // donde guardo los datos de la consulta

        while (rs.next()) {
            Pelicula pelicula = new Pelicula();
            pelicula.setId(rs.getInt("ID_Pelicula"));
            pelicula.setTitulo(rs.getString("Titulo"));
            pelicula.setGenero(rs.getString("Genero"));
            pelicula.setDuracion(rs.getInt("Duracion"));
            peliculas.add(pelicula);
        }

        ConexionBD.desconectar(con);
        return peliculas;
    }

    public void actualizar(Pelicula pelicula) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "UPDATE Peliculas SET Titulo=?, Genero=?, Duracion=? WHERE ID_Pelicula=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pelicula.getTitulo());
        ps.setString(2, pelicula.getGenero());
        ps.setInt(3, pelicula.getDuracion());
        ps.setInt(4, pelicula.getId());
        ps.executeUpdate();
        System.out.println("pelicula actualizada correctamente");
        ConexionBD.desconectar(con);
    }

    public void eliminar(int id) throws SQLException{
        Connection con = ConexionBD.conectar();
        String sql = "DELETE FROM Peliculas WHERE ID_Pelicula=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Libro eliminado correctamente");
        ConexionBD.desconectar(con);
    }

    public static Pelicula buscar(int id) throws SQLException {
        Pelicula p = null;
        Connection con = ConexionBD.conectar();
        String sql = "SELECT * FROM Peliculas WHERE ID_Pelicula=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery(); 

        if (rs.next()) {
            p = new Pelicula();
            p.setId(rs.getInt("ID_Pelicula"));
            p.setTitulo(rs.getString("Titulo"));
            p.setGenero(rs.getString("Genero"));
            p.setDuracion(rs.getInt("Duracion"));
        }

        ConexionBD.desconectar(con);
        return p;
    }

    
}
