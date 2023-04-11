package uniandes.isis2304.alohandes.interfazApp;

import java.util.Scanner;

import uniandes.isis2304.alohandes.persistencia.PersistenciaAlohandes;

public class AlohandesInterfaz {
	
	private PersistenciaAlohandes pa;
	
	public AlohandesInterfaz() {
		pa = new PersistenciaAlohandes();		
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
		System.out.println("3. Salir");
		System.out.println("Escriba el número de la opción que desea realizar");
		String resp1 = sc.nextLine();
		if (resp1.equals("1")) {
			System.out.println("\n\n");
			System.out.println("Que operación desea realizar?");
			System.out.println("1. Registrar una reserva");
			System.out.println("2. Eliminar una reserva");
			System.out.println("3. Retirar una oferta de alohamiento");
			System.out.println("Escriba el número de la opción que desea realizar");
			String resp2 = sc.nextLine();
			
			if (resp2.equals("1")) {
				System.out.println("Escriba la fecha de la reserva:");
				String fecha = sc.nextLine();
				System.out.println("Escriba el precio de la reserva:");
				int precio = Integer.parseInt(sc.nextLine());
				System.out.println("Escriba el id del alojamiento de la reserva:");
				long idAlohamiento = Long.parseLong(sc.nextLine());
				System.out.println("Escriba el id del usuario de la reserva:");
				long idUsuario = Long.parseLong(sc.nextLine());
				System.out.println("Se agregó la reserva con el id: "+pa.adicionarReserva(fecha, precio, idAlohamiento, idUsuario));
				System.out.println("\n\n\n");
				generarMenu(sc);
				
			} else if (resp2.equals("2")) {
				System.out.println("Se eliminó la reserva con el id: "+pa.eliminarReservaPorFecha(""));
				System.out.println("\n\n\n");
				generarMenu(sc);
				
			} else if (resp2.equals("3")) {
				System.out.println("Escriba el id del alojamiento a eliminar:");
				Long id = Long.parseLong(sc.nextLine());
				System.out.println("Se eliminó el alojamiento con el id: "+pa.eliminarAlohamientoPorId(id));
				System.out.println("\n\n\n");
				generarMenu(sc);
				
			}  else {
				System.out.println("\n\n Esa no es una opción valida, intentelo de nuevo \n\n");
				generarMenu(sc);
			}
			
			
		} else if (resp1.equals("2")) {
			System.out.println("\n\n");
			System.out.println("Que operación desea realizar?");
			System.out.println("1. Mostrar el dinero recibido por cada proovedor de alojamiento");
			System.out.println("2. Mostrar las 20 ofertas más populares");
			System.out.println("3. Mostrar el indice de ocupación de cada oferta");
			System.out.println("Escriba el número de la opción que desea realizar");
			String resp3 = sc.nextLine();
			
			if (resp3.equals("1")) {
				System.out.println("Escriba el año del que desea hacer la consulta:");
				int anhio = Integer.parseInt(sc.nextLine());
				System.out.println(pa.darDineroRecibido(anhio));
				System.out.println("\n\n\n");
				generarMenu(sc);
				
			} else if (resp3.equals("2")) {
				System.out.println(pa.dar20MasPopulares());
				System.out.println("\n\n\n");
				generarMenu(sc);
				
			} else if (resp3.equals("3")) {
				System.out.println(pa.darIndiceOcupacion());
				System.out.println("\n\n\n");
				generarMenu(sc);
				
			} else {
				System.out.println("\n\n Esa no es una opción valida, intentelo de nuevo \n\n");
				generarMenu(sc);
			}
			
		} else if (resp1.equals("3")) {
			
			
		} else {
			System.out.println("\n\n Esa no es una opción valida, intentelo de nuevo \n\n");
			generarMenu(sc);
		}
	}

	public static void main(String[] args) {
		AlohandesInterfaz a = new AlohandesInterfaz();
	}

}
