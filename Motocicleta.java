package examen_recuperacionRA4R7_charo;

public class Motocicleta extends VehiculoTerrestre {

	public Motocicleta(String nombre, int numPaxPosibles, int numPaxTransportadas, String matricula,
			int anioFabricacion, Color color) {
		super(nombre, numPaxPosibles, numPaxTransportadas, matricula, anioFabricacion, color);
		this.nombre = nombre;
		this.numPaxPosibles= numPaxPosibles;
		this.numPaxTransportadas= numPaxTransportadas;
		this.matricula= matricula;
		this.anioFabricacion = anioFabricacion;
		this.color=color;
	}


}
