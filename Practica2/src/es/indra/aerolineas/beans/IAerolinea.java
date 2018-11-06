/**
 * 
 */
package es.indra.aerolineas.beans;

import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author aula4
 *
 */
public interface IAerolinea {

	
	public Vuelo[] consultarVuelos(String origen);
	public Vuelo[] consultarVuelos(String origen, String destino);
	public void anularVuelos(String... vuelos);
	 String getNombre();
	 Vuelo[] getVuelos();
}
