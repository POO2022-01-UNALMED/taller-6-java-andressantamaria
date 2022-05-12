package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;


	//Camion c1 =  new Camion("SS", "Camion premium", 1000, 100, f, 3);
	public Camion(String placa, String nombre, double precio, double peso,
			Fabricante fabricante, int ejes) {
		
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

}
