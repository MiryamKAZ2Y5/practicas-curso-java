/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author aula4
 *
 */
public class Persona {
	private int id;
	protected String nombre;
	private String apellido;
	private String dni;
	
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


}
