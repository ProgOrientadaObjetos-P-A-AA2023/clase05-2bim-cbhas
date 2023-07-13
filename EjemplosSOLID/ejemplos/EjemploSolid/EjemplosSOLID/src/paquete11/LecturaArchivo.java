package paquete11;

import java.io.*;
import java.util.*;

public class LecturaArchivo {

    public static ArrayList<String> leerArchivo() {
        ArrayList<String> usuarios = new ArrayList<>();

        try {
            File archivo = new File("datos\\usuarios.txt");
            Scanner entrada = new Scanner(archivo);

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                usuarios.add(linea);
            }

            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e + "Error: Archivo no encontrado");
        }

        return usuarios;
    }
    
}

// @cbhas & @OliverRobert33
