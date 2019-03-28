package panaderia.otros;

import panaderia.Pan;

/**
 * Clase HIJA de la clase Pan. Se encuentra en otro paquete.
 * Tratará de usar los valores de los atributos que hereda para elaborar una descripción,
 * verificando si tiene acceso directo o no a estos atributos.
 */
public class PanTajado extends Pan {
	
	public String descripcion()
	{
		String texto = "Pan tajado ";
		
		// texto+=" - tamanho: "+ tamanho;
		// texto+=" - precio: "+precio;
		// texto+=" - tipo: "+tipo;
		// texto+=" - empacado: "+empacado;
	
		return texto;
	}

}
