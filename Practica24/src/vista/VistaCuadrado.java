package vista;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VistaCuadrado extends JPanel{

	private static final long serialVersionUID = 7603590797226950875L;

	private JLabel cuadradoMagico;
	
	private JButton bValidar, bGenerar, bLimpiar;
	
	private int dimension;
	
	public VistaCuadrado(int dim) {
		
		dimension = dim;
		
		this.setLayout(new BorderLayout());
		
		this.add(panelNorte(), BorderLayout.NORTH);
		this.add(panelCentro(), BorderLayout.CENTER);
		this.add(panelSur(), BorderLayout.SOUTH);
	}
	
	private JPanel panelNorte() {
		
		JPanel panel = new JPanel();
		
		cuadradoMagico = new JLabel("Cuadrado mágico de ");
		
		panel.add(cuadradoMagico);
		
		return panel;
	}
	
	public JPanel panelCentro() {
		
		JPanel panel = new JPanel(new GridLayout(dimension, dimension));
		
		generaTF(panel, null);
		
		return panel;
	}
	
	public void generaTF(JPanel panel, int[][] matriz) {
		
		if(matriz == null) {
			
			//int[][] matriz = modelo.CuadradoMagico.generaCuadrado(dimension);
			
			JTextField[][] tfMatriz = new JTextField[dimension][dimension];
			
			for(int i = 0; i < dimension; i++) {
				
				for (int j = 0; j < dimension; j++) {
					
					//matriz[i][j] = j;
					panel.add(tfMatriz[i][j] = new JTextField());
				}
			}
			
		} else {
			
			
			JTextField[][] tfMatriz = new JTextField[dimension][dimension];
			
			for(int i = 0; i < dimension; i++) {
				
				for (int j = 0; j < dimension; j++) {
					
					//matriz[i][j] = j;
					panel.add(tfMatriz[i][j] = new JTextField(matriz[i][j]));
					
				}
				
			}
		}
	}
	
	private JPanel panelSur() {
		
		JPanel panel = new JPanel(new GridLayout(1,3));
		
		panel.setBorder(new EmptyBorder(5,5,5,5));
		
		bValidar = new JButton("Validar");
		bGenerar = new JButton("Generar");
		bLimpiar = new JButton("Limpiar");
		
		panel.add(bValidar);
		panel.add(bGenerar);
		panel.add(bLimpiar);
		
		return panel;
	}

	public JButton getbValidar() {
		return bValidar;
	}

	public JButton getbGenerar() {
		return bGenerar;
	}

	public JButton getbLimpiar() {
		return bLimpiar;
	}

	public JLabel getCuadradoMagico() {
		return cuadradoMagico;
	}
}
