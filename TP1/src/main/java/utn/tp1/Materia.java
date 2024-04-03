package utn.tp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Materia {

    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, Materia ... correlativas) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
        Collections.addAll(this.correlativas, correlativas);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
