package ar.edu.unlam.pb2;

import java.sql.Date;

public class TarjetaDeDebito extends MedioDePago {

	private Long numeroDeTarjeta1;
	private Double saldo1;
	private Integer fechaDeVencimiento1;
	private Integer codigoDeSeguridad1;

	public TarjetaDeDebito(Long numeroDeTarjeta1, Double saldo1, Integer fechaDeVencimiento12, Integer codigoDeSeguridad1) {
		// TODO Auto-generated constructor stub
		this.numeroDeTarjeta1 = numeroDeTarjeta1;
		this.saldo1 = saldo1;
		this.fechaDeVencimiento1 = fechaDeVencimiento12;
		this.codigoDeSeguridad1 = codigoDeSeguridad1;
	}
	
	

}
