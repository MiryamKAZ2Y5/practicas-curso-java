/**
 * 
 */
package colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 * @author miryam
 *
 */
public class MapasDemo {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String>estudiantes=new HashMap<>();
		estudiantes.put("Perez", "Andres");
		estudiantes.put("Gomez", "Andres");
		estudiantes.put("López", "Andres");
		estudiantes.put("García", "Andres");
		System.out.println(estudiantes.size());
		for(Map.Entry<String, String> elemento: estudiantes.entrySet()) {
			System.out.println("Clave: "+elemento.getKey()+" y valor: "+elemento.getValue());
		}
		
	}

}
