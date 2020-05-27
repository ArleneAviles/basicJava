package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); //Imprime mensaje
	    int x = Input.get_int(); //Toma el valor que introduce el usuario para x
	    
	    // prompt user for y
	    System.out.print("y is "); //Imprime mensaje
	    int y = Input.get_int(); //toma el valor que introduce el usuario para y
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n"); //Imprime la suma de x y y
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n"); //Imprime la resta de x y y
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n"); //Imprime la multiplicacion de x y y
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n"); //Imprime la division de x y y
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n"); //Imprime el residuo de x y y
	}
}


