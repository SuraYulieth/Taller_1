/*
 * Sura Yulieth Rueda Escobar
 * sura.rueda@correo.tdea.edu.co
 * Ejercicio 1 Crea una clase llamada "TemperaturaConverter" 
 * que tenga métodos para convertir entre Celsius y Fahrenheit.
 * Pide al usuario que ingrese una temperatura en un sistema
 * y muestra el equivalente en el otro sistema.
 */
package taller_1;

import java.util.Scanner;

public class TemperaturaConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner entrada = new Scanner (System.in);	
		
	String a; 
	int b, t;
	
	System.out.println("¿A qué escala de temperatura desea convertir? Ingrese C para Centigrados y F para Fahrenheit");
	a = entrada.next();
	
	if (a.equalsIgnoreCase("C"))	
	{
		System.out.println("Ingrese la temperatura en Fahrenheit");
		b =  entrada.nextInt();
		
		t = (b - 32) * ( 5 / 9 );
		
		System.out.println("La temperatura en grados centígrados es " + t);
	}
	
	else  
	{
		if (a.equalsIgnoreCase("F"))	
		{
			System.out.println("Ingrese la temperatura en Centigrados");
			b =  entrada.nextInt();
			
			t = ( b * (9/5)) + 32;
			
			System.out.println("La temperatura en grados Fahrenheit es " + t);
		}
		else 
		{
			System.out.println("Entrada inválida");
		}
	}

	}

}
