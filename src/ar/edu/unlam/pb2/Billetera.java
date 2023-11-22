package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Billetera extends MedioDePago implements Transferible {

	private Double saldo;
	private Long cvu;
	private String nombreBilletera;private Set<Vendedor>vendedores;
	private Set<Cliente>clientes;
	private Set<MedioDePago> mediosDePagos;
	
	
	public Billetera(Double saldo, Long cvu, String nombreBilletera) {
		// TODO Auto-generated constructor stub
		this.cvu = cvu;
		this.nombreBilletera = nombreBilletera;
		this.saldo = saldo;
		this.vendedores =new TreeSet<>();
		this.clientes =new HashSet<>();
		
		
	}

	public Long getCvu() {
		return cvu;
	}

	public void setCvu(Long cvu) {
		this.cvu = cvu;
	}

	public String getNombreBilletera() {
		return nombreBilletera;
	}

	public void setNombreBilletera(String nombreBilletera) {
		this.nombreBilletera = nombreBilletera;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub
		
	}
	
	public void queSePuedaRegistrarUnVendedor(Vendedor personaj) throws VendedorDuplicadoException {
		// TODO Auto-generated method stub
		if(vendedores.contains(personaj)) {
			throw new VendedorDuplicadoException();
		}
		else {
			this.vendedores.add(personaj);
		}
	}

	public void queSePuedaRegistarUnCliente(Cliente personaf) throws ClienteDuplicadoException {
		// TODO Auto-generated method stub
		if(clientes.contains(personaf)) {
			throw new ClienteDuplicadoException();
		}
		else {
			this.clientes.add(personaf);
		}
		
	}
	
	public Integer getCantidadDeClientes() {
		return this.clientes.size();
	}
	
	public Integer getCantidadDeVendedores() {
		return this.vendedores.size();
	}
	

	public Set<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(Set<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void registrarMedioDePago(MedioDePago virtual, MedioDePago tarjetaDeCredito, MedioDePago tarjetaDeDebito) throws MedioDePagoDuplicadoException {
		// TODO Auto-generated method stub
		
		if(mediosDePagos.contains(tarjetaDeDebito) || mediosDePagos.contains(tarjetaDeCredito)
				|| mediosDePagos.contains(virtual)) {
			
			mediosDePagos.add(tarjetaDeDebito);
			mediosDePagos.add(tarjetaDeCredito);
			mediosDePagos.add(virtual);
			
		}
		
	}
	
	public Integer getCantidadDeMediosDePagos() {
		return mediosDePagos.size();
	}
	
	

	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	public void realizarCompra(Double valor, Double saldo2, Cuenta cuenta1, Cuenta cuenta2) throws saldoDeLacuentaVirtualInsuficiente {
		// TODO Auto-generated method stub
		
		if(saldo2 < valor && cuenta1.getCBU()!=null) {
			throw new saldoDeLacuentaVirtualInsuficiente();
		}
		else {
			saldo2 =- valor;
		}
		
	}

	public void realizarLaCompraConLaTarjetaDeCredito(Double valor, Double limiteDisponible) throws ExcedeLimiteDeCompraException {
		// TODO Auto-generated method stub
		if(limiteDisponible < valor) {
			throw new ExcedeLimiteDeCompraException();
		}
		else {
			limiteDisponible=-valor;
		}
		
	}

	public void realizarCompraConLaTarjetaDeDebito(Double valor, Double saldoTarjetaDeDebito) throws SaldoDeLaTarjetaDeDebitoInsuficienteException {
		// TODO Auto-generated method stub
		
		if(saldoTarjetaDeDebito < valor) {
			throw new SaldoDeLaTarjetaDeDebitoInsuficienteException();
		}
		else {
			saldoTarjetaDeDebito=-valor;
		}
		
	}

	
	

}
