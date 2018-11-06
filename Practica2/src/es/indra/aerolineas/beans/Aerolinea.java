/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	
	public Aerolinea() {		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}
	
	
	public Vuelo[] consultarVuelos(String origen) {
	 Vuelo[] vuelosConsultados = new Vuelo[10];
	 int j=0;
	 for (int i = 0; i < vuelos.length; i++) {
		if (vuelos[i].getOrigen().equals(origen)) {
			System.out.println(vuelos[i].toString());
			vuelosConsultados[j]=vuelos[i];
			j++;
			}
			
		
	}
	 
	 return vuelosConsultados;
		
	}
	public Vuelo[] consultarVuelos(String origen, String destino) {
		Vuelo[] vuelosConsultados = new Vuelo[10];
		 int j=0;
		 for (int i = 0; i < vuelos.length; i++) {
				if (vuelos[i].getOrigen().equals(origen) & vuelos[i].getDestino().equals(destino)) {
					System.out.println(vuelos[i].toString());
					vuelosConsultados[j]=vuelos[i];
					j++;
				}
			}
		 return vuelosConsultados;
	}
	public void anularVuelos(String... vuelos) {
		System.out.println("Numero de vuelos a anular: "+ vuelos.length);
	}
	
	
	

}
