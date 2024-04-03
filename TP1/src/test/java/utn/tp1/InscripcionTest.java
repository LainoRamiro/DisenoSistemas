package utn.tp1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InscripcionTest {

    Materia algoritmos = new Materia("algoritmos");
    Materia proyectoFinalQuimica = new Materia("proyectoFinalQuimica");
    Materia paradigmas = new Materia("paradigmas", algoritmos);

    Materia discreta = new Materia("discreta");

    Materia sintaxis = new Materia("sintaxis", discreta, algoritmos);



    @Test
    public void inscripcionCounUnaMateriaEstaAprobada() {


        Alumno ramiro = new Alumno("Ramiro", 1758834, algoritmos, proyectoFinalQuimica);

        Inscripcion inscripcion1 = new Inscripcion(1, ramiro, paradigmas);

        Assert.assertTrue(inscripcion1.aprobada());

    }

    @Test
    public void inscripcionConUnaMateriaQueNoTieneElAlumnoAprobadaComoCorrelativa(){

        Alumno ezequiel = new Alumno("ezequiel", 1470670, algoritmos);

        Inscripcion inscripcion2 = new Inscripcion(2, ezequiel, sintaxis);

        Assert.assertFalse(inscripcion2.aprobada());

    }

    @Test
    public void inscripcionDeAlumnoSinMateriasAUnaMateriaQueNOTieneCorrelativa(){
        Alumno ezequiel = new Alumno("ezequiel", 1470670);
        Inscripcion inscripcion3 = new Inscripcion(3, ezequiel, algoritmos);

    }
}
