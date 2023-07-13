package paquete11;

public class GeneradorPelicula {

    private APIMovie llave;
    private String url;
    private String user;

    public APIMovie obtenerLlave() {
        return llave;
    }

    public void establecerLlave(APIMovie l) {
        llave = l;
    }

    public String obtenerUser() {
        return user;
    }

    public void establecerUser(String u) {
        user = u;
    }

    public String obtenerUrl() {
        return url;
    }

    public void establecerUrl(String l) {
        url = String.format("%s%s", l, obtenerLlave().obtenerApiKey());
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("=======================================================\n"
                + "  User: %s\t\n"
                + "  Llave %s\t\n"
                + "  URL:  %s\n",
                user,
                llave.obtenerApiKey(),
                url);

        return cadena;
    }
    
}

// @cbhas & @OliverRobert33
