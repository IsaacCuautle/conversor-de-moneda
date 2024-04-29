# Conversor de moneda
Este es un programa desarrollado en Java que, como su nombre indica, te permite obtener el valor de las conversiones entre diferentes monedas. Esto se logra mediante el consumo del API de exchangerate-api.

Este programa es un desafío del programa AluraONE (Oracle Next Education).

Algunas de las opciones que ofrece el programa son:
- Conversion de dolares a pesos mexicanos
- Conversion de EUROS a pesos mexicanos
- Conversion de dolares a pesos argentinos
- Conversion de dolares a euros

## ¿Como funciona? 
El programa cuenta con 4 paquetes, donde se albergan los diversos comportamientos del programa, los cuales son llamados desde la clase principal.

En primer lugar, la clase principal se encarga de inicializar las clases: Scanner, ConsultarAPI y el registro ExchangeRed. A continuación, mediante un bucle se muestra un menú donde se proporcionan a los usuarios las opciones antes mencionadas. Posteriormente, mediante un switch, se realiza la conversión de divisas modificando los parámetros del método createUrl de la clase ConsultaAPI. A continuación, se devuelven los parámetros que contienen las divisas solicitadas y el resultado de su conversión.

Por último, se imprime en pantalla el mensaje que contiene los valores antes mencionados y se invita al usuario a seleccionar alguna opción diferente del programa o a terminarlo si así lo desea.

## Imagenes del programa

<img src="https://github.com/IsaacCuautle/conversor-de-moneda/assets/65583500/4d94d221-c5d3-4480-b770-4b960ab2a4d3" height="200px" />

<img src="https://github.com/IsaacCuautle/conversor-de-moneda/assets/65583500/ff921f2c-0782-4aad-aff7-1339d551fade" height="200px" />

<img src="https://github.com/IsaacCuautle/conversor-de-moneda/assets/65583500/c4c0ebfb-07f8-4d2a-9a3c-d5fb6a1c1126" height="200px" />


## Tecnologias utilizadas
- Java 7
- Exchangerate-api
- IntelliJ
- Postman
- Json
- Windows
