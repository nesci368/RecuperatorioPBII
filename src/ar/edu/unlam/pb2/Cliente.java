package ar.edu.unlam.pb2;

public class Cliente extends Persona {

	private String nombre;
	private String apellido;
	private Integer dni;
	private Long cuil;

	public Cliente(String nombre, String apellido, Integer dni, Long cuil) {
		super(nombre, apellido, dni);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuil = cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Long getCuil() {
		return cuil;
	}

	public void setCuil(Long cuil) {
		this.cuil = cuil;
	}
	
	

}
