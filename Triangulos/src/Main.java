import java.util.Scanner;

public class Main {
	
	
	public static void mostrarCuentas(Cuenta cuentas[]) {
		
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i].getNumeroCuenta());
		}
		
	}
	
	
	public static void buscarClientes(String nombre, Cliente clientes[]) {
		
		boolean bandera = false;
		int indice = 0;
		Cuenta cuentas[];
		
		while(indice<clientes.length && bandera == false) {
			if(clientes[indice].getNombre().equals(nombre)) {
				bandera = true;
			}else {
				indice++;
			}
			
			System.out.println("INFORMACION DEL CLIENTE");
			System.out.println("NOMBRE: "+clientes[indice].getNombre());
			System.out.println("APELLIDO: "+clientes[indice].getApellido());
			System.out.println("DNI: "+clientes[indice].getDni());
			System.out.println("********************");
			
		}
	}
	
	public static void menu(Cliente clientes[], Cuenta cuentas[]) {
		
		Scanner scanner = new Scanner(System.in);
		String nombre;
		int indiceCliente;
		
		System.out.println("*** CUENTAS DISPONIBLES ***");
		for (int i = 0; i <= clientes.length; i++) {
			System.out.println(i+1+")"+clientes[i].getNombre() );
		}
		
		System.out.println("INGRESE EL NOMBRE DE ALGUNA CUENTA DISPONIBLE");
		nombre = scanner.next();	
		
		buscarClientes(nombre, clientes);
		mostrarCuentas(cuentas);
		
	}
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String nombre;
		String apellido;
		String dni;
		int cantidadCuentas;
		int cantidadClientes;
		int numeroCuenta;
		int opcion = 0;
		
		System.out.println("Ingresar cantidad de clientes");
		cantidadClientes = scanner.nextInt();
		
		Cliente clientes[] = new Cliente[cantidadClientes];
		
		for (int i = 0; i < clientes.length; i++) {
			
			System.out.println("Ingrese nombre: ");
			nombre = scanner.next();
			
			System.out.println("Ingrese apellido: ");
			apellido = scanner.next();
			
			System.out.println("Ingrese DNI: ");
			dni = scanner.next();
			
		
		System.out.println("Cuantas cuentas tiene el cliente "+nombre+"?");
		cantidadCuentas = scanner.nextInt();
		
		Cuenta cuentas [] = new Cuenta[cantidadCuentas];
		
		for (int j = 0; j < cuentas.length; j++) {

			System.out.println("Ingrese nuemero de cuenta: ");
			numeroCuenta = scanner.nextInt();
			
			cuentas[j] = new Cuenta(numeroCuenta, 0);
			
			}
			
		clientes[i] = new Cliente(nombre,apellido,dni,cuentas);
		
		menu(clientes, cuentas);
		}
		
		
		
		
		
		
	}
}
