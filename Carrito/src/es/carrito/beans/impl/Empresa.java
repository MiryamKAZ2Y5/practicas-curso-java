package es.carrito.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Empresa {
	
private List<Cliente> clientes= new ArrayList<Cliente>();
private Map<Integer,List <Compra>>compras=new HashMap<>();
public List<Cliente> getClientes() {
	return clientes;
}
public void setClientes(List<Cliente> clientes) {
	this.clientes = clientes;
}
public Map<Integer, List<Compra>> getCompras() {
	return compras;
}
public void setCompras(Map<Integer, List<Compra>> compras) {
	this.compras = compras;
}


}
