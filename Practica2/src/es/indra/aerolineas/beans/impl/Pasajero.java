/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author miryam
 *
 *
 */
public class Pasajero extends Persona {
	
	public String getNombre() {
		return nombre;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		if(nombre.equals("") || nombre==null) {
			this.nombre = "Sin nombre";
		}else {
			this.nombre = nombre;
		}
	}
	public String getApellido() {
		return apellido;
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
	private Vuelo[] vuelos;


	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String solicitarInformacion() {
		return "Toma información";
	}
	 
	
	

}
