package br.com.classe.servico;

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


        if (converterPara.equalsIgnoreCase("USD")){
            String mensagemDolar = String.format("U$%.2f Dólares",valorConvertido);
            System.out.println(mensagemDolar);
        } else if (converterPara.equalsIgnoreCase("BRL")) {
            String mensagemReal = String.format("R$%.2f Reais",valorConvertido);
            System.out.println(mensagemReal);
        } else if (converterPara.equalsIgnoreCase("ARS")) {
            String mensagemArgentino = String.format("$%.2f Pesos Argentinos",valorConvertido);
            System.out.println(mensagemArgentino);
        } else if (converterPara.equalsIgnoreCase("BOB")) {
            String mensagemBoliviano = String.format("b$%.2f Pesos Bolivianos",valorConvertido);
            System.out.println(mensagemBoliviano);
        } else if (converterPara.equalsIgnoreCase("CLP")) {
            String mensagemChileno = String.format("$%.2f Pesos Chilenos",valorConvertido);
            System.out.println(mensagemChileno);
        } else if (converterPara.equalsIgnoreCase("COP")) {
            String mensagemColombiano = String.format("$%.2f Pesos Colombianos",valorConvertido);
            System.out.println(mensagemColombiano);
        }
    }

}
