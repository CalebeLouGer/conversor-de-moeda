package br.com.classe.modelo;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorApi{
    public void conversor(String converterDe, String converterPara, double valorParaConversao) throws IOException, InterruptedException {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/3d1d2d04b46b6d611a0f1ce5/pair/"+converterDe+"/"+converterPara);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        JsonElement elemento = JsonParser.parseString(response.body());
        JsonObject objectRoot = elemento.getAsJsonObject();

        double taxa = objectRoot.get("conversion_rate").getAsDouble();

        double valorConvertido = valorParaConversao * taxa;

        System.out.println(valorConvertido);
    }

}
