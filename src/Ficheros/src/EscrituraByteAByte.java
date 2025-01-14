package Ficheros.src;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraByteAByte {
    public static void main(String[] args) throws Exception {
        /*FileOutputStream fi = null;

        try {
            fi = new FileOutputStream("prueba.dat");
            
            for (int i = 0; i < 6; i++) {
                fi.write(i);
            }

            
        } catch (Exception e) {
            System.out.println("Error");
        }*/

        //Flujo de Lectura Byte a Byte
        /*
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("prueba.dat");

            while (fi.available() > 0) {
                System.out.println(fi.read());
            }
        } catch (Exception e) {
           System.out.println("Error");
        }
         */
        //fLUJO DE ESCRITURA POR TIPO DE DATO 

        FileOutputStream fi2 = null;
        DataOutputStream flujodesalida = null;

        try {
            fi2 = new FileOutputStream("prueba.dat");
            flujodesalida = new DataOutputStream(fi2);

            for (int i = 65; i <= 90; i++) {
                flujodesalida.writeChar(i);
            }

            for (int x = 0; x <= 25; x++) {
                flujodesalida.writeInt(x);
            }
        } catch (IOException e) {
            flujodesalida.close();
            fi2.close();
        }

        //
    }
}   
