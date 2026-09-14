

package empresaCamiones;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String conductor;
		int nListaConductor;
		String id;
		String modelo;
		int nListaModelo;
		String placa;
		
		String lugarSalida;
		String lugarLlegada;
		String horaSalida;
		String horaLlegada;
		int confirmar = 1;
		int eleccion;
		
		Scanner leer = new Scanner(System.in);
		Conductor canalConductor = new Conductor();
		Vehiculo canalVehiculo = new Vehiculo();
		Ruta canalRuta = new Ruta();
		do {
		System.out.println("A continuación, digite el número de la acción que quiera realizar\n1. Agregar conductor\n2. Consultar conductor\n3. Agregar Vehiculo\n4. Consultar vehiculo\n5. Crear una ruta\n6. Consultar Rutas");
		eleccion = leer.nextInt();
		leer.nextLine();
		
		if (eleccion==1) {
		System.out.println("A continuación, escriba el nombre completo del conductor");
		conductor = leer.nextLine();
		System.out.println("A continuación, escriba el numero de identificación del conductor");
		id = leer.nextLine();
		
		canalConductor.agregarconductor(conductor, id);
		}
		
		if (eleccion==2) {
		canalConductor.consultarConductores();
		}
		
		if (eleccion==3) {
			System.out.println("A continuación, escriba el modelo del vehiculo");
			modelo = leer.nextLine();
			System.out.println("A continuación, escriba la placa del vehiculo");
			placa= leer.nextLine();
			canalVehiculo.agregarVehiculo(modelo, placa);
		}
		if (eleccion==4){
			canalVehiculo.consultarVehiculos();
		}
		
		if (eleccion==5) {
			System.out.println("Ingrese el número de lista del conductor que desea añadir");
			nListaConductor = leer.nextInt();
			conductor = canalConductor.nombres.get(nListaConductor-1);
			System.out.println("Ingrese el número de lista del modelo y la placa que desea añadir");
			nListaModelo = leer.nextInt();
			modelo = canalVehiculo.modelos.get(nListaModelo-1);
			placa = canalVehiculo.placas.get(nListaModelo-1);
			System.out.println("Ingrese el lugar del que sale y al que entra el conductor (en ese orden)");
			leer.nextLine();
			lugarSalida = leer.nextLine();
			lugarLlegada = leer.nextLine();
			System.out.println("Ingrese la hora a la que sale y entra el conductor (en ese orden)");
			horaSalida = leer.nextLine();
			horaLlegada = leer.nextLine();
			
			canalRuta.generarRuta(conductor, modelo, placa, lugarSalida, lugarLlegada, horaSalida, horaLlegada);
		}
		if (eleccion==6) {
			canalRuta.consultarRutas();
		}
		
		System.out.println("Quiere continuar usando el programa? Escriba el número según su respuesta\n1. Si\n2. No");
		confirmar = leer.nextInt();
		
		}while(confirmar == 1);
		
		System.out.println("Gracias por usar la plataforma");
		leer.close();
	}

}
