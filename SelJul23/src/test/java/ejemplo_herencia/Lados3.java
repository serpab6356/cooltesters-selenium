package ejemplo_herencia;

public class Lados3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo t1 = new Triangulo ();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilos = "Estilo 1";
		
		System.out.println("Información para ti: " );
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: " + t1.area());
		
		
		//Polimorfismo
		
		Triangulo t2 = new Triangulo ();
		
		t2.base = 5.0;
		t2.altura = 5.0;
		t2.estilos = "Estilo 2";
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Información para ti: " );
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es: " + t2.area());
		

	}

}
