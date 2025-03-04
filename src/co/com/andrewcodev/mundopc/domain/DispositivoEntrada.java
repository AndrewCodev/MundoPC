package co.com.andrewcodev.mundopc.domain;

public class DispositivoEntrada {
	protected String tipoEntrada;
	protected String marca;
	
	public DispositivoEntrada(String tipoEntrada, String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	public String getTipoEntrada() {
		return this.tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "[tipoEntrada=" + tipoEntrada + ", marca=" + marca + "]";
	}
}
