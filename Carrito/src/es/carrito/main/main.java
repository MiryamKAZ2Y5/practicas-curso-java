package es.carrito.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.carrito.beans.impl.Cliente;
import es.carrito.beans.impl.Compra;
import es.carrito.beans.impl.Empresa;
import es.carrito.beans.impl.Producto;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creación de la empresa
		Empresa e= new Empresa();
		
		//Creación de los productos
		Producto p1 = new Producto(1,"Arroz","prducto alimenticio",1,0.50,100);
		Producto p2 = new Producto(2,"Pasta","Producto alimenticio",1,1.00,150);
		Producto p3 = new Producto(3,"Jabon", "Producto de perfumeria",2,1.99,50);
		Producto p4 = new Producto(4,"Papel", "Producto de perfumeria",2,4.00,100);
		Producto p5 = new Producto(5,"Detergente", "Producto de limpieza", 3, 5.99,20);
		Producto p6 = new Producto (6,"Escoba", "Producto de limpieza",3,3.00, 3);
		//Creación producto 0, se usa en el menú.
		Producto p0=new Producto();
		
		//Añadir productos al arraylist de productos de la empresa.
		e.getProductos().add(p1);
		e.getProductos().add(p2);
		e.getProductos().add(p3);
		e.getProductos().add(p4);
		e.getProductos().add(p5);
		e.getProductos().add(p6);
		
		//Creación de clientes.
		Cliente c1= new Cliente(1,"Antonio", "Garrido", "direccion 1", 6589);
		Cliente c2= new Cliente(2,"juan", "lopez", "direccion 2", 645654);
		Cliente c3= new Cliente(3,"dani", "lorenzo", "direccion 3", 54654);
		Cliente c4= new Cliente(4,"miriam", "anton", "direccion 4", 6584569);
		Cliente c5= new Cliente(5,"eduardo", "pepe", "direccion 5", 4565);
		//Cliente 0, sirve para el menú
		Cliente c0= new Cliente();
		
		//Añadir clientes al arraylist de clientes de la empresa.
		e.getClientes().add(c1);
		e.getClientes().add(c2);
		e.getClientes().add(c3);
		e.getClientes().add(c4);
		e.getClientes().add(c5);
		
		/**
		 * Prueba sin menu
		c2.añadirProducto(c1, p1, 2);
		c2.añadirProducto(c1, p2, 2);
		c2.finalizarCompra(c1, "11", e);
		System.out.println(c1.getCarrito().toString());
		e.mostrarCompras();
		e.cambiarStock(1, 200);**/
		
		
		
		
		//Menú
		Scanner sc = new Scanner(System.in);
		int opcion=9;
		while(opcion !=0){//Opciones que te da el programa nada más arrancar
			System.out.println("1. Empresa");
			System.out.println("2. Cliente");
			System.out.println("0. Salir");//Sales del programa
			System.out.println("¿Quien eres? ");
			opcion = sc.nextInt();
			switch(opcion){
			case 1: //Eligiendo la opcion de empresa te salen los metodos de la empresa
				System.out.println("1. Cambiar stock de producto");
				System.out.println("2. Ver compras");
				System.out.println("3. Ver productos");
				System.out.println("4. Atras");
				System.out.println("0. Salir");
				System.out.println("Elige opción: ");
				opcion = sc.nextInt();
				switch (opcion){
				case 1:
					System.out.println("Itroduce id de producto");
					int id=sc.nextInt();
					System.out.println("Introduce cantidad de stock");
					int cantidad=sc.nextInt();
					e.cambiarStock(id, cantidad);
					break;
				case 2:
					if(!e.getCompras().isEmpty() || e.getCompras()!=null) {
						e.mostrarCompras();
					}else {
						System.out.println("No hay compras");
					}
					
					break;
				case 3:
					if(!e.getProductos().isEmpty() || e.getProductos()!=null) {
						e.mostrarProductos();
					}else {
						System.out.println("No hay productos");
					}
					e.mostrarProductos();
					break;
				case 4:
					break;
				}
			case 2://Eligiendo la opción de cliente te salen los metodos de cliente
				System.out.println("1. Añadir producto");
				System.out.println("2. Finalizar compra");
				System.out.println("3. Atras");
				System.out.println("0. Salir");
				System.out.println("Elige opción: ");
				opcion = sc.nextInt();
				switch (opcion){
				case 1:
					System.out.println("Itroduce id cliente");
					int c=sc.nextInt();
					System.out.println("Introduce id producto");
					int p=sc.nextInt();
					System.out.println("Introduce cantidad del producto");
					int cantidad=sc.nextInt();
					for (int i=0; i<e.getClientes().size();i++) {
						if(e.getClientes().get(i).getId()==c) {
							for(int j=0; j<e.getProductos().size();j++) {
								if(e.getProductos().get(j).getId()==p) {
									c0.añadirProducto(e.getClientes().get(i), e.getProductos().get(j), cantidad);
								}
							}
							
						}
					}
					break;
				case 2:	
					System.out.println("Itroduce id cliente");
					 c=sc.nextInt();
					 System.out.println("Itroduce fecha");
					 String fecha = sc.nextLine();
					 for (int i=0; i<e.getClientes().size();i++) {
							if(e.getClientes().get(i).getId()==c) {
								c0.finalizarCompra(e.getClientes().get(i), fecha, e);
							}
						}
					 break;
				case 3: 
					break;
					 
				}
				
			}
		}
		
		
		
	}

}
