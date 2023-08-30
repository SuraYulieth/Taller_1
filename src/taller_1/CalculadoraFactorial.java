/*
 * Sura Yulieth Rueda Escobar
 * sura.rueda@correo.tdea.edu.co
 * Ejercicio 8 Crea un programa que calcule 
 * el factorial de un número ingresado por el 
 * usuario. El factorial de un número es el 
 * producto de todos los enteros positivos 
 * menores o iguales a ese número.
 */

package taller_1;

import java.util.Scanner;

public class CalculadoraFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner entrada = new Scanner (System.in);
	
	int a, n=1;
	
		
	System.out.println("Ingrese el número que le desea calcular el factorial");
	a = entrada.nextInt();
	
	for(int i = 1; i <= a; i++) 
	{
		n = n*i;
	}
	
	System.out.println("Elfactorial de " + a + " es " + n);

	}

	
}
