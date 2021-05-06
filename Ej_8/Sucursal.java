package Ej_8;

public class Sucursal {

	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	
	
	public Sucursal(int numeroSucursal, String direccion, String ciudad) {
		super();
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	public int getNumeroSucursal() {
		return numeroSucursal;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public String mostrarDatosSucursal() {
		return "Numero de Sucursal"+numeroSucursal+"Direccion"+direccion+"Ciudad"+ciudad;
	}
	
	public double calcularPrecio(Paquete p) {
		
		double precioFinal;
		
		
		
	}
	
}
