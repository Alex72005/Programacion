package Interfaces.calculadora.src;

import javax.swing.JFrame;
public class LayOut {
    public static void main(String[] args) {


        // 1. Crear la ventana principal
        JFrame frame = new JFrame("Ejemplos de Layout"); // Crear ventana
        frame.setSize(500, 400); // Definir tamaño
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar al salir
        frame.setLocationRelativeTo(null); //centrar la ventana

        //1 FlowLayout (por defecto en JPanel) 
        
        //JPanel panel = new JPanel(new FlowLayout());
        /*
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(new JButton("Uno"));
        panel.add(new JButton("Dos"));
        panel.add(new JButton("Tres"));
        frame.add(panel);
         */
        // 2. BorderLayout (por defecto en JFrame)
        /*
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JButton("Norte"), BorderLayout.NORTH);
        panel.add(new JButton("Sur"), BorderLayout.SOUTH);
        panel.add(new JButton("Este"), BorderLayout.EAST);
        panel.add(new JButton("Oeste"), BorderLayout.WEST);
        panel.add(new JButton("Centro"), BorderLayout.CENTER);
        frame.add(panel);
          */

        // 3. GridLayout
        /*
        JPanel panel = new JPanel(new GridLayout(2, 2,6,6));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        frame.add(panel);
         */

        // Mostrar la ventana
        frame.setVisible(true);
        
    }
}
