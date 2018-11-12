package es.carrito.beans.impl;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int id;
	private String nombre;
	private String apellidos;
	private String direccion;
	private int telefono;
	private List <Producto> carrito= new ArrayList <Producto>();
	
	
	public Cliente(int id, String nombre, String apellidos, String direccion, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public Cliente() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	public List<Producto> getCarrito() {
		return carrito;
	}

	public void setCarrito(List<Producto> carrito) {
		this.carrito = carrito;
	}
	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", carrito=" + carrito + "]";
	}

	//Método para añadir un producto al carrito
	public void añadirProducto(Cliente c, Producto p, int cantidad) {
		if(p.getStock()>=cantidad) {
			p.setCantidad(cantidad);
			p.setStock(p.getStock()-cantidad);
			c.getCarrito().add(p);
		}else {
			System.out.println("No hay stock");
		}
	}
	//Método para finalizar la compra y guardarla en el registro de compras de la empresa
	public void finalizarCompra(Cliente c, String fecha, Empresa e) {
		int total=0;
		Compra com=new Compra();
		com.setFecha(fecha);
		com.setProductosComprar(c.getCarrito());
		com.setCliente(c);
		for (Producto producto : carrito) {
			total+=producto.getPrecio()*producto.getCantidad();
		}
		com.setTotal(total);
		e.getCompras().add(com);
	}
	
	
	
	
	
	
	

}
