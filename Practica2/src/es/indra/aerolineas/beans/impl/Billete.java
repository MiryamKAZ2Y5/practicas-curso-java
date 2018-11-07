/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author Miryam
 *
 */
public class Billete {

	public int id;
	public Vuelo vuelo;
	public Pasajero pasajero;
	public String fecha;
	public int numeroAsiento;
	
	public Billete() {
		
	}
	public Billete(int id, Vuelo vuelo, Pasajero pasajero, String fecha, int numeroAsiento) {
		this.id=id;
		this.vuelo=vuelo;
		this.pasajero=pasajero;
		this.fecha=fecha;
		this.numeroAsiento=numeroAsiento;
	}
	@Override
	public String toString() {
		return "Billete [id=" + id + ", vuelo=" + vuelo + ", pasajero=" + pasajero + ", fecha=" + fecha
				+ ", numeroAsiento=" + numeroAsiento + "]";
	}
	
	
}
