/*
 * Sura Yulieth Rueda Escobar
 * sura.rueda@correo.tdea.edu.co
 * Ejercicio 3 Crea un programa que solicite al 
 * usuario un número y determine si es par o impar.
 * Utiliza operadores aritméticos y de comparación.
 */
package taller_1;

import java.util.Scanner;

public class VrificadorNúmerosPareas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner entrada = new Scanner (System.in);
	
	int num;
	
	System.out.println("Ingrese el número");
	num = entrada.nextInt();
	
	if (num % 2 == 0 ) 
	{
		System.out.println("El número es par");
	}
	else 
	{
		System.out.println("El número es Impar");
	}

	}
}
