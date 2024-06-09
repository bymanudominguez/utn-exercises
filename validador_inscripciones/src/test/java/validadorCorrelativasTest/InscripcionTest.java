package validadorCorrelativasTest;

import org.junit.Assert;
import org.junit.Test;
import validadorCorrelativas.Alumno;
import validadorCorrelativas.Inscripcion;
import validadorCorrelativas.Materia;

public class InscripcionTest {
    @Test
    public void manuelSePuedeInscribirEnFisica(){
        Alumno manuel = new Alumno("Manuel Dominguez", "42304451");
        Materia fisica = new Materia("Fisica");
        Inscripcion manuelDominguezAFisica = new Inscripcion(manuel, fisica);

        Assert.assertTrue(manuelDominguezAFisica.aprobada());
    }

    @Test
    public void manuelNoSePuedeInscribirEnFisicaAvanzada(){
        Alumno manuel = new Alumno("Manuel Dominguez", "42304451");
        Materia fisica = new Materia("Fisica");
        Materia fisicaAvanzada = new Materia("Fisica Avanzada");

        fisicaAvanzada.agregarCorrelativa(fisica);

        Inscripcion manuelDominguezAFisicaAvanzada = new Inscripcion(manuel, fisicaAvanzada);

        Assert.assertFalse(manuelDominguezAFisicaAvanzada.aprobada());
    }

    @Test
    public void manuelSePuedeInscribirEnFisicaAvanzada(){
        Alumno manuel = new Alumno("Manuel Dominguez", "42304451");
        Materia fisica = new Materia("Fisica");
        Materia fisicaAvanzada = new Materia("Fisica Avanzada");

        fisicaAvanzada.agregarCorrelativa(fisica);

        manuel.agregarMateriaAprobada(fisica);

        Inscripcion manuelDominguezAFisicaAvanzada = new Inscripcion(manuel, fisicaAvanzada);

        Assert.assertTrue(manuelDominguezAFisicaAvanzada.aprobada());
    }
}
