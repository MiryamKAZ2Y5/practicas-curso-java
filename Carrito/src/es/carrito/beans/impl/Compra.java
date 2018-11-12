package es.carrito.beans.impl;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	private Cliente cliente;
	private String fecha;
	private double total;
	private List<Producto> productosComprar=new ArrayList<Producto>();
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
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
	@Override
	public String toString() {
		return "Compra [cliente=" + cliente + ", fecha=" + fecha + ", total=" + total + ", productosComprar="
				+ productosComprar + "]";
	}
	
	
	
	
}
