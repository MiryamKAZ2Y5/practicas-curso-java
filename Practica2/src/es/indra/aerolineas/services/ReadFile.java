/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.indra.aerolineas.exceptions.ErrorLecturaVuelosException;

/**
 * @author miryam
 *
 */
public class ReadFile {
	public List<String> retornarVuelos() throws ErrorLecturaVuelosException {
		Path path= Paths.get("C:\\Users\\aula6\\repositorios\\practicas-curso-java/vuelos.txt");
		List<String> contenido=new ArrayList<String>();
		try {
			contenido = Files.readAllLines(path);
		}catch(IOException e){
			ErrorLecturaVuelosException ex = new ErrorLecturaVuelosException("Error en la lectura del archivo");
			throw ex;
		}
		return contenido;
	}
	public static void main(String[] args) {
		ReadFile r =new ReadFile();
		try {
			r.retornarVuelos();
		} catch (ErrorLecturaVuelosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
