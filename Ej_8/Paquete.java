package Ej_8;

public class Paquete {

	int numeroPaquete;
	int prioridad;
	double peso;
	String dni;

	public Paquete(int numeroPaquete, int prioridad, double peso, String dni) {
		super();
		this.numeroPaquete = numeroPaquete;
		this.prioridad = prioridad;
		this.peso = peso;
		this.dni = dni;
	}
	
	public int getNumeroPaquete() {
		return numeroPaquete;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String mostrarDatosPaquete() {
		return "numeroPaquete"+numeroPaquete+"prioridad"+prioridad+"peso"+peso+"dni"+dni;
	}
	
	
}
