package empresaCamiones;
import java.util.*;

public class Ruta {
	int identificador=1;
	HashMap <String,ArrayList<String>> rutas = new HashMap<>();
	void generarRuta(String nombreConductor, String modeloVehiculo, String placaVehiculo, String lugarSalida, String lugarLlegada, String horaSalida, String horaLlegada) {
		ArrayList <String> ruta = new ArrayList<>();
		ruta.add(nombreConductor);
		ruta.add(modeloVehiculo);
		ruta.add(placaVehiculo);
		ruta.add(lugarSalida + " - " +  lugarLlegada);
		ruta.add(horaSalida + " - " +  horaLlegada);
		
		
		rutas.put("ruta" + identificador, ruta);
		identificador++;

	}
	
	void consultarRutas() {
		for (int i = 0; i < rutas.size(); i++) {
			System.out.println("\n" + i+1 + ". " + "Conductor: " + rutas.get("ruta"+(i+1)).get(0) + 
					"\nModelo y placa del vehiculo: " + rutas.get("ruta"+(i+1)).get(1) + " - " + rutas.get("ruta"+(i+1)).get(2) +
					"\nLugar de llegada y salida: " + rutas.get("ruta"+(i+1)).get(3) + 
					"\nHora de llegada y salida: " + rutas.get("ruta"+(i+1)).get(4));
		}
	}
}
