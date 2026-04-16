package vista;

import java.awt.*;

import javax.swing.*;

import controlador.Controlador;

public class Vista extends JPanel{

	private static final long serialVersionUID = -5752211613049689258L;
	
	private VistaComienzo vComienzo;
	private VistaCuadrado vCuadrado;
	
	private int dimension;
	
	public Vista() {
		
		this.setLayout(new CardLayout());
		
		
		vComienzo = new VistaComienzo();
		dimension = Integer.parseInt(vComienzo.getCbDimensiones().getSelectedItem().toString());
		vCuadrado = new VistaCuadrado(dimension);
		
		this.add(vComienzo, 0);
		this.add(vCuadrado, 1);
	}
	
	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public void control(Controlador c) {
		
		//this.vComienzo.getCbDimensiones().addActionListener(c);
		this.vComienzo.getbComenzar().addActionListener(c);
		this.vComienzo.getbSalir().addActionListener(c);
		
		this.vCuadrado.getbValidar().addActionListener(c);
		this.vCuadrado.getbGenerar().addActionListener(c);
		this.vCuadrado.getbLimpiar().addActionListener(c);
	}

	public VistaComienzo getvComienzo() {
		return vComienzo;
	}

	public VistaCuadrado getvCuadrado() {
		return vCuadrado;
	}
	
}
