package empresaCamiones;

import java.util.ArrayList;

public class Vehiculo {
	ArrayList<String> modelos = new ArrayList<>();
	ArrayList<String> placas = new ArrayList<>();
	int contador=0;
	
	void agregarVehiculo(String modelo, String placa) {
		modelos.add(modelo);
		placas.add(placa);
		contador++;
	}
	
	void consultarVehiculos() {
		for (int i=0;i<modelos.size();i++) {
				System.out.println("\n" + i + ". " + modelos.get(i) + " - Placa:" + placas.get(i));
		}
	}

}
