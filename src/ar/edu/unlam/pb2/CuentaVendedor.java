package ar.edu.unlam.pb2;

public class CuentaVendedor extends Cuenta implements Transferible{

	
	private Double saldo;
	private Long CBU;
	private String titular;
	
	public CuentaVendedor(Double saldo, Long CBU, String titular) {
		super(saldo, CBU, titular);
		this.saldo = saldo;
		this.CBU = CBU;
		this.titular = titular;
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
