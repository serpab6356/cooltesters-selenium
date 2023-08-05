package ejemplo_herencia;

public class Triangulo extends DosDimensiones{
	
	String estilos;
	
	double area() {
		return base * altura / 2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es " + estilos);
	}

}
