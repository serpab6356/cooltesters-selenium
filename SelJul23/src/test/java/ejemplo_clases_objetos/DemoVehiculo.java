package ejemplo_clases_objetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo minivan = new Vehiculo();
		int rango;
		
		//Asignar valores a los campos
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calculo del rango con tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango " + rango + " kilometros ");
		
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numero de pasajeros en carro es: " + carro.pasajeros);

	}

}
