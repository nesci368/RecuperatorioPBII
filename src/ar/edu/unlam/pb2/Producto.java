package ar.edu.unlam.pb2;

public class Producto {

	private Double valor;
	private String nombreProducto;
	private String origen;

	public Producto(Double valor, String nombreProducto, String origen) {
		// TODO Auto-generated constructor stub
		this.valor = valor;
		this.nombreProducto = nombreProducto;
		this.origen = origen;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	

}
