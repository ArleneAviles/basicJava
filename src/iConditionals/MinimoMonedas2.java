package iConditionals;

import libs.Input;

public class MinimoMonedas2 {
   public int moneda25 = 25;
   public int moneda10 = 10;
   public int moneda5 = 5;
   public int moneda1 = 1;
   public int totalMonedas25 = 0;
   public int totalMonedas10 = 0;
   public int totalMonedas5 = 0;
   public int totalMonedas1 = 0;

   public MinimoMonedas2(){
       float cambioFraccion2 = get_positive_float();
       int cambioFraccion = (int) (cambioFraccion2 *100);

       if (cambioFraccion >= moneda25) {
           calculaMonedas(cambioFraccion, moneda25);
       } else if (cambioFraccion >= moneda10) {
           calculaMonedas(cambioFraccion, moneda10);
       } else if (cambioFraccion >= moneda5) {
           calculaMonedas(cambioFraccion, moneda5);
       } else if (cambioFraccion >= moneda1) {
           calculaMonedas(cambioFraccion, moneda1);
       }
       System.out.println("El minimo de monedas para cambio es: ");
       System.out.println("Monedas 25c: " + totalMonedas25);
       System.out.println("Monedas 10c: " + totalMonedas10);
       System.out.println("Monedas 5c: " + totalMonedas5);
       System.out.println("Monedas 1c: " + totalMonedas1);

   }

   public static void main(String[] args) {
              //MinimoMonedas2 MoneyExchange = new MinimoMonedas2(); //constructor
      }

   public void calculaMonedas(int cambio, int tipoMoneda) {
       int residuo = 0;

       residuo = contadorTipoMonedas(cambio, tipoMoneda);

       if (residuo > 0) {
           if (residuo >= moneda25) {
               calculaMonedas(residuo, moneda25);
           } else if (residuo >= moneda10) {
               calculaMonedas(residuo, moneda10);
           } else if (residuo >= moneda5) {
               calculaMonedas(residuo, moneda5);
           } else if (residuo >= moneda1) {
               calculaMonedas(residuo, moneda1);
           }
       }

   }

   public int contadorTipoMonedas(int cambio, int moneda) {
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

   public float get_positive_float() {
       float cambioFraccion;
       do {
           System.out.println("Cual es el cambio en fracción?");
           cambioFraccion =  Input.get_float();
       }
       while (cambioFraccion < 0);
       return cambioFraccion;
   }
}
