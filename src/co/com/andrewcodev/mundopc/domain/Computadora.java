package co.com.andrewcodev.mundopc.domain;

public class Computadora {
	private final int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadoras;

	private Computadora() {
		this.idComputadora = ++Computadora.contadorComputadoras;
	}

	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}

	public int getIdComputadora() {
		return this.idComputadora;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ", Nombre=" + nombre + "], \nMonitor=" + monitor
				+ ", \nTeclado=" + teclado + ", \nRaton=" + raton + "\n";
	}

}
