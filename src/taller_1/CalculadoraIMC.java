/*
 *  Sura Yulieth Rueda Escobar
 * sura.rueda@correo.tdea.edu.co
 * Ejercicio 5 Crea una clase "IMCCalculator" que
 * calcule el índice de masa corporal (IMC) de una 
 * persona. El usuario debe ingresar su peso y altura,
 * y el programa debe mostrar el IMC.
*/

package taller_1;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner entrada = new Scanner (System.in);
		
	float a, b, imc; 
	
	System.out.println("Ingrese su estatura en metros (usando la coma ",")");
	a = entrada.nextFloat();
	
	System.out.println("Ingrese su peso en kilogramos");
	b = entrada.nextFloat();
	
	imc = b / (a*a);
	
	System.out.println("Su IMC es de " + imc);
	
	}

}
