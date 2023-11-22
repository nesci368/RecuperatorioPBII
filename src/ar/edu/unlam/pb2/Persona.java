package ar.edu.unlam.pb2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Integer dni;
	
	
	
	public Persona(String nombre, String apellido, Integer dni) {
		this.apellido = apellido;
		this.dni = dni;
		this.nombre = nombre;
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


	
	

}
