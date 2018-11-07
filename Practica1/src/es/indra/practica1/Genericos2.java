/**
 * 
 */
package es.indra.practica1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author miryam
 *
 */
public class Genericos2 <K,V> implements IGenericos2<K,V> {

	private K key;
	private V value;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IGenericos2<Integer, String>g1=new Genericos2<>(1,"hola");
		System.out.println(g1.getValue()+g1.getKey());
		IGenericos2<Integer, String>g2=new Genericos2<>(63546,"Que tal");
		System.out.println(g2.getValue()+g2.getKey());
		
		List<Integer>listado=new ArrayList<>();
		listado.add(6);
		listado.add(56);
		List<? super Integer> listadoDesconocido2 = new ArrayList<>();
		listadoDesconocido2.add(new Integer (45));
	}
	public Genericos2(K key, V value) {
		this.key=key;
		this.value=value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
