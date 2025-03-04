package co.com.andrewcodev.mundopc.domain;

public class Teclado extends DispositivoEntrada {
	private final int idTeclado;
	private static int contadorTeclados;

	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++Teclado.contadorTeclados;
	}

	@Override
	public String toString() {
		return " [idTeclado=" + idTeclado +", "+super.toString()+ "]";
	}
}
