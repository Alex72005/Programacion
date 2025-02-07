package Tareas.Tarea_14.src;

import java.io.File;
import java.util.TreeSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class App {
    public static void main(String[] args) {
        TreeSet<Paciente> pacientes = new TreeSet<Paciente>();

        pacientes.add(new Paciente(10, 1, "Cesar", "Gallego", "Celiaco"));
        pacientes.add(new Paciente(10, 2, "Alberto", "Marcos", "Intolerante a la Lactosa"));
        pacientes.add(new Paciente(11, 1, "Victor", "Romero", "Diabético"));
        pacientes.add(new Paciente(11, 2, "Alvaro", "Villalba", "Vegano"));
        pacientes.add(new Paciente(12, 1, "Rafa", "Luque", "Sin restricciones"));

        DocumentBuilderFactory dbf;
        DocumentBuilder db;
        Document doc = null;
        Element eRaiz = null;
        try {
            // Creacion XML
            dbf = DocumentBuilderFactory.newInstance();
            db = dbf.newDocumentBuilder();
            doc = db.newDocument();

            eRaiz = doc.createElement("pacientes");
            doc.appendChild(eRaiz);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Paciente p : pacientes) {
            //Estructura del elemento XML
            Element ePaciente = doc.createElement("paciente");

            Element eHabitacion = doc.createElement("habitacion");
            eHabitacion.appendChild(doc.createTextNode(Integer.toString(p.getHabitacion())));
            ePaciente.appendChild(eHabitacion);

            Element eCama = doc.createElement("cama");
            eCama.appendChild(doc.createTextNode(Integer.toString(p.getCama())));
            ePaciente.appendChild(eCama);

            Element eNombre = doc.createElement("nombre");
            eNombre.appendChild(doc.createTextNode(p.getNombre()));
            ePaciente.appendChild(eNombre);

            Element eApellidos = doc.createElement("apellidos");
            eApellidos.appendChild(doc.createTextNode(p.getApellidos()));
            ePaciente.appendChild(eApellidos);

            Element eDieta = doc.createElement("dieta");
            eDieta.appendChild(doc.createTextNode(p.getDieta()));
            ePaciente.appendChild(eDieta);

            eRaiz.appendChild(ePaciente);
        }

        try {
            // clases necesarias finalizar la creacion del archivo xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/Tareas/Tarea_14/tarea_14.xml"));

            transformer.transform(source, result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Archivo generado: tarea_14.xml");
    }
}
