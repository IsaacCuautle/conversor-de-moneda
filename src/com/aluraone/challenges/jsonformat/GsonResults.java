package com.aluraone.challenges.jsonformat;

import com.aluraone.challenges.exchangerateapi.ExchangeRate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpResponse;

public class GsonResults {
    public GsonResults(ExchangeRate results){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.println(gson.toJson(results));
    }
}
