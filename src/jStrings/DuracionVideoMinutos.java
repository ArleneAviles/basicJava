package jStrings;

import libs.Input;

import java.sql.SQLOutput;

public class DuracionVideoMinutos {

    public static void main(String[] args) {

        System.out.println("durancion del video: (mm:ss)");
        String duracionVideo = Input.get_string();

        int min = 0;
        int seg = 0;
              try{
        String[] minutos = duracionVideo.split(":");
        min = Integer.parseInt(minutos[0]);
        seg = Integer.parseInt(minutos[1]);
        System.out.println("El total del vide en segundos es: " + (min * 60 + seg));
        }catch (Exception e){
            System.out.println("Error en la recepcion de datos. El formato correcto es mm:ss");
        }

    }


}
