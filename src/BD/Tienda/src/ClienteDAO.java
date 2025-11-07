package BD.Tienda.src;

import java.sql.*;
import java.util.*;

public class ClienteDAO {
    public void registrar(Cliente c) throws SQLException{
        Connection con = ConexionBD.conectar(); 
        String sql = "INSERT INTO Clientes (nombre, apellidos, email, telefono) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, c.getNombre());
        ps.setString(2, c.getApellidos());
        ps.setString(3, c.getEmail());
        ps.setString(4, c.getTelefono());
        ps.executeUpdate(); //Hacemos la insercion
        con.close();
    }

    public List<Cliente> listar() throws SQLException{
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        Connection con = ConexionBD.conectar();  
        String sql = "SELECT * FROM Clientes";
        PreparedStatement ps = con.prepareStatement(sql); 
        ResultSet rs = ps.executeQuery(); 

        while (rs.next()) {
            Cliente c = new Cliente();
            c.setId(rs.getInt("ID"));
            c.setNombre(rs.getString("nombre"));
            c.setApellidos(rs.getString("apellidos"));
            c.setEmail(rs.getString("email"));
            c.setTelefono(rs.getString("telefono"));
            listaClientes.add(c);
        }

        con.close();
        return listaClientes;
    }

    public void actualizar(Cliente c) throws SQLException{
        Connection con = ConexionBD.conectar(); 
        String sql = "UPDATE Clientes SET nombre=?, apellidos=?, email=?, telefono=? WHERE ID=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, c.getNombre());
        ps.setString(2, c.getApellidos());
        ps.setString(3, c.getEmail());
        ps.setString(4, c.getTelefono());
        ps.setInt(5, c.getId());
        ps.executeUpdate(); //Hacemos la insercion
        con.close();
    }

    public void eliminar(Cliente c) throws SQLException{
        Connection con = ConexionBD.conectar(); 
        String sql = "DELETE FROM Clientes WHERE ID=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, c.getId());
        ps.executeUpdate(); //Hacemos la insercion
        con.close();
    }   

    public List<Cliente> buscar(String nombre) throws SQLException{
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        Connection con = ConexionBD.conectar(); 
        String sql = "SELECT * FROM Clientes WHERE nombre LIKE ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "%" + nombre + "%");
        ResultSet rs = ps.executeQuery(); 

        while (rs.next()) {
            Cliente c = new Cliente();
            c.setId(rs.getInt("ID"));
            c.setNombre(rs.getString("nombre"));
            c.setApellidos(rs.getString("apellidos"));
            c.setEmail(rs.getString("email"));
            c.setTelefono(rs.getString("telefono"));
            listaClientes.add(c);
        }

        con.close();
        return listaClientes;
    }
}
