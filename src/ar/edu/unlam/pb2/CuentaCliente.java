package ar.edu.unlam.pb2;

public class CuentaCliente extends Cuenta implements Transferible{

	private Double saldo;
	private Long CBU;
	private String titular;
	
	public CuentaCliente(Double saldo, Long CBU, String titular) {
		super(saldo, CBU, titular);
		// TODO Auto-generated constructor stub
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Long getCBU() {
		return CBU;
	}

	public void setCBU(Long cBU) {
		CBU = cBU;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	

}
