package com.aluraone.challenges.exchangerateapi;

import com.aluraone.challenges.jsonformat.GsonResults;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarAPI
{

    // Manupular el enlace con los parametros para el tipo de cambip
    public ExchangeRate createUrl(String base, String target, int amount)
    {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/aa7bd3ecea0f90d30f1498b9/pair/"
                +base
                +"/"
                +target
                +"/"
                +String.valueOf(amount));
        return consultaHttp(url);
    }

    // Realizar la peticion HTTP a la API
    public ExchangeRate consultaHttp(URI url)
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try{
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            return genJSON(response);
        }catch (Exception e){
            System.out.println("A ocurrido un error: "+e.getMessage());
        }
        return null;
    }

    // Generar la respuesta en formato JSON
    public ExchangeRate genJSON(HttpResponse<String> response){
        try{
            return new Gson().fromJson(response.body(),ExchangeRate.class);
        }catch (Exception e)
        {
            throw new Error("Ocurrio un error"+e.getMessage());
        }

    }
}
