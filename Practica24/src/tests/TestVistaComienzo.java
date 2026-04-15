package tests;

import javax.swing.JFrame;

import vista.VistaComienzo;

public class TestVistaComienzo {

	public static void main(String[] args) {
		
		VistaComienzo v= new VistaComienzo();
		
		JFrame f = new JFrame();
		f.setContentPane(v);
		
		f.pack();
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
