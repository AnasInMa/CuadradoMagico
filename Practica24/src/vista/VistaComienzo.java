package vista;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VistaComienzo extends JPanel{

	private static final long serialVersionUID = -898661526072440772L;
	
	private JButton bComenzar, bSalir;
	
	private JComboBox<Byte> cbDimensiones;
	
	public VistaComienzo() {
		
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(0,20,0,20));
		
		this.iniciaComponentes();
		
		this.add(panelNorte(), BorderLayout.NORTH);
		this.add(panelCentro(), BorderLayout.CENTER);
		this.add(panelSur(), BorderLayout.SOUTH);
	}
	
	private JPanel panelNorte() {
		
		JPanel panel = new JPanel(new GridLayout(3,1));
		panel.setBorder(new EmptyBorder(0,0,10,0));
		
		panel.add(new JLabel("A continuación debe seleccionar la dimension que"));
		panel.add(new JLabel("tendrá el cuadrado mágico, dicha dimension deberá"));
		panel.add(new JLabel("ser un número entero positivo e impar"));
		
		return panel;
	}
	
	private JPanel panelCentro() {
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0,0,10,0));
		
		panel.add(new JLabel("Seleccione la dimension del cuadrado: "));
		panel.add(cbDimensiones);
		
		return panel;
	}
	
	private JPanel panelSur() {
		
		JPanel panel = new JPanel();
		
		panel.add(bComenzar);
		panel.add(bSalir);
		
		return panel;
	}
	
	private void iniciaComponentes() {
		
		this.bComenzar = new JButton("Comenzar");
		this.bSalir = new JButton("Salir");
		
		this.cbDimensiones = new JComboBox<>();
		
		byte[] array = {3,5,7,9,11,15};
		for(byte num : array) {
			
			cbDimensiones.addItem(num);
		}
	}
	
}
