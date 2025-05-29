import java.sql.*;
import java.util.ArrayList;

public class ContenidoDAO {
    public void insertar(Contenido contenido) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "INSERT INTO Contenido (titulo, tipo, genero, duracion_min, estreno, valoracion) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, contenido.getTitulo());
        ps.setString(2, contenido.getTipo());
        ps.setString(3, contenido.getGenero());
        ps.setInt(4, contenido.getDuracion_min());
        ps.setString(5, contenido.getEstreno());
        ps.setDouble(6, contenido.getValoracion());
        ps.executeUpdate();
        ConexionBD.desconectar(con);
    }

    public ArrayList<Contenido> listarPeliculas() throws SQLException {
        Connection con = ConexionBD.conectar();
        ArrayList<Contenido> peliculas = new ArrayList<Contenido>();
        String sql = "SELECT * FROM Contenido WHERE tipo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "pelicula");
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
            peliculas.add(c);
        }
        return peliculas;
    }

    public ArrayList<Contenido> listarSeries() throws SQLException {
        Connection con = ConexionBD.conectar();
        ArrayList<Contenido> series = new ArrayList<Contenido>();
        String sql = "SELECT * FROM Contenido WHERE tipo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "serie");
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
            series.add(c);
        }
        return series;
    }

    public void actualizarTitulo(String titulo, int id) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "UPDATE Contenido SET titulo=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, titulo);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Contenido actualizada correctamente");
        ConexionBD.desconectar(con);
    }

    public void actualizarTipo(String tipo, int id) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "UPDATE Contenido SET tipo=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tipo);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Contenido actualizada correctamente");
        ConexionBD.desconectar(con);
    }

    public void actualizarGenero(String genero, int id) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "UPDATE Contenido SET genero=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, genero);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Contenido actualizada correctamente");
        ConexionBD.desconectar(con);
    }

    public void actualizarDuracion(int duracion, int id) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "UPDATE Contenido SET duracion_min=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, duracion);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Contenido actualizada correctamente");
        ConexionBD.desconectar(con);
    }

    public void actualizarEstreno(String estreno, int id) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "UPDATE Contenido SET estreno=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, estreno);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Contenido actualizada correctamente");
        ConexionBD.desconectar(con);
    }

    public void actualizarValoracion(double valoracion, int id) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "UPDATE Contenido SET valoracion=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, valoracion);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Contenido actualizada correctamente");
        ConexionBD.desconectar(con);
    }

    public void eliminarPorID(int id) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "DELETE FROM Contenido WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Contenido eliminado correctamente.");
        ConexionBD.desconectar(con);
    }

    public void eliminarPorTitulo(String titulo) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "DELETE FROM Contenido WHERE titulo=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, titulo);
        ps.executeUpdate();
        System.out.println("Contenido eliminado correctamente.");
        ConexionBD.desconectar(con);
    }

    public ArrayList<Contenido> mejoresPeliculas() throws SQLException{
        Connection con = ConexionBD.conectar();
        ArrayList<Contenido> co = new ArrayList<>();
        String sql = "SELECT * FROM Contenido WHERE tipo =? ORDER BY valoracion DESC LIMIT 0,3";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "pelicula");
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
            co.add(c);
        }

        ConexionBD.desconectar(con);
        return co;
    }

    public ArrayList<Contenido> mejoresSeries() throws SQLException{
        Connection con = ConexionBD.conectar();
        ArrayList<Contenido> co = new ArrayList<>();
        String sql = "SELECT * FROM Contenido WHERE tipo =? ORDER BY valoracion DESC LIMIT 0,3";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "serie");
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
            co.add(c);
        }

        ConexionBD.desconectar(con);
        return co;
    }

    public Contenido buscarPorTitulo(String titulo) throws SQLException {
        Contenido p = null;
        Connection con = ConexionBD.conectar();
        String sql = "SELECT * FROM Contenido WHERE titulo=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, titulo);
        ResultSet rs = ps.executeQuery(); 

        if (rs.next()) {
            p = new Contenido();
            p.setId(rs.getInt("id"));
            p.setTitulo(rs.getString("titulo"));
            p.setTipo(rs.getString("tipo"));
            p.setGenero(rs.getString("genero"));
            p.setDuracion_min(rs.getInt("duracion_min"));
            p.setEstreno(rs.getString("estreno"));
            p.setValoracion(rs.getInt("valoracion"));
        }

        ConexionBD.desconectar(con);
        return p;
    }
}
