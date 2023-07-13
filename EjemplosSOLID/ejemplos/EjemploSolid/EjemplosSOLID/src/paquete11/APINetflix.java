package paquete11;

public class APINetflix implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        int numRandom = (int) (Math.random() * 13434);
        apiKey = ak + numRandom;
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}
