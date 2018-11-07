package es.indra.practica1;

import java.util.Scanner;

public class MetodosEntrada {

	
	public static void main(String[] args) {
		String mensaje;
		System.out.println("Introduce algo");
		Scanner sc = new Scanner(System.in);
		mensaje=sc.nextLine();
		System.out.println(mensaje);

	}

}
