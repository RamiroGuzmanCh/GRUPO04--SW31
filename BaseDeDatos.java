package Concesionaria;

public class BaseDeDatos {
	private static BaseDeDatos basedatos;
	
	private BaseDeDatos() {}

	public static BaseDeDatos GetInstace() {
		if(basedatos==null) {
			return new BaseDeDatos();
		}
		else {
			return basedatos;
			
		}
	}
}
