package paquete11;

public class APIStarPlus implements APIMovie {

    private String apiKey;
    private int numRandom = (int) (Math.random() * 1232341);

    @Override
    public void establecerApiKey(String ak) {
        apiKey = ak + "STARPLUS" + numRandom;
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}

// @cbhas & @OliverRobert33
