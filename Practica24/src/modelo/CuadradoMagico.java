package modelo;

public class CuadradoMagico {
	
	public static int[][] generaCuadrado(int dim) throws Excepcion {
		
		if(dim % 2 == 0) throw new Excepcion("ERROR. Un cuadrado mágico no puede crearse con dimensiones pares");
		
		return new int[dim][dim];
	}
	
	public static void muestraCuadrado(int [][] matriz) {
		
		int longuitud = matriz.length;
		
		for (int i = 0; i < longuitud; i++) {
			
			for (int j = 0; j < longuitud; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		System.out.println();
	}
}
