package paquete11;

public class APIDisney implements APIMovie {

    private String apiKey;
    private int numRandom = (int) (Math.random() * 1232341);

    @Override
    public void establecerApiKey(String usuario) {
        apiKey = usuario + "DISNEY" + numRandom;
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}

// @cbhas & @OliverRobert33
