package examen_recuperacionRA4R7_charo;

public class Avioneta extends VehiculoAereo {
	public Avioneta(String nombre, int numPaxPosibles, int numPaxTransportadas, int altitud, String oaci) {
		super(nombre, numPaxPosibles, numPaxTransportadas, altitud, oaci);
		this.numPaxPosibles = 4;
		this.numPaxTransportadas = 0;
		numeroVehiculosAereos++;
	}

	public void volar() {
		System.out.println(this.getClass() + " volando a "+ this.altitud);
	}


	@Override
	public void transportar(int personas) {
		if ((personas+this.numPaxTransportadas) < (this.numPaxPosibles+1 )) {
			setNumPaxTransportadas(numPaxTransportadas + personas);
		}else {
			System.out.println("El número de pasajeros sobrepasa el máximo");
		}
	}
}
