package domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CargaArchivo {

    public List<String> cargarContrasenasProhibidas(String filePath){
        List<String> contrasenas = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                contrasenas.add(line.trim());
            }
        } catch (IOException e){
            e.printStackTrace();

        }
        return contrasenas;
    }
}
