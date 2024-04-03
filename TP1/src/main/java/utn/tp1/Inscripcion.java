package utn.tp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {

    private Integer idInscripcion;

    private List<Materia> materiasInscripcion;

    private Alumno alumno;

    public Inscripcion(Integer idInscripcion, Alumno alumno,Materia ... materiasInscripcion) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materiasInscripcion = new ArrayList<>();
        Collections.addAll(this.materiasInscripcion, materiasInscripcion);
    }

    public boolean aprobada(){

        return this.materiasInscripcion.stream().allMatch(this::verificaCorrelativaUnaMateria);
    }

    public boolean verificaCorrelativaUnaMateria(Materia materia){
       return alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas());

    }
}
