/**
 * 
 */
package es.indra.aerolineas.beans;

import java.util.Map;

import es.indra.aerolineas.beans.impl.Billete;
import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author aula4
 *
 */
public interface IAerolinea {

	
	public Vuelo[] consultarVuelos(String origen);
	public Vuelo[] consultarVuelos(String origen, String destino);
	public void consultarVuelos();
	public void anularVuelos(String... vuelos);
	 String getNombre();
	 Vuelo[] getVuelos();
	 Map<Integer, Billete> getBilletes();
	 public void verBilletesPorFecha(String fecha);
}
