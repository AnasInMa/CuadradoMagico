package controlador;

import java.awt.CardLayout;
import java.awt.event.*;

import modelo.CuadradoMagico;
import vista.Vista;

public class Controlador implements ActionListener{

	private Vista v;
	
	public Controlador(Vista v) {
		
		this.v = v;
		
		v.control(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == v.getvComienzo().getbComenzar()) {
 
			v.setDimension(Integer.parseInt(v.getvComienzo().getCbDimensiones().getSelectedItem().toString()));
			
			v.getvCuadrado().getCuadradoMagico().setText(v.getvCuadrado().getCuadradoMagico().getText()
													+ v.getvComienzo().getCbDimensiones().getSelectedItem());
			
			CardLayout cartas = (CardLayout) v.getLayout();
			cartas.next(v);

		} else if(e.getSource() == v.getvComienzo().getbSalir()){

			System.exit(0);

		} else if(e.getSource() == v.getvCuadrado().getbValidar()) {

			System.out.println("validar");

		} else if(e.getSource() == v.getvCuadrado().getbGenerar()) {

			generar();

		} else {

			System.out.println("limpiar");
			
		}
		
	}
	
	private void generar() {
		
		v.getvCuadrado().panelCentro().removeAll();
		
		v.getvCuadrado().generaTF(v.getvCuadrado().panelCentro(),
				CuadradoMagico.generaCuadrado(
						Integer.parseInt(v.getvComienzo().getCbDimensiones().getSelectedItem().toString())));

		v.getvCuadrado().panelCentro().revalidate();
		//v.getvCuadrado().panelCentro().repaint();
	}

}
