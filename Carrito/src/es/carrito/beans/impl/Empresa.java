package es.carrito.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Empresa {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Compra> compras = new ArrayList<Compra>();
	private List<Producto> productos = new ArrayList<Producto>();

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	//Métododo que muestra todas las compras realizadas
	public void mostrarCompras() {
		for (Compra compra : compras) {
			System.out.println(compra.toString());
		}
	}
	//Método que muestra todos los productos disponibles
	public void mostrarProductos() {
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}
	}
	//Método para cambiar el stock de determinado producto
	public void cambiarStock(int id, int cantidad) {
		for (Producto p : productos) {
			if(p.getId()==id) {
				p.setStock(cantidad);
				System.out.println("El stock del producto: "+p.getNombre()+" ha cambiado a: "+p.getStock());
			}
		}
		
	}
	

}
