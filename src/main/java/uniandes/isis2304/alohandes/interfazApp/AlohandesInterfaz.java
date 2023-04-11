package uniandes.isis2304.alohandes.interfazApp;

import java.util.Scanner;

import uniandes.isis2304.alohandes.persistencia.PersistenciaAlohandes;

public class AlohandesInterfaz {
	
	private PersistenciaAlohandes pa;
	
	public AlohandesInterfaz() {
		Scanner sc = new Scanner(System.in);
		generarBienvenida();
		generarMenu(sc);
	}
	
	public void generarBienvenida() {
		System.out.println("------------BIENVENIDO A ALOHANDES------------\n\n");
	}
	
	public void generarMenu(Scanner sc) {
		System.out.println("Que operación desea realizar?");
		System.out.println("1. Modificar la base de datos");
		System.out.println("2. Una consulta en la base de datos");
		System.out.println("Escriba el número de la opción que desea realizar");
		String resp1 = sc.nextLine();
		if (resp1.equals("1")) {
			System.out.println("\n\n");
			System.out.println("Que operación desea realizar?");
			System.out.println("1. Registrar una reserva");
			System.out.println("2. Eliminar una reserva");
			System.out.println("3. Retirar una oferta de alohamiento");
		} else if (resp1.equals("2")) {
			System.out.println("\n\n");
			System.out.println("Que operación desea realizar?");
			System.out.println("1. Mostrar el dinero recibido por cada proovedor de alojamiento");
			System.out.println("2. Mostrar las 20 ofertas más populares");
			System.out.println("3. Mostrar el indice de ocupación de cada oferta");
		} else {
			
		}
	}

	public static void main(String[] args) {
		AlohandesInterfaz a = new AlohandesInterfaz();
	}

}
