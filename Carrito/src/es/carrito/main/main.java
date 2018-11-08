package es.carrito.main;

import java.util.ArrayList;
import java.util.List;

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
		
		//Creación de clientes
		Cliente c1= new Cliente(1,"Antonio", "Garrido", "direccion 1", 6589);
		Cliente c2= new Cliente(2,"juan", "lopez", "direccion 2", 645654);
		Cliente c3= new Cliente(3,"dani", "lorenzo", "direccion 3", 54654);
		Cliente c4= new Cliente(4,"miriam", "anton", "direccion 4", 6584569);
		Cliente c5= new Cliente(5,"eduardo", "pepe", "direccion 5", 4565);
		
		//Añadir clientes al arraylist de clientes de la empresa
		e.getClientes().add(c1);
		e.getClientes().add(c2);
		e.getClientes().add(c3);
		e.getClientes().add(c4);
		e.getClientes().add(c5);
		
		
	}

}
