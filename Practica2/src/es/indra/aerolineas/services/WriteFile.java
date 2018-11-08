package es.indra.aerolineas.services;
import es.indra.aerolineas.beans.impl.Pasajero;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public void escribirPasajeros(Pasajero p) {
		PrintWriter pw=null;
		try {
			pw=new PrintWriter("C:\\Users\\aula8\\repositorios\\practicas-curso-java/pasajeros.txt","UTF-8");
			pw.printf("%s; %s; %s" ,p.getNombre(),p.getApellido(),p.getDni());
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			try {
				pw.flush();
				pw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
