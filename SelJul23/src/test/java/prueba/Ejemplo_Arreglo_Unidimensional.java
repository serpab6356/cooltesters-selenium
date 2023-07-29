package prueba;

public class Ejemplo_Arreglo_Unidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		int[] intArray2;
		
		//Declarar un array de Strings
		String[] arr;
		
		//Asignar memoria para String
		arr = new String[5];
		
		//Inicializar el primer elemento de array
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		System.out.println("Elementos en el indice 1: " + arr[1]);
		
		//Acceder a todos los elementos
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Elementos en el indice: " + i + " : " + arr[i]);
		}

	}

}
