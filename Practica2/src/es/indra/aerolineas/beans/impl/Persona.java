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
	
	

	public String getNombre() {
		
		return nombre.toUpperCase();
	}




	
	public abstract String solicitarInformacion();


}
