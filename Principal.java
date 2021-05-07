package Ej_8;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroSucursal;
		int cantidadPaquetes;
		String direccion;
		String ciudad;
		int numeroPaquete;
		int prioridad=0;
		double peso;
		String dni;
		float precio = 0;
		
		System.out.println("Ingrese Numero de sucursal: ");
		numeroSucursal = scanner.nextInt();
		
 		System.out.println("Ingrese direccion: ");
		direccion = scanner.nextLine();
		scanner.nextLine();
		
		
		System.out.println("Ingrese ciudad: ");
		ciudad = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Cuantos paquetes desea enviar?");
		cantidadPaquetes = scanner.nextInt();
		for (int i = 0; i < cantidadPaquetes; i++) {
			
			System.out.println("Numero de Paquete");
			numeroPaquete = scanner.nextInt();
			
			System.out.println("PRIORIDAD");

			System.out.println("NORMAL");
			scanner.nextLine();
			scanner.nextLine();
			
			switch (prioridad) {

				case 1: 
					break;
					
				case 2: 
					break;
					
				case 3: 
				break;
	
				default:
			}
			
			prioridad = scanner.nextInt();
			
			if(prioridad == 2) {
			
				precio = precio+10;
			
			} 
			
			if(prioridad == 3) {

				precio = precio+20;
			
			}
			
			System.out.println("PESO");
			peso = scanner.nextDouble();
			peso = peso+precio;
			
			System.out.println("Ingresar DNI");
			dni = scanner.nextLine();
			
		}
		
	}
	
}
