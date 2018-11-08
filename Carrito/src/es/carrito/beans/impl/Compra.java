package es.carrito.beans.impl;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	private String fecha;
	private double total;
	private List<Producto> productosComprar=new ArrayList<Producto>();
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<Producto> getProductosComprar() {
		return productosComprar;
	}
	public void setProductosComprar(List<Producto> productosComprar) {
		this.productosComprar = productosComprar;
	}
	
	
	
}
