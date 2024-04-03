package utn.tp1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {

    private String nombre;

    private Integer idAlumno;

    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, Integer idAlumno, Materia ... materiasAprobadas) {
        this.nombre = nombre;
        this.idAlumno = idAlumno;
        this.materiasAprobadas = new ArrayList<>();
        Collections.addAll(this.materiasAprobadas, materiasAprobadas);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
