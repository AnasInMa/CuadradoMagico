package modelo;

public class CuadradoMagico {
	
	public static int[][] generaCuadrado(int dim) { // throws Excepcion 
		
		//if(dim % 2 == 0) throw new Excepcion("ERROR. Un cuadrado mágico no puede crearse con dimensiones pares");
		
		int[][] cuadrado = new int[dim][dim];
		
		int fila = 0, columna = dim/2, cont = 1;
		
		while(cont <= (Math.pow(dim, 2))) {
			
			if(cuadrado[fila][columna] == 0) {
				
				cuadrado[fila][columna] = cont;
				
				fila --;
				columna ++;
				
				cont++;
				
			} else {
				
				fila +=2;
				columna -= 1;
			}
			
			if(fila < 0) fila = dim - 1;
			if(fila >= dim) fila = 0;
			
			if(columna < 0) columna = dim - 1;
			if(columna >= dim) columna = 0;
		}
		
		return cuadrado;
	}
	
	public static void muestraCuadrado(int [][] matriz) {
		
		int longuitud = matriz.length;
		
		for (int i = 0; i < longuitud; i++) {
			
			for (int j = 0; j < longuitud; j++) {
				
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
		System.out.println();
	}
}
