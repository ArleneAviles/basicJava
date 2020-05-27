package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); // funcion para imprimir en consola
	    int x = Input.get_int(); //

	    // prompt user for y
	    System.out.print("y is: "); // funcion para imprimir en consola y tomar valor de y
	    int y = Input.get_int();

	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n"); // funcion para imprimir en consola el resultado de sumar x y y
	}
}