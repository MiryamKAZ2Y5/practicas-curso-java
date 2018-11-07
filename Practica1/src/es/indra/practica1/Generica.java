/**
 * 
 */
package es.indra.practica1;

/**
 * @author Miryam
 *
 */
public class Generica <T> {
	
	private T t;
	
	

	public T getT() {
		return t;
	}



	public void setT(T t) {
		this.t = t;
	}

	public <U extends Number> void revision(U u) {
		System.out.println("T es de tipo" + t.getClass().getName());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generica <String> prueba1=new Generica <String>();
		prueba1.setT("Hola");
		Generica <Integer> prueba2=new Generica<Integer>();
		prueba2.setT(1);
		Generica <Variables> prueba3=new Generica <Variables>();
		Variables v=new Variables();
		prueba3.setT(v);
		System.out.println(prueba1.getT());
		System.out.println(prueba2.getT());
		System.out.println(prueba3.getT().id);
		prueba2.revision(2);
		

	}

}
