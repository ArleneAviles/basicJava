package iConditionals;

import libs.Input;

public class MinimoMonedas {
    public static int moneda25 = 25;
    public static int moneda10 = 10;
    public static int moneda5 = 5;
    public static int moneda1 = 1;
    public static int totalMonedas25 = 0;
    public static int totalMonedas10 = 0;
    public static int totalMonedas5 = 0;
    public static int totalMonedas1 = 0;

    public static void main(String[] args) {
        int cambioFraccion = get_positive_int();
        //   int cambioFraccionPorCien = cambioFraccion*100;
        //   System.out.println("En total son " + cambioFraccion + " centavos");

        if (cambioFraccion >= moneda25) {
            calculaCambio(cambioFraccion, moneda25);
        } else if (cambioFraccion >= moneda10) {
            calculaCambio(cambioFraccion, moneda10);
        } else if (cambioFraccion >= moneda5) {
            calculaCambio(cambioFraccion, moneda5);
        } else if (cambioFraccion >= moneda1) {
            calculaCambio(cambioFraccion, moneda1);
        }
        System.out.println("Monedas 25: " + totalMonedas25);
        System.out.println("Monedas 10: " + totalMonedas10);
        System.out.println("Monedas 5: " + totalMonedas5);
        System.out.println("Monedas 1: " + totalMonedas1);
    }

    public static void calculaCambio(int cambio, int tipoMoneda) {
        int residuo = 0;

       switch(tipoMoneda) {
            case 25:
                residuo = operacionMonedas(cambio, tipoMoneda);
                break;
            case 10:
                residuo = operacionMonedas(cambio, tipoMoneda);
                break;
            case 5:
                residuo = operacionMonedas(cambio, tipoMoneda);
                break;
            case 1:
                residuo = operacionMonedas(cambio, tipoMoneda);
                break;
       }
        if (residuo > 0) {
            if (residuo >= moneda25) {
                calculaCambio(residuo, moneda25);
            } else if (residuo >= moneda10) {
                calculaCambio(residuo, moneda10);
            } else if (residuo >= moneda5) {
                calculaCambio(residuo, moneda5);
            } else if (residuo >= moneda1) {
                calculaCambio(residuo, moneda1);
            }
        }

    }

    public static int operacionMonedas(int cambio, int moneda) {
        int totalMonedas = cambio/moneda;
        int residuo = cambio % moneda;

        switch (moneda) {
            case 25:
                totalMonedas25 = totalMonedas;
                break;
            case 10:
                totalMonedas10 = totalMonedas;
                break;
            case 5:
                totalMonedas5 = totalMonedas;
                break;
            case 1:
                totalMonedas1 = totalMonedas;
                break;
        }

        return residuo;
    }

    public static int get_positive_int()
    {
        int cambioFraccion;
        do
        {
            System.out.println("Cual es el cambio en fracción?");
            cambioFraccion =  Input.get_int();
        }
        while (cambioFraccion < 1);
        return cambioFraccion;
    }
}
