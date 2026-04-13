package examen_recuperacionRA4R7_charo;

public class Garaje {
	private Vehiculo vehiculoActual;
	Boolean vacio =true;	

	public Garaje(Vehiculo vehiculoActual) {
		this.vehiculoActual = vehiculoActual;

	}
	
	public void entrar(Vehiculo v) {
		if (vacio == true) {
			this.vehiculoActual =v;
			vacio = false;
		}else {
			System.out.println("El garaje está ocupado");
		}
	}
	public Vehiculo salir() {
		if (vacio = true) {
			System.out.println("No hay vehículos en el garaje");
		}else {
			return vehiculoActual;
		}
		this.vehiculoActual = null;
		vacio = true;
	}
	
	public Boolean mostrarEstado() {
		System.out.println("¿Está vacío? "+ vacio);
		return vacio;
	}
	
}
