package com.aluraone.challenges.principal;

import com.aluraone.challenges.exchangerateapi.ConsultarAPI;
import com.aluraone.challenges.exchangerateapi.ExchangeRate;
import com.aluraone.challenges.jsonformat.GsonResults;
import com.aluraone.challenges.models.Menu;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConsultarAPI consultarAPI = new ConsultarAPI();
        ExchangeRate conversion = null;


        while (true) {
            // Mensaje del menu
            Menu menu = new Menu();

            // Opciones de conversion
            int opcion = teclado.nextInt();
            if (opcion == 5)
            {
                System.out.println("Gracias vuelva pronto");
                break;
            }
            switch (opcion) {
                case 1:
                    // Cambio de dolares a pesos mexicanos
                    conversion = consultarAPI.createUrl("USD", "MXN", consultarAPI.getAmount());
                    break;
                case 2:
                    // Cambio de euros a pesos mexicanos
                    conversion = consultarAPI.createUrl("EUR", "MXN", consultarAPI.getAmount());
                    break;
                case 3:
                    // Cambio de dolares a Pesos Argentinos
                    conversion = consultarAPI.createUrl("USD", "ARS", consultarAPI.getAmount());
                    break;
                case 4:
                    // Cambiio de dolares a euros
                    conversion = consultarAPI.createUrl("USD", "EUR", consultarAPI.getAmount());
                    break;
                default:
                    System.out.println("Por favor ingresa una opcion valida");
            }

            // Resultados de la conversion
            GsonResults gsonResults = new GsonResults(conversion);
            System.out.println(
                    """
                     El resultado de la conversion de %d %s a %s fue de %s %s
                    """.formatted(
                            consultarAPI.getAmount(),
                            conversion.base_code(),
                            conversion.target_code(),
                            conversion.conversion_result(),
                            conversion.target_code()
                            ));
            System.out.println("Ingrese cualquier numero continuar");
            teclado.next();
        }
        teclado.close();
    }}