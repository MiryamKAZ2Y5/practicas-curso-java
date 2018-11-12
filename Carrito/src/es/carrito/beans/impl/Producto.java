package es.carrito.beans.impl;

public class Producto {
	private int id;
	private String nombre;
	private String descripcion;
	private String categoria;
	private double precio;
	private int stock;
	private int cantidad;
	
	/**Al crear el producto solo podemos meter una categor�a mediante el n�mero 
	 * En el futuro, si nos pidieran un metodo de crear produto mediante el men�, habr�a que contrlar
	 * que solo se pudiese meter el numero de categor�a correcto.
	 * **/
	public Producto(int id, String nombre, String descripcion, int cat, double precio, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		switch (cat) {
		case 1:
			this.categoria="Alimentaci�n";
			break;
		case 2:
			this.categoria="Perfumer�a";
			break;
		case 3:
			this.categoria="Limpieza";
			break;	
		default:
			break;
		}
	}
	public Producto () {
		
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria
				+ ", precio=" + precio + ", stock=" + stock + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	
}
