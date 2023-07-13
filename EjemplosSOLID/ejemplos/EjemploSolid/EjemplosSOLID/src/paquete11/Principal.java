package paquete11;

import java.util.ArrayList;
import static paquete11.LecturaArchivo.leerArchivo;

public class Principal {

    public static void main(String[] args) {

        ArrayList<String> lista = leerArchivo();
        ArrayList<GeneradorPelicula> generadores = new ArrayList();

        for (int i = 0; i < lista.size(); i++) {
            String[] partes = lista.get(i).split(";");
            String user = partes[1];
            String ak = user;
            String url = "http://api.movie?api=";

            GeneradorPelicula gp = new GeneradorPelicula();
            gp.establecerUser(ak);

            if ("Netflix".equals(partes[2])) {
                APINetflix netflix = new APINetflix();
                netflix.establecerApiKey(ak);
                gp.establecerLlave(netflix);
                gp.establecerUrl(url);

            } else if ("Disney".equals(partes[2])) {
                APIDisney disney = new APIDisney();
                disney.establecerApiKey(ak);
                gp.establecerLlave(disney);
                gp.establecerUrl(url);

            } else if ("Amazon".equals(partes[2])) {
                APIAmazon amazon = new APIAmazon();
                amazon.establecerApiKey(ak);
                gp.establecerLlave(amazon);
                gp.establecerUrl(url);

            } else if ("Starplus".equals(partes[2])) {
                APIStarPlus starplus = new APIStarPlus();
                starplus.establecerApiKey(ak);
                gp.establecerLlave(starplus);
                gp.establecerUrl(url);
            }

            generadores.add(gp);
        }

        for (int i = 0; i < generadores.size(); i++) {
            System.out.printf("%s", generadores.get(i));
        }

        System.out.println("=======================================================");

    }
    
}

// @cbhas & @OliverRobert33
