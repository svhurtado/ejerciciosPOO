package panaderia.pasteleria;

import panaderia.Pan;

/**
 * Clase que NO es hija y además está en otro paquete.
 * y tratará de cambiar directamente valores de los atributos de un objeto Pan,
 * para verificar si es posible o no.
 */
public class Pastelero {
	
	public Pan hacerPanNavidad()
	{
		Pan panNavidad = new Pan();
		
		// panNavidad.tamanho = "mediano";
		// panNavidad.precio = 5000;
		// panNavidad.tipo = "con fruta cristalizada";
		// panNavidad.empacado = true;
		
		return panNavidad;
		
	}

}
