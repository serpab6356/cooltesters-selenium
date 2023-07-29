package prueba;

public class Ejemplo_if_anidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura = 16;
		
		if(temperatura > 15) {
			if(temperatura > 25) {
				System.out.println("A la playa!!!");
			}else {
				System.out.println("A la montaña");
			}
		}else {
			System.out.println("A descansar");
		}

	}

}
