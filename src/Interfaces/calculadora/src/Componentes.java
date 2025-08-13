package Interfaces.calculadora.src;

import java.awt.*;
import javax.swing.*;
public class Componentes {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Componentes Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null); // Centrada

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Puedes cambiar a BorderLayout o GridLayout

        //  Texto
        JLabel etiqueta = new JLabel("Nombre:");
        JTextField campoTexto = new JTextField(15);

        //  Botones simples
        //JButton boton = new JButton("Enviar");

        //  Selección múltiple (CheckBox)
        
        JCheckBox check1 = new JCheckBox("Opción A");
        JCheckBox check2 = new JCheckBox("Opción B");
         

        //  Selección única (RadioButton)
        
        JRadioButton radio1 = new JRadioButton("Masculino");
        JRadioButton radio2 = new JRadioButton("Femenino");
        ButtonGroup grupoRadios = new ButtonGroup(); // Agrupar
        grupoRadios.add(radio1);
        grupoRadios.add(radio2);
        

        // ⬇ Lista desplegable
        
        // String[] paises = { "España", "Francia", "Italia" };
        // JComboBox<String> comboBox = new JComboBox<>(paises);
        

        //  Lista múltiple
        
        String[] lenguajes = { "Java", "Python", "C++", "JavaScript" };
        JList<String> listaMultiple = new JList<>(lenguajes);
        listaMultiple.setVisibleRowCount(3);
        // JScrollPane scrollLista = new JScrollPane(listaMultiple);
        
        //  Tabla (JTable)
        
        String[][] datos = {
            { "1", "Ana", "8.5" },
            { "2", "Luis", "9.0" },
            { "3", "María", "7.5" }
        };
        String[] columnas = { "ID", "Nombre", "Nota" };
        JTable tabla = new JTable(datos, columnas);
        // JScrollPane scrollTabla = new JScrollPane(tabla);
        tabla.setPreferredScrollableViewportSize(new Dimension(400, 70));
        
        //  Ejemplo para ir comentando/descomentando en clase
        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(check1);
        panel.add(check2);

        panel.add(radio1);
        panel.add(radio2);
        
        //panel.add(boton);
        
        //panel.add(radio1);
        panel.add(radio2);
        // panel.add(comboBox);
        // panel.add(scrollLista);
        // panel.add(scrollTabla);
         
        
        frame.add(panel);
        frame.setVisible(true);
        
    }
}
