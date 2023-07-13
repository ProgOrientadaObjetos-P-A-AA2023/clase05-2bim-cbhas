package paquete11;

public class GeneradorPelicula {

    private APIMovie llave;
    private String url;
    private String usuario;

    public void establecerLlave(APIMovie ll) {
        llave = ll;
    }

    public void establecerUrl(String l) {
        url = String.format("%s%s",
                l,
                obtenerLlave().obtenerApiKey());
    }

    public void establecerUsuario(String u) {
        usuario = u;
    }

    public APIMovie obtenerLlave() {
        return llave;
    }

    public String obtenerUrl() {
        return url;
    }

    public String obtenerUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("=======================================================\n"
                + "  User: %s\t\n"
                + "  Llave %s\t\n"
                + "  URL:  %s\n",
                usuario,
                llave.obtenerApiKey(),
                url);

        return cadena;
    }

}

// @cbhas & @OliverRobert33
