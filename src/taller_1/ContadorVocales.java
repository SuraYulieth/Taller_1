/*
 *  Sura Yulieth Rueda Escobar
 * sura.rueda@correo.tdea.edu.co
 * Ejercicio 6 Crea un programa que 
 * cuente la cantidad de vocales en 
 * una cadena de texto ingresada por 
 * el usuario. Utiliza un método para 
 * realizar el conteo.
*/

package taller_1;

import java.util.Scanner;

public class ContadorVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner entrada = new Scanner (System.in); 
	
	String palabra;
	int n = 0;
	
	System.out.println("Ingrese la palabra");
	palabra = entrada.next().toUpperCase();
	
	for(int i=0; i<palabra.length(); i++)
	{
		System.out.println(palabra.charAt(i));
		
		if (palabra.charAt(i)=='A' || palabra.charAt(i)=='E' || palabra.charAt(i)=='I' || palabra.charAt(i)=='O' || palabra.charAt(i)=='U') 
		{
			n++;
		}
				
	}
	
	System.out.println("El número de vocales es " + n);

	}

}
