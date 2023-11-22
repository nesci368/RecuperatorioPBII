package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBilleteraDePago {

	@Test
	public void queSePuedanAlmacenarLosdistintosTiposDeTransacciones() {
		
	}

	@Test
	public void queSePuedanAlmacenarLosdistintosTiposDePersonas() throws VendedorDuplicadoException, ClienteDuplicadoException {
		
		String nombre = "Pablo";
		String apellido = "Valdez";
		String nombre1 = "Ramiro";
		String apellido1 = "Stadled";
		Integer dni = 36954744;
		Integer dni2 = 34571945;
		Long cuil = 20369547446L;
		Long cuit = 30568654748L;
		
		Persona persona = new Persona(nombre, apellido, dni);
		Cliente personaf = new Cliente(nombre, apellido, dni, cuil);
		Vendedor personaj = new Vendedor(nombre1, apellido1, dni2, cuit);
		Double saldo = 1000.0;
		Long cvu = 1544415146944584L;
		String nombreBilletera = "Uala";
		Billetera virtual = new Billetera(saldo,cvu, nombreBilletera);
		
		
		virtual.queSePuedaRegistrarUnVendedor(personaj);
		
		virtual.queSePuedaRegistarUnCliente(personaf);
		
		Integer vendedoresEsperados = 1;
		
		Integer clientesEsperados = 1;
		
		assertEquals(vendedoresEsperados, virtual.getCantidadDeVendedores());
		assertEquals(clientesEsperados, virtual.getCantidadDeClientes());
		
		
		
	}
	
	@Test
	public void queSePuedaAsociarACadaPersonaSusMedios() throws MedioDePagoDuplicadoException {
		
		String nombre = "Pablo";
		String apellido = "Valdez";
		Integer dni = 36954744;
		Long cuil = 20369547446L;
		Long cuit = 30568654748L;
		Persona persona = new Persona(nombre, apellido, dni);
		Persona personaf = new Cliente(nombre, apellido, dni, cuil);
		Long numeroDeTarjeta = 5200530033684408L;
		Double limiteDisponible = 192000.0;
		Integer fechaDeVencimiento = 20/15/2025;
		Integer codigoDeSeguridad = 354;
		Double saldo1 = 2000.0;
		Integer fechaDeVencimiento1 = 20/15/2025;
		Integer codigoDeSeguridad1 = 225;
		MedioDePago tarjetaDeCredito = new TarjetaDeCredito(numeroDeTarjeta , limiteDisponible ,fechaDeVencimiento,codigoDeSeguridad);
		Long numeroDeTarjeta1 = 5184156495161561L;
		MedioDePago tarjetaDeDebito = new TarjetaDeDebito(numeroDeTarjeta1, saldo1, fechaDeVencimiento1, codigoDeSeguridad1);
		Double saldo = 1000.0;
		Long cvu = 1544415146944584L;
		String nombreBilletera = "Uala";
		Billetera virtual = new Billetera(saldo,cvu, nombreBilletera);
		
		virtual.registrarMedioDePago(virtual, tarjetaDeCredito, tarjetaDeDebito);
		Integer cantidadDeMediosDePagosAgregados = 3;
		assertEquals(cantidadDeMediosDePagosAgregados, virtual.getCantidadDeMediosDePagos());
	}
	
	@Test
	public void queSePuedaRealizarCompras() {
		
		String nombre = "Pablo";
		String apellido = "Valdez";
		Integer dni = 36954744;
		Long cuil = 20369547446L;
		Long cuit = 30568654748L;
		
		Persona personaf = new Cliente(nombre, apellido, dni, cuil);
		Persona personaj = new Vendedor(nombre, apellido, dni, cuit);
		
		
	}
	
	@Test
	public void queSePuedanRealizarTransferencias() {
		
	}
	
	@Test(expected = SaldoDeLaTarjetaDeDebitoInsuficienteException.class)
	public void queSeLanceUnaExcepcionSiElSaldoDeLaTarjetaEsInsuficienteParaHacerUnaCompra() throws SaldoDeLaTarjetaDeDebitoInsuficienteException {
		Double saldo1 = 2000.0;
		Integer fechaDeVencimiento1 = 20/15/2025;
		Integer codigoDeSeguridad1 = 225;
		Long numeroDeTarjeta1 = 5184156495161561L;
		MedioDePago tarjetaDeDebito = new TarjetaDeDebito(numeroDeTarjeta1, saldo1, fechaDeVencimiento1, codigoDeSeguridad1);

		Long cvu = 1544415146944584L;
		String nombreBilletera = "Uala";
		Double saldo = 1000.0;
		Billetera virtual = new Billetera(saldo,cvu, nombreBilletera);
		
		Double valor = 2000.0;
		String nombreProducto = "Remera";
		String origen = "Chino";
		Producto producto1 = new Producto(valor, nombreProducto, origen);
		virtual.realizarCompraConLaTarjetaDeDebito(valor, saldo);
	}
	
	@Test(expected = saldoDeLacuentaVirtualInsuficiente.class)
	public void queSeLanceUnaExcepcionSiElSaldoDeLaCuentaVirtualEsInsuficienteParaHacerUnaCompra() throws saldoDeLacuentaVirtualInsuficiente {
		Double saldo2 = 1000.0;
		Long CBU = 51485641661321056L;
		String titular = "Andres Borgeat";
		Cuenta cuenta = new Cuenta(saldo2, CBU, titular);
		Cuenta cuenta1 = new CuentaCliente(saldo2, CBU, titular);
		Double saldoActual = 2000.0;
		Long CBU2 = 5151156004424924942L;
		String titular2 = "Monteagudo Juan Manuel";
		Cuenta cuenta2 = new CuentaVendedor(saldoActual,CBU2, titular2);
		Long cvu = 1544415146944584L;
		String nombreBilletera = "Uala";
		Double saldo = 1000.0;
		Billetera virtual = new Billetera(saldo,cvu, nombreBilletera);
		Double valor = 2000.0;
		String nombreProducto = "Remera";
		String origen = "Chino";
		Producto producto1 = new Producto(valor, nombreProducto, origen);
		virtual.realizarCompra(valor, saldo, cuenta1, cuenta2);
		
	}
	
	@Test(expected = ExcedeLimiteDeCompraException.class)
	public void queSeLanceUnaExcepcionSiElLimiteDeCompraDeLaTarjetaEsInsuficienteParaHacerUnaCompra() throws ExcedeLimiteDeCompraException {
		Long cvu = 1544415146944584L;
		String nombreBilletera = "Uala";
		Double saldo = 1000.0;
		Billetera virtual = new Billetera(saldo,cvu, nombreBilletera);
		Long numeroDeTarjeta = 5200530033684408L;
		Double limiteDisponible = 192000.0;
		Integer fechaDeVencimiento = 20/15/2025;
		Integer codigoDeSeguridad = 354;
		MedioDePago tarjetaDeCredito = new TarjetaDeCredito(numeroDeTarjeta , limiteDisponible ,fechaDeVencimiento,codigoDeSeguridad);
		Double valor = 200000.0;
		String nombreProducto = "Remera";
		String origen = "Chino";
		Producto producto1 = new Producto(valor, nombreProducto, origen);
		virtual.realizarLaCompraConLaTarjetaDeCredito(valor, limiteDisponible);
		
	}
	
	@Test (expected = saldoInsuficienteException.class)
	public void queSeLanceUnaExcepcionSiElSaldoDeLaCuentaEsInsuficienteParaHacerUnaTransferencia() throws saldoInsuficienteException{
		
		Double saldo = 1000.0;
		Long CBU = 51485641661321056L;
		String titular = "Andres Borgeat";
		Cuenta cuenta = new Cuenta(saldo, CBU, titular);
		Cuenta cuenta1 = new CuentaCliente(saldo, CBU, titular);
		Double saldoActual = 2000.0;
		Long CBU2 = 5151156004424924942L;
		String titular2 = "Monteagudo Juan Manuel";
		Cuenta cuenta2 = new CuentaVendedor(saldoActual,CBU2, titular2);
		Double saldo1 = 1000.0;
		Long cvu = 1544415146944584L;
		String nombreBilletera = "Uala";
		Billetera virtual = new Billetera(saldo,cvu, nombreBilletera);
		Double saldoAtrasnferir = 1500.0;
		cuenta.transferir(saldoAtrasnferir ,cuenta1, cuenta2);
		
	}
	
	@Test
	public void queDesdeUnaCuentaCorrienteSePuedaRealizarUnaTransferenciaPorEncimaDeSuSaldo() {
		
	}
}
