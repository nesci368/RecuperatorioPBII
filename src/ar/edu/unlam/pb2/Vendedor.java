package ar.edu.unlam.pb2;

public class Vendedor extends Persona {

	private Long cuit;
	private Integer dni;
	private String apellido;
	private String nombre;

	public Vendedor(String nombre, String apellido, Integer dni, Long cuit) {
		super(nombre, apellido, dni);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuit = cuit;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void queSePuedaRegistrarUnVendedor(Persona personaj) {
		// TODO Auto-generated method stub
		
	}
	
	

}
