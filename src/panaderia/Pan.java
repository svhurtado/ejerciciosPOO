package panaderia;

/**
 * Clase con atributos que tienen diferente nivel de acceso (o visibilidad),
 * que se intentarán usar desde otras clases - para verificar cuándo compila y cuándo no.
 */
public class Pan {
	
	public String tamanho;
	protected int precio;
	String tipo;
	private boolean empacado;
	
	public Pan()
	{
		tamanho = "mediano";
		precio = 500;
		tipo = "blanco";
		empacado = false;
	}
	
	public boolean getEmpacado()
	{
		return empacado;
	}
	
	public void setEmpacado(boolean empacar)
	{
		empacado = empacar;
	}

}
