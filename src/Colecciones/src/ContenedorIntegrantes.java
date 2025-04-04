package Colecciones.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContenedorIntegrantes<T extends Integrante> {
    private List<T> integrantes;
    
    public ContenedorIntegrantes() {
        this.integrantes = new ArrayList<>();
    }
    
    public void agregarIntegrante(T integrante) {
        integrantes.add(integrante);
    }
    
    public List<T> getIntegrantesOrdenados() {
        List<T> copia = new ArrayList<>(integrantes);
        Collections.sort(copia);
        return copia;
    }
    
    public T getMasJoven() {
        if (integrantes.isEmpty()) return null;
        return Collections.min(integrantes);
    }

    public T buscarIntegrante(T buscado){
        for (T t : integrantes) {
            if (t.equals(buscado)) {
                return buscado;
            }
        }
        return null;
    }
}
