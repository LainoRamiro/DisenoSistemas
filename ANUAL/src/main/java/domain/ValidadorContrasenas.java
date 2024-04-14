package domain;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorContrasenas {
    private List<String> contrasenasProhibidas;
    public ValidadorContrasenas(List<String> contrasenasProhibidas){
        this.contrasenasProhibidas = contrasenasProhibidas;
    }

    public boolean validarContrasena(String contrasena){
        return !contrasenasProhibidas.contains(contrasena) && regex(contrasena);
    }

    private boolean regex(String contrasena){
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_+&*-]{8,}", Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(contrasena);
        return matcher.matches();
    }
}
