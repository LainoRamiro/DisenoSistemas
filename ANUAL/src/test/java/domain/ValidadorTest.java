package domain;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ValidadorTest {

    String filePath = "./src/test/java/domain/10-million-password-list-top-10000.txt";
    CargaArchivo cargaArchivo = new CargaArchivo();

    List<String> contrasenasProhibidas = cargaArchivo.cargarContrasenasProhibidas(filePath);
    ValidadorContrasenas validadorContrasenas = new ValidadorContrasenas(contrasenasProhibidas);


    @Test
    public void contrasenaCorrectaNoPerteneceAlListadoYCumpleRegex(){
        String contrasena1 = "TeAmoEzito";
        Assert.assertTrue(validadorContrasenas.validarContrasena(contrasena1));
    }

    @Test
    public void contrasenaPerteneceAlListadoYCumpleRegex(){
        String contrasena1 = "password";
        Assert.assertFalse(validadorContrasenas.validarContrasena(contrasena1));
    }


    @Test
    public void contrasenaNoPerteneceAlListadoYNoCumpleRegex(){
        String contrasena1 = "password%";
        Assert.assertFalse(validadorContrasenas.validarContrasena(contrasena1));
    }


}
