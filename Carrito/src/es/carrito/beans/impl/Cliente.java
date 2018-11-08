package es.carrito.beans.impl;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int id;
	private String nombre;
	private String apellidos;
	private String direccion;
	private int telefono;
	private List <Compra> carrito= new ArrayList <Compra>();
	
	
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

	public List<Compra> getCarrito() {
		return carrito;
	}

	public void setCarrito(List<Compra> carrito) {
		this.carrito = carrito;
	}
	
	
	
	
	
	

}
