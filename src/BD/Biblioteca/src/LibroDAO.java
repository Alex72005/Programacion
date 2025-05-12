package BD.Biblioteca.src;

import java.sql.*;
import java.util.ArrayList;

public class LibroDAO {
    public void insertar(Libro libro) throws SQLException{
        Connection con = ConexionBD.conectar();
        String sql = "INSERT INTO Libros (Titulo, Autor, Año_Publicacion, Genero, Disponible) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, libro.getTitulo());
        ps.setString(2, libro.getAutor());
        ps.setInt(3, libro.getAñoPublicacion());
        ps.setString(4, libro.getGenero());
        ps.setBoolean(5, libro.isDisponible());
        ps.executeUpdate();
        ConexionBD.desconectar(con);
    }

    public ArrayList<Libro> listar() throws SQLException{
        ArrayList<Libro> lista = new ArrayList<Libro>();
        Connection con = ConexionBD.conectar();
        String sql = "SELECT * FROM Libros";
        PreparedStatement ps = con.prepareStatement(sql); 
        ResultSet rs = ps.executeQuery(); 

        while (rs.next()) {
            Libro libro = new Libro();
            libro.setId(rs.getInt("ID_Libro"));
            libro.setTitulo(rs.getString("Titulo"));
            libro.setAutor(rs.getString("Autor"));
            libro.setAñoPublicacion(rs.getInt("Año_Publicacion"));
            libro.setGenero(rs.getString("Genero"));
            libro.setDisponible(rs.getBoolean("Disponible"));
            lista.add(libro);
        }
        
        ConexionBD.desconectar(con);
        return lista;
    }

    public void actualizar(Libro libro) throws SQLException{
        Connection con = ConexionBD.conectar();
        String sql = "UPDATE Libros SET Titulo=?, Autor=?, Año_Publicacion=?, Genero=?, Disponible=? WHERE ID_Libro=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, libro.getTitulo());
        ps.setString(2, libro.getAutor());
        ps.setInt(3, libro.getAñoPublicacion());
        ps.setString(4, libro.getGenero());
        ps.setBoolean(5, libro.isDisponible());
        ps.setInt(6, libro.getId());
        ps.executeUpdate();
        System.out.println("Libro actualizado correctamente.");
        ConexionBD.desconectar(con);
        
    }

    public void eliminar(int id) throws SQLException{
        Connection con = ConexionBD.conectar();
        String sql = "DELETE FROM Libros WHERE ID_Libro=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Libro eliminado correctamente.");
        ConexionBD.desconectar(con);
    }
}
