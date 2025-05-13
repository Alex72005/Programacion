package BD.Cine.src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BD.Cine.src.modelo.Sala;
import BD.Cine.src.util.ConexionBD;

public class SalaDAO {
    public void insertar(Sala sala) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "INSERT INTO Salas (Nombre, Capacidad) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, sala.getNombre());
        ps.setInt(2, sala.getCapacidad());
        ps.executeUpdate();
        ConexionBD.desconectar(con);
    }

    public ArrayList<Sala> listar() throws SQLException {
        Connection con = ConexionBD.conectar();
        ArrayList<Sala> salas = new ArrayList<Sala>();
        String sql = "SELECT * FROM Salas";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(); // donde guardo los datos de la consulta

        while (rs.next()) {
            Sala sala = new Sala();
            sala.setId(rs.getInt("ID_Sala"));
            sala.setNombre(rs.getString("Nombre"));
            sala.setCapacidad(rs.getInt("Capacidad"));
            salas.add(sala);
        }

        ConexionBD.desconectar(con);
        return salas;
    }

    public void actualizar(Sala sala) throws SQLException {
        Connection con = ConexionBD.conectar();
        String sql = "UPDATE Salas SET Nombre=?, Capacidad=? WHERE ID_Sala=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, sala.getNombre());
        ps.setInt(2, sala.getCapacidad());
        ps.setInt(3, sala.getId());
        ps.executeUpdate();
        System.out.println("Sala actualizada correctamente");
        ConexionBD.desconectar(con);
    }

    public void eliminar(int id) throws SQLException{
        Connection con = ConexionBD.conectar();
        String sql = "DELETE FROM Salas WHERE ID_Sala=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Sala eliminada correctamente");
        ConexionBD.desconectar(con);
    }

    public static Sala buscar(int id) throws SQLException{
        Sala s = null;
        Connection con = ConexionBD.conectar();
        String sql = "SELECT * FROM Salas WHERE ID_Sala=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery(); 

        if (rs.next()) {
           s = new Sala();
           s.setId(rs.getInt("ID_Sala"));
           s.setNombre(rs.getString("Nombre"));
           s.setCapacidad(rs.getInt("Capacidad"));
        }

        ConexionBD.desconectar(con);
        return s;
    }   


}
