package com.aluraone.challenges.principal;

import com.aluraone.challenges.exchangerateapi.ConsultarAPI;
import com.aluraone.challenges.exchangerateapi.ExchangeRate;
import com.aluraone.challenges.jsonformat.GsonResults;

public class Principal
{
    public static void main(String[] args) {
        ConsultarAPI consultarAPI = new ConsultarAPI();
        ExchangeRate conversion = consultarAPI.createUrl("USD","MXN",1);

        GsonResults gsonResults = new GsonResults(conversion);
        System.out.println(conversion);
    }
}
