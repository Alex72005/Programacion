package FicherosBinarios.src.Ej;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Ficheros Binarios");
            System.out.println("1.Agregar producto");
            System.out.println("2.Buscar producto");
            System.out.println("3. Listar Productos");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;
                    try {
                        fos = new FileOutputStream("src/FicherosBinarios/productos.dat", true);
                        oos = new ObjectOutputStream(fos);

                        System.out.println("Introduce un id");
                        int id = sc.nextInt();
                        System.out.println("Introduce un nombre");
                        sc.next();
                        String nombre = sc.nextLine();
                        System.out.println("Introduce un precio");
                        double precio = sc.nextDouble();
                        System.out.println("Introduce una cantidad");
                        int cantidad = sc.nextInt();

                        Producto p = new Producto(id, nombre, precio, cantidad);
                        oos.writeObject(p);

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
                    break;
                case 2:
                    System.out.println("Introduce el id a buscar");
                    int id = sc.nextInt();
                    FileInputStream fis2 = null;
                    ObjectInputStream ois2 = null;
                    try {
                        fis2 = new FileInputStream("src/FicherosBinarios/productos.dat");

                        while (fis2.available() > 0) {
                            ois2 = new ObjectInputStream(fis2);
                            Producto p = (Producto) ois2.readObject();

                            if (p.getId() == id) {
                                System.out.println(p);
                            }

                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            ois2.close();
                            fis2.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    break;

                case 3:
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

                    break;
                default:
                    break;
            }

        } while (opcion != 0);

    }

    //Leo el fichero y guardo los productos en un arraylist y cuando haya borrado o actualizado el producto lo vuelvo a escribir 
}
