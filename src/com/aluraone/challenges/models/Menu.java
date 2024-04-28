package com.aluraone.challenges.models;

import java.util.Scanner;

public class Menu
{
    private String menu =
            """
                **************************************
                        Conversor de monedas        
                **************************************
                
                A continuacion elija una opcion:
                1) Dolar ==> Peso Mexicano
                2) Euro ==> Peso Mexicano
                3) Dolar ==> Peso Argentino
                4) Dolar ==> Euro
                5) Salir
            """;

    public Menu(){
        System.out.println(menu);
    }
}
