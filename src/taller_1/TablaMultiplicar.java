/*
 * Sura Yulieth Rueda Escobar
 * sura.rueda@correo.tdea.edu.co
 * Ejercicio 4 Crea un programa que solicite al
 * usuario un número y genere la tabla de multiplicar
 * correspondiente, desde 1 hasta 10.
*/

package taller_1;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner entrada = new Scanner (System.in);
	
	int num, result;
	
	System.out.println("Ingresar la tabla de multiplicar deseada");
	num = entrada.nextInt();
	
		
	for (int i = 0; i <= 10 ; i++)
	{
		result = num * i;
		System.out.println(num + " * " + i + " = " + result);
	}
	
	}

}
