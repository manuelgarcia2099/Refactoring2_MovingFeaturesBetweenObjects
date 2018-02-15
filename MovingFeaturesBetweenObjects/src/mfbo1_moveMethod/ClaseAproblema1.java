package mfbo1_moveMethod;

import java.util.Vector;

/**
 * @author Manuel García 2018
 */
public class ClaseAproblema1 {
	
	private String nombre;
	private Vector productos = new Vector();
	
	
	
	public ClaseAproblema1 (String nombre) {
		this.nombre=nombre;
	}
	
	public void agregarProducto(ClaseBproblema1 producto) {
		productos.addElement(producto);
	}
	
	

}
