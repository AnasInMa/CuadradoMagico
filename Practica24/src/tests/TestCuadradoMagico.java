package tests;

import modelo.CuadradoMagico;
import modelo.Excepcion;

public class TestCuadradoMagico {

	public static void main(String[] args) {
		
		try {
			
			CuadradoMagico.muestraCuadrado(CuadradoMagico.generaCuadrado(3));
			CuadradoMagico.muestraCuadrado(CuadradoMagico.generaCuadrado(7));
			CuadradoMagico.muestraCuadrado(CuadradoMagico.generaCuadrado(11));
			CuadradoMagico.muestraCuadrado(CuadradoMagico.generaCuadrado(2));
			
		} catch (Excepcion e) {
			
			System.err.print(e.getMessage());
		}

	}
}
