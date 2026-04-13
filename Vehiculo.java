package examen_recuperacionRA4R7_charo;

public abstract class Vehiculo {
	protected String nombre;
	protected int numPaxPosibles;
	protected int numPaxTransportadas;
	
	public Vehiculo(String nombre, int numPaxPosibles, int numPaxTransportadas) {
		super();
		this.nombre = nombre;
		this.numPaxPosibles = numPaxPosibles;
		this.numPaxTransportadas = numPaxTransportadas;
	}
	
	public Class  mostrarTipo() {
		return getClass();
	}
	
	public static void transportar(int personas);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumPaxPosibles() {
		return numPaxPosibles;
	}

	public void setNumPaxPosibles(int numPaxPosibles) {
		this.numPaxPosibles = numPaxPosibles;
	}

	public int getNumPaxTransportadas() {
		return numPaxTransportadas;
	}

	public void setNumPaxTransportadas(int numPaxTransportadas) {
		this.numPaxTransportadas = numPaxTransportadas;
	}

	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", numPaxPosibles=" + numPaxPosibles + ", numPaxTransportadas="
				+ numPaxTransportadas + "]";
	}
	
	
}
