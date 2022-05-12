package vehiculos;
import java.util.*;

public class Pais {
	private String nombre;
	private static Pais paisMasVendedor;
	protected static ArrayList <Pais> paises = new ArrayList<>();
	
	public Pais (String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	
	public static Pais paisMasVendedor() {
		
		//primero reviso fabricante por fabricante en la lista de auto, y creo un 
		//hashmap que me permita cuantificar las veces que se repite cada país
		HashMap<Pais, Integer> countries = new HashMap<Pais, Integer>();
		
		
		
		for(Vehiculo lista:Vehiculo.vehiculos) {		//reviso cada nombre de fabricante en el Arraylist de Automovil
			Pais aux = lista.getFabricante().getPais();
			
			if(countries.containsKey(aux))
				countries.put(aux, countries.get(aux) + 1);	//si ya existe sumo 1 al Integer
			
			else
				countries.put(aux, 1);	//si no existe lo inicializo
			
		}
		
		int maxValueInMap=(Collections.max(countries.values()));	//obtengo el value mayor
		
		
		for (Map.Entry<Pais, Integer> entry : countries.entrySet()) {  // Buscamos la key correspondiente al value mayor
            if (entry.getValue()==maxValueInMap) {
            	paisMasVendedor = entry.getKey();
            }
        }
		
		return paisMasVendedor;
	}

	//getters & setters
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
}
