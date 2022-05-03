public class BinaryTree {
	Node raiz;
	
	public void addNode(String nombre, int llave) {
		Node nuevoNodo = new Node(nombre, llave);
		
		if(raiz == null) {
			raiz = nuevoNodo;
		}else {
			Node puntero = raiz;	
			Node padre;
			
			while(true) {
				padre = puntero;
				
				if(llave < puntero.llave) {
					puntero = puntero.hijoIzquierda;
					
					if(puntero == null) {
						padre.hijoIzquierda = nuevoNodo;
						return;
					}
				}else {
					puntero = puntero.hijoDerecha;
					
					if(puntero == null) {
						padre.hijoDerecha = nuevoNodo;
						return;
					}
				}
			}
		}
	}
	
	
	public void inOrderTraverse(Node puntero) {
		if(puntero != null) {
			inOrderTraverse(puntero.hijoIzquierda);
			System.out.println(puntero);
			inOrderTraverse(puntero.hijoDerecha);
		}
	}
	
	public void preOrderTraverse(Node puntero) {
		if(puntero != null) {
			System.out.println(puntero);
			preOrderTraverse(puntero.hijoIzquierda);
			preOrderTraverse(puntero.hijoDerecha);
		}
	}
	
	public void postOrderTraverse(Node puntero) {
		if(puntero != null) {
			postOrderTraverse(puntero.hijoIzquierda);
			postOrderTraverse(puntero.hijoDerecha);
			System.out.println(puntero);
		}
	}
	
	public Node findNode(int llave) {
		Node puntero = raiz;
		while(puntero.llave != llave) {
			if(llave < puntero.llave) {
				puntero = puntero.hijoIzquierda;
			}else {
				puntero = puntero.hijoDerecha;
			}
			
			if(puntero == null) 
				return null;	
		}
		
		return puntero;
	}
}
