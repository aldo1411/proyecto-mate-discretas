import java.util.Scanner;

public class Main {
	static BinaryTree arbol = new BinaryTree();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		runInstructions(scan);
	}
	
	public static void runInstructions (Scanner scan) {
		int llave;
		int count;
		String nombre;
		String recorrido;
		
		System.out.println("Hola, bienvenido a mi proyecto de matemáticas discretas");	
		System.out.println("Por favor ingresa el número de nodos que quieres agregar");
		count = scan.nextInt();
		
		for(int i=0; i<count; i++) {
			System.out.println("Ingrese la llave del nodo en formato numérico (cualquier número)");
			llave = scan.nextInt();
			System.out.println("Ingrese el contenido del nodo en formato de cadena (cualquier texto)");
			nombre = scan.next();
			arbol.addNode(nombre, llave);
		}
		
		System.out.println("ahora ingrese el tipo de búsqueda que se le hará al árbol \n para un recorrido de orden transversal ingrese o \n para un recorrido de orden pre-orden transversal ingrese p \n para un recorrido de post-orden transversal ingrese po");
		recorrido = scan.next();
		switch(recorrido) {
			case "o":
				arbol.inOrderTraverse(arbol.raiz);
				break;
			case "p":
				arbol.preOrderTraverse(arbol.raiz);
				break;
			case "po":
				arbol.postOrderTraverse(arbol.raiz);
				break;
			default:
				System.out.println("opción desconocida, teclee otra");
				break;
		}
	}
	
}
