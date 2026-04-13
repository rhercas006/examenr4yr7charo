package examen_recuperacionRA4R7_charo;

public class Helicoptero extends VehiculoAereo {

	public Helicoptero(String nombre, int numPaxPosibles, int numPaxTransportadas, int altitud, String oaci) {
		super(nombre, numPaxPosibles, numPaxTransportadas, altitud, oaci);
		this.nombre = nombre;
		this.numPaxPosibles = numPaxPosibles;
		this.numPaxTransportadas = numPaxTransportadas;
		this.altitud = altitud;
		this.oaci = oaci;
		numeroVehiculosAereos++;
	}
	
	public void volar() {
	System.out.println(this.getClass() + " volando a "+ getAltitud());
	}
	
	@Override
	public void transportar(int personas) {
		int total = personas + getNumPaxTransportadas();
		if ((total) < (getNumPaxPosibles()+1)) {
			setNumPaxTransportadas(numPaxTransportadas + personas);
		}else {
			System.out.println("El número de pasajeros sobrepasa el máximo");
		}
	}
}
