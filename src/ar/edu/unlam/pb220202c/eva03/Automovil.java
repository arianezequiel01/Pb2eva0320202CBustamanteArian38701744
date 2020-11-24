package ar.edu.unlam.pb220202c.eva03;

public class Automovil extends Vehiculo {
	
	protected Integer cantidadAsientos;
	protected String tipo;
	protected static Integer limiteVelocidadAutomovil=130;
	
	

	public Automovil(String patente, Integer velocidadActual, Integer limiteVelocidad, Integer cantidadAsientos, String tipo) {
		super(patente, velocidadActual, limiteVelocidad);
		this.cantidadAsientos=cantidadAsientos;
		this.tipo=tipo;
		limiteVelocidad=limiteVelocidadAutomovil;
	}



	public Integer getCantidadAsientos() {
		return cantidadAsientos;
	}



	public void setCantidadAsientos(Integer cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public static Integer getLimiteVelocidadAutomovil() {
		return limiteVelocidadAutomovil;
	}



	public static void setLimiteVelocidadAutomovil(Integer limiteVelocidadAutomovil) {
		Automovil.limiteVelocidadAutomovil = limiteVelocidadAutomovil;
	}

	//Si es necesario Utilice herencia o implemente de Interfaces
//	Se debe crear contructeres getters y Setters y loos que crean convenientes
	
//el Limite de velociadad para autos es de 130km
//en caso que supere dicho limite el este sera multado

	
	
   
	
}
