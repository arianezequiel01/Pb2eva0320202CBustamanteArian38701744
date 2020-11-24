package ar.edu.unlam.pb220202c.eva03;

public class Vehiculo {

	private String Patente;
	private Integer VelocidadActual;
	private Integer limiteVelocidad;

	
	public void incrmentarVelocidad(Integer Velocidad) 
	{
		VelocidadActual=Velocidad;
	}

	public Vehiculo(String patente, Integer velocidadActual, Integer limiteVelocidad) 
	{
		super();
		Patente = patente;
		VelocidadActual = velocidadActual;
		this.limiteVelocidad = limiteVelocidad;
	}


	public String getPatente() 
	{
		return Patente;
	}


	public void setPatente(String patente)
	{
		Patente = patente;
	}


	public Integer getVelocidadActual() 
	{
		return VelocidadActual;
	}


	public void setVelocidadActual(Integer velocidadActual) 
	{
		VelocidadActual = velocidadActual;
	}


	public Integer getLimiteVelocidad() 
	{
		return limiteVelocidad;
	}


	public void setLimiteVelocidad(Integer limiteVelocidad) 
	{
		this.limiteVelocidad = limiteVelocidad;
	}
	
	
	
	
}
