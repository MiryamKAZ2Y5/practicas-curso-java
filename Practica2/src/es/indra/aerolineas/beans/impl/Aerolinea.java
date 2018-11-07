/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.exceptions.ErrorLecturaVuelosException;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author miryam
 *
 *
 */
public class Aerolinea implements IAerolinea{
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	private Map<Integer,Billete>billetes=new HashMap<>();
	
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
	
	
	public Map<Integer, Billete> getBilletes() {
		return billetes;
	}

	public void setBilletes(Map<Integer, Billete> billetes) {
		this.billetes = billetes;
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
	public void consultarVuelos() {
		ReadFile rf= new ReadFile ();
		List<String> contenido;
		try {
			contenido = rf.retornarVuelos();
			for (String con: contenido) {
				 System.out.println(con);
			 }
		} catch (ErrorLecturaVuelosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}
	public void anularVuelos(String... vuelos) {
		System.out.println("Numero de vuelos a anular: "+ vuelos.length);
	}
	public void verBilletesPorFecha(String fecha) {
		for(Map.Entry<Integer, Billete> elemento: billetes.entrySet()) {
			if(elemento.getValue().fecha.equals(fecha)) {
				System.out.println("Billete: "+elemento.getKey());
				System.out.println("Billete: "+elemento.getValue().toString());
			}
		}
	}

	
	
	

}
