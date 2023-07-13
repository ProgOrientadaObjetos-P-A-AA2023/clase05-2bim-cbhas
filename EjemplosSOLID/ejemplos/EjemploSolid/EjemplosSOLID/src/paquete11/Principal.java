package paquete11;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        String nombreArchivo = "usuarios.txt";
        String url = "http://api.movie?api=";

        ArchivoLectura archivo = new ArchivoLectura(nombreArchivo);
        archivo.cerrarArchivo();

        ArrayList<GeneradorPelicula> lista = new ArrayList<>();
        ArrayList<String[]> datos = archivo.obtenerDatos();

        for (int i = 0; i < datos.size(); i++) {
            String[] dato = datos.get(i);

            GeneradorPelicula gp = new GeneradorPelicula();

            gp.establecerUsuario(dato[1]);
            String apikey = dato[1] + dato[2].toUpperCase();

            String valorBuscado = dato[2];

            if (valorBuscado.equals("Netflix")) {
                APINetflix apiN = new APINetflix();
                apiN.establecerApiKey(apikey);
                gp.establecerLlave(apiN);

            } else if (dato[2].equals("Disney")) {
                APIDisney apiD = new APIDisney();
                apiD.establecerApiKey(apikey);
                gp.establecerLlave(apiD);

            } else if (dato[2].equals("Amazon")) {
                APIAmazonMovie apiA = new APIAmazonMovie();
                apiA.establecerApiKey(apikey);
                gp.establecerLlave(apiA);

            } else if (dato[2].equals("Startplus")) {
                APIStartplus apiS = new APIStartplus();
                apiS.establecerApiKey(apikey);
                gp.establecerLlave(apiS);
            }
            gp.establecerUrl(url);
            lista.add(gp);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%s",
                    lista.get(i));
        }

        System.out.println("=======================================================");
    }

}


// @cbhas & @OliverRobert33
