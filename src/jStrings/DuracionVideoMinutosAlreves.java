package jStrings;

import libs.Input;

public class DuracionVideoMinutosAlreves{
    public static void main(String[] args) {

        int duracionVideo = get_positive_int();

        int min = 0;
        int seg = 0;

        min = duracionVideo / 60;
        seg = duracionVideo % 60;
        if (min<10 && seg<10){
            System.out.println("El total del video en minutos y segundos es: 0" + min + ":0" + seg);
        }
        else if(min<10 && seg>=10){
            System.out.println("El total del video en minutos y segundos es: 0" + min + ":" + seg);
        }
        else if(min>=10 && seg<10){
            System.out.println("El total del video en minutos y segundos es: " + min + ":0" + seg);
        }
        else
            System.out.println("El total del video en minutos y segundos es: " + min + ":" + seg);

    }

    public static int get_positive_int()
    {
        int segundos;
        do
        {
            System.out.println("El total del video es de?");
            segundos =  Input.get_int();
        }
        while (segundos < 1);
        return segundos;
    }

}


