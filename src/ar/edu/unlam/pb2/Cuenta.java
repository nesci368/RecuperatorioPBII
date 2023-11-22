package ar.edu.unlam.pb2;

public class Cuenta implements Transferible {

	
	private Double saldo;
	private Long CBU;
	private String titular;
	
	public Cuenta(Double saldo, Long CBU, String titular) {
		
		this.CBU = CBU;
		this.saldo = saldo;
		this.titular = titular;
	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub
		this.saldo =+ importe;
	}

	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		Boolean extraccionExitosa = false;
		if(this.saldo >= importe) {
			extraccionExitosa = true;
		}
		return extraccionExitosa;
	}

	public void transferir(Double saldoATrasferir, Cuenta cuenta1, Cuenta cuenta2) throws saldoInsuficienteException {
		// TODO Auto-generated method stub
		if(saldo < saldoATrasferir && cuenta1.CBU != null) {
			throw new saldoInsuficienteException();
		}
		else {
			saldo =- saldoATrasferir;
		}
		
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

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
