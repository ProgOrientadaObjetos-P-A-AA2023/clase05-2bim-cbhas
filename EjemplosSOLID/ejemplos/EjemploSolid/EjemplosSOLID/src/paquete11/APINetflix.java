/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

// @cbhas & @OliverRobert33
