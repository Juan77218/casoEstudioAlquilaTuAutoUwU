package clasesUwU;

public class Stock {
	private Auto[] autos;
	private int contador = 0;
	
	public Stock() {
		autos = new Auto[10];
	}

	public Auto[] getAutos() {
		return autos;
	}

	public void agregarAuto(int kmAct, int placaAuto, String modelo, String color, String marca) {
		if(contador < 10) {
			autos[contador] = new Auto(kmAct, placaAuto, modelo, color, marca);
			contador++;
		}else {
			System.out.println("No se pueden agregar más autos, no joda ome");
		}
	}
	
	public Auto buscar(int placaBuscar) {
		for(Auto autoIterado: autos) {
			if(autoIterado.getPlacaAuto() == placaBuscar) {
				return autoIterado;
			}
		}
		return null;
	}
	
	public boolean alquilarAuto(int placaAuto, int kmAct, int cedula, String apellido) {
		Auto autoBuscado = buscar(placaAuto);
		if(!autoBuscado.equals(null) && autoBuscado.alquilarAuto(kmAct, cedula, apellido)){
			return true;
		}else {
			return false;
		}
	}
	
	public int devolucionAuto(int placaAuto, int nuevoKm, boolean fueAccidentado, boolean fueMultado) {
		Auto autoBuscado = buscar(placaAuto);
		
		if(!autoBuscado.equals(null)){
			int costoAlquiler = autoBuscado.devolucionAuto(nuevoKm, fueAccidentado, fueMultado);
			return costoAlquiler;
		}
		return 0;
		
	}
}
