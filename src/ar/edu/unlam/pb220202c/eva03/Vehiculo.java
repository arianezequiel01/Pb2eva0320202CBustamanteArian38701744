package ar.edu.unlam.pb220202c.eva03;

public class Vehiculo {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Patente == null) ? 0 : Patente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (Patente == null) {
			if (other.Patente != null)
				return false;
		} else if (!Patente.equals(other.Patente))
			return false;
		return true;
	}


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
	
	
	
	
}
