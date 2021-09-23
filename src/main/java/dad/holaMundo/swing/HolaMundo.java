package dad.holaMundo.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundo {

	public static void main(String[] args) {
		
		JLabel saludoLabel = new JLabel();
		saludoLabel.setText("Aqui saldra el saludo");
		saludoLabel.setBounds(20, 20, 120, 50);
		
		//Creamos botón
		JButton saludarButton = new JButton();
		saludarButton.setText("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.setToolTipText("Si me pulsas te saludo");
		saludarButton.addActionListener(e -> saludoLabel.setText("¡¡¡Hola Mundo!!!")); 
		
		//Panel para etiqueta y botón
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		//ventana
		JFrame frame = new JFrame();
		frame.setTitle("Hola mundo con Swing");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(rootPanel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
