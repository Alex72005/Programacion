package FicherosBinarios.src.Ej;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Ficheros Binarios");
            System.out.println("1.Agregar producto");
            System.out.println("2.Buscar producto");
            System.out.println("3. Listar Productos");
            System.out.println("4.Borrar producto");
            System.out.println("5.Actualizar un producto");
            System.out.println("0.Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    agregarProducto(sc);
                    break;
                case 2:
                    buscarProducto(sc);
                    break;
                case 3:
                    listarProductos();
                    break;
                case 4:
                    borrarProducto(sc);
                    break;
                case 5:
                    actualizarProducto(sc);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (option != 0);

        sc.close();
    }

    private static void agregarProducto(Scanner sc) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("src/FicherosBinarios/productos.dat", true);
            oos = new ObjectOutputStream(fos);

            System.out.println("Introduce un id");
            int id = sc.nextInt();
            System.out.println("Introduce un nombre");
            String nombre = sc.nextLine();
            nombre = sc.nextLine();
            System.out.println("Introduce un precio");
            double precio = sc.nextDouble();
            System.out.println("Introduce una cantidad");
            int cantidad = sc.nextInt();

            Producto p = new Producto(id, nombre, precio, cantidad);
            oos.writeObject(p);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void buscarProducto(Scanner sc) {
        System.out.println("Introduce el id a buscar");
        int idBuscar = sc.nextInt();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("src/FicherosBinarios/productos.dat");

            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Producto p = (Producto) ois.readObject();

                if (p.getId() == idBuscar) {
                    System.out.println(p);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            try {
                ois.close();
                fis.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void listarProductos() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("src/FicherosBinarios/productos.dat");

            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                System.out.println((Producto) ois.readObject());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            try {
                ois.close();
                fis.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void borrarProducto(Scanner sc) {
        System.out.println("Introduce el id del producto a borrar");
        int idBorrar = sc.nextInt();
        ArrayList<Producto> productos = new ArrayList<Producto>();

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("src/FicherosBinarios/productos.dat");

            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Producto p = (Producto) ois.readObject();
                if (p.getId() != idBorrar) {
                    productos.add(p);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("src/FicherosBinarios/productos.dat");
            oos = new ObjectOutputStream(fos);

            for (Producto p : productos) {
                oos.writeObject(p);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void actualizarProducto(Scanner sc) {
        System.out.println("Introduce el id del producto a actualizar");
        int idActualizar = sc.nextInt();
        ArrayList<Producto> productosActualizar = new ArrayList<Producto>();

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("src/FicherosBinarios/productos.dat");
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Producto p = (Producto) ois.readObject();
                if (p.getId() == idActualizar) {
                    System.out.println("Introduce el nuevo nombre");
                    String nombre = sc.nextLine();
                    nombre = sc.nextLine();
                    System.out.println("Introduce el nuevo precio");
                    double precio = sc.nextDouble();
                    System.out.println("Introduce la nueva cantidad");
                    int cantidad = sc.nextInt();
                    p = new Producto(idActualizar, nombre, precio, cantidad);
                }
                productosActualizar.add(p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                ois.close();
                fis.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("src/FicherosBinarios/productos.dat");

            for (Producto p : productosActualizar) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(p);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
