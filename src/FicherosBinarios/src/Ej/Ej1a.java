package FicherosBinarios.src.Ej;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej1a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Ficheros Binarios");
            System.out.println("1.Agregar producto");
            System.out.println("2.Buscar producto");
            System.out.println("3. Listar Productos");
            System.out.println("4.Borrar producto");
            System.out.println("5.Actualizar un producto");

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
                    FileInputStream fis = null;
                    ObjectInputStream ois = null;
                    try {
                        fis = new FileInputStream("src/FicherosBinarios/productos.dat");

                        while (fis.available() > 0) {
                            ois = new ObjectInputStream(fis);
                            Producto p = (Producto) ois.readObject();

                            if (p.getId() == id) {
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

                    break;

                case 3:
                    FileInputStream fis2 = null;
                    ObjectInputStream ois2 = null;
                    try {
                        fis2 = new FileInputStream("src/FicherosBinarios/productos.dat");

                        while (fis2.available() > 0) {
                            ois2 = new ObjectInputStream(fis2);
                            System.out.println((Producto) ois2.readObject());

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
                case 4:
                    System.out.println("Introduce el id del producto a borrar");
                    int idBorrar = sc.nextInt();
                    ArrayList<Producto> productos = new ArrayList<Producto>();
                    FileInputStream fis3 = null;
                    ObjectInputStream ois3 = null;
                    try {
                        fis3 = new FileInputStream("src/FicherosBinarios/productos.dat");
                        
                        while (fis3.available() > 0) {
                            ois3 = new ObjectInputStream(fis3);
                            Producto p = (Producto) ois3.readObject();
                            if (p.getId() != idBorrar) {
                                productos.add(p);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            ois3.close();
                            fis3.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    FileOutputStream fos3 = null;
                    ObjectOutputStream oos3 = null;

                    try {
                        fos3 = new FileOutputStream("src/FicherosBinarios/productos.dat");
                        oos3 = new ObjectOutputStream(fos3);

                        for (Producto p : productos) {
                            oos3.writeObject(p);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    finally {
                        try {
                            oos3.close();
                            fos3.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Introduce el id del producto a actualizar");
                    int idActualizar = sc.nextInt();
                    ArrayList<Producto> productosActualizar = new ArrayList<Producto>();

                    FileInputStream fis4 = null;
                    ObjectInputStream ois4 = null;

                    try {
                        fis4 = new FileInputStream("src/FicherosBinarios/productos.dat");
                        

                        while (fis4.available() > 0) {
                            ois4 = new ObjectInputStream(fis4);
                            Producto p = (Producto) ois4.readObject();
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
                            ois4.close();
                            fis4.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    FileOutputStream fos4 = null;
                    ObjectOutputStream oos4 = null;

                    try {
                        fos4 = new FileOutputStream("src/FicherosBinarios/productos.dat");

                        for (Producto p : productosActualizar) {
                            oos4 = new ObjectOutputStream(fos4);
                            oos4.writeObject(p);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    finally{
                        try {
                            oos4.close();
                            fos4.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                default:
                    break;
            }

        } while (opcion != 0);

        sc.close();

    }

    // Leo el fichero y guardo los productos en un arraylist y cuando haya borrado o
    // actualizado el producto lo vuelvo a escribir
}
