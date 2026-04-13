package examen_recuperacionRA4R7_charo;

public class CompararPorAnio extends Comparator<VehiculoTerrestre> {
	
	public int compare(VehiculoTerrestre v1, VehiculoTerrestre v2) {
		
		return((v1.getAnioFabricacion() < v2.getAnioFabricacion())? -1 : (v2.getAnioFabricacion() < v1.getAnioFabricacion())? 1 :0);
		
	}

}
