package Concesionaria;

public class ConcesionariaPepos {
	public class Auto build(int type) {
		
		switch(type) {
		case 1:
			return new AutoNissan;
		case 2:
			return new AutoToyota;
		case 3:
			return new AutoRenault;
		}
		return null;
	}

}
