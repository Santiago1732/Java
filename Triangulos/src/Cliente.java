
public class Cliente {
	
	String nombre;
	String apellido;
	String dni;
	Cuenta cuentas[];

	public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}
	
	public double ingresar_dinero(int i, double cantidad){
		double saldo = 0;
		
		saldo = saldo + cantidad;
		return saldo;
	}
	
	public void consultar_saldo(int n, double cantidad) {
		
	}
	
	
}
