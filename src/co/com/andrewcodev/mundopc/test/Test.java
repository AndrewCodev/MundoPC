package co.com.andrewcodev.mundopc.test;

import co.com.andrewcodev.mundopc.domain.*;

public class Test {
	public static void main(String[] args) {
		
		Raton ratonHP = new Raton("USB", "HP");
		Teclado tecladoHP = new Teclado("USB", "HP");
		Monitor monitorHP = new Monitor("HP", 25);
		Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
		
		Raton ratonLenovo = new Raton("USB", "Lenovo");
		Teclado tecladoLenovo = new Teclado("USB", "LenovoP");
		Monitor monitorLenovo = new Monitor("Lenovo", 30.5);
		Computadora computadoraLenovo = new Computadora("Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
		

		Raton raton3 = new Raton("USB", "HP");
		Teclado teclado3 = new Teclado("USB", "HP");
		Monitor monitor3 = new Monitor("HP", 30);
		Computadora computadora3 = new Computadora("HP", monitor3, teclado3, raton3);
		
		Orden orden1 = new Orden();
		Orden orden2 = new Orden();
		
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraLenovo);
		orden2.agregarComputadora(computadora3);
		orden1.mostrarOrden();
		orden2.mostrarOrden();
		
	}
}
