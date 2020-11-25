package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	
	private Integer cantidadDeEjes;
	private Double pesoMaxCarga;
	protected static Integer limiteVelocidadAutomovil=80;
	
	
	
	public Camion(String patente, Integer velocidadActual, Integer limiteVelocidad, Integer cantidadDeEjes, Double pesoMaxCarga) {
		super(patente, velocidadActual, limiteVelocidad);
		this.cantidadDeEjes=cantidadDeEjes;
		this.pesoMaxCarga=pesoMaxCarga;
		limiteVelocidad=limiteVelocidadAutomovil;
		
	}



	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}



	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}



	public Double getPesoMaxCarga() {
		return pesoMaxCarga;
	}



	public void setPesoMaxCarga(Double pesoMaxCarga) {
		this.pesoMaxCarga = pesoMaxCarga;
	}



	public static Integer getLimiteVelocidadAutomovil() {
		return limiteVelocidadAutomovil;
	}



	public static void setLimiteVelocidadAutomovil(Integer limiteVelocidadAutomovil) {
		Camion.limiteVelocidadAutomovil = limiteVelocidadAutomovil;
	}
	
	
	
	
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	
}
