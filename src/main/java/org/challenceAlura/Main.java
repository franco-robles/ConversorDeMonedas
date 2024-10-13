package org.challenceAlura;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner lectura = new Scanner(System.in);
        Convertidor conv = new Convertidor("",0,"","");
        boolean salir=true;

        String menu = """
            ++++++++++Conversor de Monedas++++++++++
            1) Dólar =>> Peso argentino\n
            2) Peso argentino =>> Dólar\n
            3) Dólar =>> Peso Chileno\n
            4) Peso Chileno=>> Dólar\n
            5) Dólar =>> Euro\n 
            6) Dólar =>> Euro\n 
            7) Salir\n
            """;
        String menuConverted = "Elige la cantidad que deseas convertir:  ";

        String url_api = "https://v6.exchangerate-api.com/v6/9c16ad552df47d24a09a6e84/pair/";


        while(salir){
            System.out.println(menu);
            try{
                int option = lectura.nextInt();
                if (option == 7) {
                    salir = false;
                    System.out.println("Gracias por usar el conversor de monedas.");
                    break;
                }
                Scanner cantConvertir = new Scanner(System.in);
                System.out.println(menuConverted);
                int qt = cantConvertir.nextInt();
                switch (option) {
                    case 1: {
                        // Dólar estadounidense -> Peso Argentino
                        conv.setCantidad(qt);
                        conv.setUrlAPI(url_api);
                        conv.setPrimerPais("USD");
                        conv.setSegundoPais("ARS");
                        System.out.println(conv.conversion()+"\n");
                        break;
                    }
                    case 2: {
                        // Peso Argentino -> Dólar estadounidense
                        conv.setCantidad(qt);
                        conv.setUrlAPI(url_api);
                        conv.setPrimerPais("ARS");
                        conv.setSegundoPais("USD");
                        System.out.println(conv.conversion()+"\n");
                        break;
                    }
                    case 3: {
                        // Dólar estadounidense -> Real brasileño
                        conv.setCantidad(qt);
                        conv.setUrlAPI(url_api);
                        conv.setPrimerPais("USD");
                        conv.setSegundoPais("CLP");
                        System.out.println(conv.conversion()+"\n");
                        break;
                    }
                    case 4: {
                        // Real brasileño -> Dólar estadounidense
                        conv.setCantidad(qt);
                        conv.setUrlAPI(url_api);
                        conv.setPrimerPais("CLP");
                        conv.setSegundoPais("USD");
                        System.out.println(conv.conversion()+"\n");
                        break;
                    }
                    case 5: {
                        // Dólar estadounidense -> Peso colombiano
                        conv.setCantidad(qt);
                        conv.setUrlAPI(url_api);
                        conv.setPrimerPais("USD");
                        conv.setPrimerPais("BRL");
                        System.out.println(conv.conversion()+"\n");
                        break;
                    }
                    case 6: {
                        // Peso colombiano -> Dólar estadounidense
                        conv.setCantidad(qt);
                        conv.setUrlAPI(url_api);
                        conv.setPrimerPais("BRL");
                        conv.setSegundoPais("USD");
                        System.out.println(conv.conversion()+"\n");
                        break;
                    }default: {
                        System.out.println("Opción Inválida. Elija una opción entre 1 y 7.");
                        break;
                    }
                }
            }catch (InputMismatchException ex){
                System.out.println("Debe ingresar un número entero.");
                lectura.next();
            } catch (InterruptedException | IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}