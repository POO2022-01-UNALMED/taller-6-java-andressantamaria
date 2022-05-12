package vehiculos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Fabricante {
	private String nombre;
	private Pais pais;
	protected ArrayList <Fabricante> fabricantes = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {

		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante  mayoresVendedor = null;
		
		HashMap<Fabricante, Integer> manufacturer = new HashMap<Fabricante, Integer>();
		
		for(Vehiculo lista:Vehiculo.vehiculos) {		//reviso cada nombre de fabricante en el Arraylist de Automovil
			Fabricante aux = lista.getFabricante();
			
			if(manufacturer.containsKey(aux))
				manufacturer.put(aux, manufacturer.get(aux) + 1);	//si ya existe sumo 1 al Integer
			
			else
				manufacturer.put(aux, 1);	//si no existe lo inicializo
			
		}
		
		int maxValueInMap=(Collections.max(manufacturer.values()));	//obtengo el value mayor
		
		
		for (Map.Entry<Fabricante, Integer> entry : manufacturer.entrySet()) {  // Buscamos la key correspondiente al value mayor
            if (entry.getValue()==maxValueInMap) {
            	mayoresVendedor = entry.getKey();
            }
        }

		
		return mayoresVendedor ;
	}
	
	
	//getters & setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
