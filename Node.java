public class Node {
	String nombre;
	int llave;
	
	Node hijoDerecha;
	Node hijoIzquierda;
	
	public Node(String nombre, int llave) {
		super();
		this.nombre = nombre;
		this.llave = llave;
	}

	public String toString() {
		return "Node [nombre=" + nombre + ", llave=" + llave + "]";
	}
}
