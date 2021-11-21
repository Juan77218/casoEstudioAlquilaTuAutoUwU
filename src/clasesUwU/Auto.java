package clasesUwU;

public class Auto {
	private int kmAct;
	private int placaAuto;
	private int cedula;
	private String apellido;
	private String modelo;
	private String color;
	private String marca;
	
	public Auto() {
		this.kmAct = 0;
		this.placaAuto = 0;
		this.cedula = 0;
		this.apellido = null;
		this.modelo = null;
		this.color = null;
		this.marca = null;
	}
	
	public Auto(int kmAct, int placaAuto, String modelo, String color, String marca) {
		this.kmAct = kmAct;
		this.placaAuto = placaAuto;
		this.cedula = 0;
		this.apellido = null;
		this.modelo = modelo;
		this.color = color;
		this.marca = marca;
	}
	
	public boolean alquilarAuto(int kmAct, int cedula, String apellido) {
		if(kmAct == 0 && apellido.equals(null)) {
			this.kmAct = kmAct;
			this.cedula = cedula;
			this.apellido = apellido;
			return true;
		}
		//Si retorna falso es porque no se puede alquilar (Ya está alquilado)
		return false;
	}
	
	public int devolucionAuto(int nuevoKm, boolean fueAccidentado, boolean fueMultado) {
		if(nuevoKm > this.kmAct && (kmAct != 0 && !apellido.equals(null))) {
			this.kmAct = nuevoKm;
			this.cedula = 0;
			this.apellido = null;
			return cobroAuto(nuevoKm, fueAccidentado, fueMultado);
		}
		return 0;
	}
	
	public int cobroAuto(int kmNuevo, boolean fueAccidentado, boolean fueMultado) {
		int kmUsados = kmNuevo - this.kmAct;
		int cobroKm = kmUsados*1000;
		if(fueAccidentado) {
			cobroKm += 890000;
		}
		
		if(fueMultado) {
			cobroKm += 450000;
		}
		
		return cobroKm;
	}
	
	public int getKmAct() {
		return kmAct;
	}
	public void setKmAct(int kmAct) {
		this.kmAct = kmAct;
	}
	public int getPlacaAuto() {
		return placaAuto;
	}
	public void setPlacaAuto(int placaAuto) {
		this.placaAuto = placaAuto;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
