package iLoops;

import libs.Input;

public class GatosDeMario {
    public static void main(String[] args) {
        dibujarPiramide(8);//5, 3, 10

    }

    private static void dibujarPiramide(int altura) {
        for(int i =1; i <= altura; i++) {
            int numGatitos = i;
            int numEspacios = altura - numGatitos;
            dibujarLinea(numEspacios, numGatitos);
        }
    }


    private static void dibujarLinea(int numEspacios, int numGatitos) {

        for(int i =0; i < numEspacios; i++) {
            Input.print(" ");
        }
        for(int i =0; i < numGatitos; i++) {
            Input.print("#");
        }

        for(int i =0; i < 2; i++) {
            Input.print(" ");
        }

        for(int i =0; i < numGatitos; i++) {
            Input.print("#");
        }

        System.out.println();
    }

}