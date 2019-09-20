package modelo;

public class Juego {
	
	private int[] numerosPorAdivinar;
	
	public Juego() {

		numerosPorAdivinar = new int[4];
		numerosPorAdivinar[0]=3;
		numerosPorAdivinar[1]=2;
		numerosPorAdivinar[2]=7;
		numerosPorAdivinar[3]=8;
		
	}
	

	public int darNumFijas(int[] numerosParaProbar) {
		
		int contadorFijas = 0;
		
		for (int i = 0; i < numerosPorAdivinar.length; i++) {
			if (numerosPorAdivinar[i]==numerosParaProbar[i]) {
				contadorFijas++;
			}
		}
		return contadorFijas;		
	}
	
	public int darNumPicas(int[] numerosParaProbar) {
		
		int contadorPicas = 0;		
		
		for (int i = 0; i < numerosPorAdivinar.length; i++) {			
			for (int j = 0; j < numerosParaProbar.length; j++) {				
				if (i!=j) {					
					if (numerosPorAdivinar[i]==numerosParaProbar[j]) {						
						contadorPicas++;						
					}					
				}				
			}			
		}
		
		return contadorPicas;		

	}
	

}
