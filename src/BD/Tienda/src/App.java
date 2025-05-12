package BD.Tienda.src;

import java.util.List;
import java.util.Scanner;

//javac -cp "lib/mysql-connector-j-9.3.0.jar" -d ../../../bin src/*.java   
//java "-Dfile.encoding=UTF-8" -cp "lib/mysql-connector-j-9.3.0.jar;../../../bin" BD.Tienda.src.App

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ClienteDAO cdao = new ClienteDAO();
        int option = 0;

        do {
            System.out.println("MENÚ");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Actualizar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Buscar por Nombre");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
            sc.nextLine(); // limpia el buffer del enter

            try {
                switch (option) {
                    case 1:
                        Cliente nuevo = new Cliente();  
                        System.out.print("Nombre: ");
                        nuevo.setNombre(sc.nextLine());
                        System.out.print("Apellidos: ");
                        nuevo.setApellidos(sc.nextLine());
                        System.out.print("Email: ");
                        nuevo.setEmail(sc.nextLine());
                        System.out.print("Teléfono: ");
                        nuevo.setTelefono(sc.nextLine());
                        cdao.registrar(nuevo);
                        System.out.println("Cliente registrado.");
                        break;
                    case 2:
                        List<Cliente> clientes = cdao.listar();
                        System.out.println("Lista de clientes");
                        for (Cliente c : clientes) {
                            System.out.println(c.getId() + ": " + c.getNombre() + " " + c.getApellidos() + ", "
                                    + c.getEmail() + ", " + c.getTelefono());
                        }
                        break;
                    case 3:
                        Cliente editar = new Cliente();
                        System.out.print("ID del cliente a actualizar: ");
                        editar.setId(sc.nextInt()); // Lee el ID
                        sc.nextLine(); // limpia el buffer
                        System.out.print("Nuevo nombre: ");
                        editar.setNombre(sc.nextLine());
                        System.out.print("Nuevo apellido: ");
                        editar.setApellidos(sc.nextLine());
                        System.out.print("Nuevo email: ");
                        editar.setEmail(sc.nextLine());
                        System.out.print("Nuevo teléfono: ");
                        editar.setTelefono(sc.nextLine());
                        cdao.actualizar(editar); // Actualiza el cliente en la base de datos
                        System.out.println("Cliente actualizado.");
                        break;
                    case 4:
                        Cliente eliminar = new Cliente();
                        System.out.print("ID del cliente a eliminar: ");
                        eliminar.setId(sc.nextInt()); // Solo necesitamos el ID
                        cdao.eliminar(eliminar); // Elimina el cliente usando su ID
                        System.out.println("Cliente eliminado.");
                        break;
                    case 5:
                        System.out.print("Digame el nombre a buscar: ");
                        String nombreBuscar = sc.nextLine();
                        List<Cliente> resultados = cdao.buscar(nombreBuscar);
                        if (resultados.isEmpty()) {
                            System.out.println("No se encontraron clientes.");
                        } else {
                            System.out.println("Resultados de la búsqueda: ");
                            for (Cliente c : resultados) {
                                System.out.println(c.getId() + ": " + c.getNombre() + " " + c.getApellidos() + ", " + c.getEmail() + ", " + c.getTelefono());
                            }
                        }
                        break;

                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (option > 0);
        sc.close();
    }
}
