/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author miryam
 *
 */
public abstract class Persona {
	protected int id;
	protected String nombre;
	protected String apellido;
	protected String dni;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		
		return nombre.toUpperCase();
	}

	public void setNombre(String nombre) {
		if(nombre.equals("") || nombre==null) {
			this.nombre = "Sin nombre";
		}else {
			this.nombre = nombre;
		}
	}

	public String getApellido() {
		return apellido.toUpperCase();
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public abstract String solicitarInformacion();


}
