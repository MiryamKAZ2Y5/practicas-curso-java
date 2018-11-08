/**
 * 
 */
package es.indra.aerolineas.main;
import java.util.ArrayList;
import java.util.List;

import es.indra.aerolineas.beans.*;
import es.indra.aerolineas.beans.impl.Aerolinea;
import es.indra.aerolineas.beans.impl.Billete;
import es.indra.aerolineas.beans.impl.Empleado;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Vuelo;
import es.indra.aerolineas.services.WriteFile;

/**
 * @author miryam
 *
 */
public class Venta {
	
	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {	
			int a = (int) (Math.random()*10+1);
			vuelos[i] = new Vuelo(i,"SD" + a, "MAD","VLC", i * 10, true   );
		}
		return vuelos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vuelo[] vuelos = creaVuelos();
		
		IAerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
		Pasajero p = new Pasajero();
		
		Vuelo[] vuelosPasajero = {vuelos[0], vuelos[4]};
		
		p.setId(10);
		p.setNombre("Jose Julian");
		p.setApellido("Ariza Valderrama");
		p.setDni("65789768g");
		p.setVuelos(vuelosPasajero);
		aa.anularVuelos("1","2","3","4");
		aa.anularVuelos();
		System.out.println("*************************************************************************");
		
		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
		
		System.out.printf("|\tTenemos %s vuelos disponibles%n",aa.getVuelos().length);
		
		System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(), p.getVuelos().length );
		
		System.out.println("*************************************************************************");
		
		Pasajero p2 = new Pasajero();
		Pasajero p3= new Pasajero();
		Pasajero p4= new Pasajero();
		Pasajero p5= new Pasajero();
		List <Billete>lista1=new ArrayList<Billete>();
		List <Billete>lista2=new ArrayList<Billete>();
		Billete b1=new Billete(1, vuelos[1], p, "08-11-18", 1);
		Billete b3=new Billete(3, vuelos[1], p3, "08-11-18", 3);
		Billete b4=new Billete(4, vuelos[1], p4, "08-11-18", 4);
		Billete b5=new Billete(5, vuelos[1], p5, "09-11-18", 5);
		Billete b2=new Billete(2, vuelos[1], p2, "09-11-18", 2);
		lista1.add(b1);
		lista1.add(b3);
		lista1.add(b4);
		lista2.add(b2);
		lista2.add(b5);
		aa.consultarVuelos();
		aa.getBilletes().put("08-11-18", lista1);
		System.out.println(lista1.size());
		aa.getBilletes().put("09-11-18", lista2);
		aa.verBilletesPorFecha("08-11-18");
		WriteFile wf=new WriteFile();
		wf.escribirPasajeros(p);
		
		

	}

}
