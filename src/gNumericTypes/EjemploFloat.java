package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		float f = Input.get_float(); // función para tomar el valor introducido en consola f (no imprime mensaje)
		
		float f2 = Input.get_float(); // función para tomar el valor introducido en consola f2 (no imprime mensaje)
		
		Input.print("f/f2 = " + (f/f2)); //imprime el valor de la operación f/f2

	}

}
