package gNumericTypes;

import libs.Input;
import org.w3c.dom.ls.LSOutput;

public class BotellasDeAgua {

    public static void main(String[] args) {
        int minutos = get_positive_int();
        int litros = minutos*12;
        System.out.println("Estas tirando " + litros + " litros de agua. Debes cuidar el agua :)");

    }
    public static int get_positive_int()
    {
        int minutos;
        do
        {
            System.out.println("Cuanto minutos duras bañandote?");
            minutos =  Input.get_int();
        }
        while (minutos < 1);
        return minutos;
    }

}
