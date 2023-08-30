/*
 * Sura Yulieth Rueda Escobar
 * sura.rueda@correo.tdea.edu.co
 * Ejercicio 7 Crea un programa que verifique si
 *  un número ingresado por el usuario es primo o 
 *  no. Un número primo es aquel que solo es 
 *  divisible por 1 y por sí mismo.
*/

package taller_1;

import java.util.Scanner;

public class NúmerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner (System.in);
	
	int a;
	int primo = 1;
			
	System.out.println("Ingrese el número a comprobar ");
	a = entrada.nextInt();
	
	
	for(int i = 2; i < a; i++)
	{
		if (a % i == 0)
		{ 
			primo = 0;
			System.out.println("El número no es primo ");
			break;
		}
		
	}
	
	if(primo==1)
	{
		System.out.println("El número es primo");
	}
	}

}
