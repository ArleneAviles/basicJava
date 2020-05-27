package jStrings;
import libs.Input;

public class InicialesDificil {
    public static void main(String[] args) {
        //   String strNombre = "Regulus Arcturus Black";
        //   String strNombre = "Jesus Omar Navarro";
        //     String strNombre = "Luis Eduardo Laya";

        String strNombre = get_notnull_string();

        String[] nuevaCadena = strNombre.split(" ");
        for(int i = 0; i < nuevaCadena.length;i++) {
            strNombre.trim()
            if ((strNombre.charAt(i) >= 'A' && strNombre.charAt(i) <= 'Z') || strNombre.charAt(i) >= 'a' && strNombre.charAt(i) <= 'z')  {
                System.out.print(nuevaCadena[i].charAt(0));
            }
        }
    }

    public static String get_notnull_string()
    {
        String nombre;
        do
        {
            System.out.println("Escribe el nombre deseado");
            nombre =  Input.get_string();
        }
        while (nombre == null );
        return nombre;
    }
}
