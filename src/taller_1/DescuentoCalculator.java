/*
 * Sura Yulieth Rueda Escobar
 * sura.rueda@correo.tdea.edu.co
 * Ejercicio 2 Crea una clase llamada "DescuentoCalculator" 
 * que calcule el precio después de aplicar un descuento a 
 * un producto. El usuario debe ingresar el precio original 
 * y el porcentaje de descuento.
 */
package taller_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DescuentoCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner entrada = new Scanner (System.in);
	
	float a, b, descuento, total; 
	
	System.out.println("Valor del Producto");
	a = entrada.nextFloat();
	
	System.out.println("Digite el porcentaje del descuento");
	b = entrada.nextFloat();
	
	descuento = ( a * b ) / 100;
	total = descuento + a;
	
	System.out.println("El valor a pagar es " + total);
	
		
	}

}
