package empresaCamiones;
import java.util.*;

public class Conductor {
	ArrayList<String> nombres = new ArrayList<>();
	ArrayList<String> identificaciones = new ArrayList<>();
	int contador=0;
	
	void agregarconductor(String nombre, String id) {
		nombres.add(nombre);
		identificaciones.add(id);
		contador++;
	}
	
	void consultarConductores() {
		for (int i=0;i<nombres.size();i++) {
				System.out.println("\n" + i+1 + ". " + nombres.get(i) + " - ID:" + identificaciones.get(i));
		}
	}

}
