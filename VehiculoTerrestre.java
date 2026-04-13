package examen_recuperacionRA4R7_charo;
import java.util.Comparator;
public abstract class VehiculoTerrestre extends Vehiculo implements Comparator{

	protected String matricula;
	protected int anioFabricacion;
	protected Color color;
	public VehiculoTerrestre(String nombre, int numPaxPosibles, int numPaxTransportadas, String matricula,
			int anioFabricacion, Color color) {
		super(nombre, numPaxPosibles, numPaxTransportadas);
		this.matricula = matricula;
		this.anioFabricacion = anioFabricacion;
		this.color = color;
	}
	
	public abstract void equals();
	
	public static void compararPorAnio(v1,v2) implements Comparator<VehiculoTerrestre>{
		v1.compare(v2);
	}

	
	
	
	@Override
	public int compare(VehiculoTerrestre v1, VehiculoTerrestre V2) {
			
			return((v1.getAnioFabricacion() < v2.getAnioFabricacion())? -1 : (v2.getAnioFabricacion() < v1.getAnioFabricacion())? 1 :0);
	}

	@Override
	public void transportar(int personas) {
		// TODO Auto-generated method stub
		
	}

	public String getMatricula() {
		return matricula;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	@Override
	public String toString() {
		return "VehiculoTerrestre [matricula=" + matricula + ", anioFabricacion=" + anioFabricacion + ", color=" + color
				+ "]";
	}
	
	
}
