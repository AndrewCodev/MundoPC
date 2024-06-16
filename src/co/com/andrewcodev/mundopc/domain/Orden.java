package co.com.andrewcodev.mundopc.domain;

public class Orden {
	private final int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private static final int MAX_COMPUTADORAS = 2;
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
	}
	
	public void agregarComputadora(Computadora computadora) {
		if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
			this.computadoras[this.contadorComputadoras++] = computadora;
		}else {
			System.out.println("Ha llegado al limite de computadoras que puede comprar");
		}
	}

	public void mostrarOrden() {
		System.out.println("Id Oden: "+this.idOrden);

		for (int i = 0; i < this.contadorComputadoras; i++) {
			System.out.println(computadoras[i]);
			
		}
	}
}
