package gNumericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); //función para imprimir mensaje y tomar valor introducido para var x
	    float x = Input.get_float();
	    
	    // prompt user for y
	    System.out.print("y is "); //función para imprimir mensaje y tomar valor introducido para var y
	    float y = Input.get_float();
	    
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n"); //función para imprimir mensaje con el resultado de dividir x/y
	}
}


