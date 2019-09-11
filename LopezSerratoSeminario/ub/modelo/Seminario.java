package modelo;

public class Seminario {
	
	private final int NUMERO_SEMINARIO = 1;
	
	public String darRolRandom() {
		
		int random = (int)(Math.random()*3);
		
		if (random == 0) {return "C: ";}
		if (random == 1) {return "R: ";}
		if (random == 2) {return "P: ";}
		
		return ":(";
	}
	
	public int getNUMERO_SEMINARIO() {
		return NUMERO_SEMINARIO;
	}

	public String[] darTresRoles() {
		
		String[] tRoles = new String[3];
		
		for (int i = 0; i < tRoles.length; i++) {tRoles[i] = "";}	
		
		while (tRoles[0].equals(tRoles[1]) || tRoles[0].equals(tRoles[2]) || tRoles[1].equals(tRoles[2])) {
			
			for (int i = 0; i < tRoles.length; i++) {
				
				tRoles[i] = darRolRandom();
			
			}
		}
		
		return tRoles;
		
	}

	public String[] darListaRoles(int NumEstudiantes) {
		
		String[] listaRoles = new String[NumEstudiantes];
		
		int k = 0;
		
		String[] tresRoles;
		
		for (int i = 0; i < (listaRoles.length/3); i++) {
			
			tresRoles = darTresRoles();
			
			for (int j = 0; j < 3; j++) {
				
				listaRoles[k] = tresRoles[j];
				
				k++;				
			}
		}
				
		if ((listaRoles.length%3) == 1) {
			
			tresRoles = darTresRoles();
			
				int ultimaPosicion = listaRoles.length - 1;
			
					listaRoles[ultimaPosicion] = tresRoles[0];
		}
		
		if ((listaRoles.length%3) == 2) {
			
			tresRoles = darTresRoles();
			
				int antepenultimaPosicion = listaRoles.length - 2;
			
				int ultimaPosicion = listaRoles.length - 1;
			
					listaRoles[antepenultimaPosicion] = tresRoles[1];
			
					listaRoles[ultimaPosicion] = tresRoles[0];			
			
		}		
		
		return listaRoles;		
		
	}

}
