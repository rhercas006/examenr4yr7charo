package examen_recuperacionRA4R7_charo;

public abstract class VehiculoAereo extends Vehiculo{
	protected int altitud;
	protected String oaci;
	protected static int numeroVehiculosAereos;
	
	
	
	public VehiculoAereo(String nombre, int numPaxPosibles, int numPaxTransportadas, int altitud, String oaci) {
		super(nombre, numPaxPosibles, numPaxTransportadas);
		this.altitud = altitud;
		this.oaci = oaci;
	}

	@Override
	public abstract void transportar(int personas);


	public abstract void volar();

	public int getAltitud() {
		return altitud;
	}

	public void setAltitud(int altitud) {
		this.altitud = altitud;
	}

	public String getOaci() {
		return oaci;
	}

	public void setOaci(String oaci) {
		this.oaci = oaci;
	}

	public static int getNumeroVehiculosAereos() {
		return numeroVehiculosAereos;
	}

	public static void setNumeroVehiculosAereos(int numeroVehiculosAereos) {
		VehiculoAereo.numeroVehiculosAereos = numeroVehiculosAereos;
	}

	@Override
	public String toString() {
		return "VehiculoAereo [altitud=" + altitud + ", oaci=" + oaci + ", nombre=" + nombre + ", numPaxPosibles="
				+ numPaxPosibles + ", numPaxTransportadas=" + numPaxTransportadas + ", getAltitud()=" + getAltitud()
				+ ", getOaci()=" + getOaci() + ", getNombre()=" + getNombre() + ", getNumPaxPosibles()="
				+ getNumPaxPosibles() + ", getNumPaxTransportadas()=" + getNumPaxTransportadas() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
