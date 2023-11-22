package ar.edu.unlam.pb2;

import java.sql.Date;

public class TarjetaDeCredito extends MedioDePago {

	private Long numeroDeTarjeta;
	private Double limiteDisponible;
	private Integer fechaDeVencimiento;
	private Integer codigoDeSeguridad;

	public TarjetaDeCredito(Long numeroDeTarjeta, Double limiteDisponible, Integer fechaDeVencimiento2,
			Integer codigoDeSeguridad) {
		// TODO Auto-generated constructor stub
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.limiteDisponible = limiteDisponible;
		this.fechaDeVencimiento = fechaDeVencimiento2;
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public Long getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	public void setNumeroDeTarjeta(Long numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	public Double getLimiteDisponible() {
		return limiteDisponible;
	}

	public void setLimiteDisponible(Double limiteDisponible) {
		this.limiteDisponible = limiteDisponible;
	}

	public Integer getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(Integer fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}
	
	
	
	

}
