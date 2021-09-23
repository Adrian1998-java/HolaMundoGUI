package dad.holaMundo.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class HolaMundo {

	public static void main(String[] args) {
		
		//Creamos la etiqueta para mostrar el saludo
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquí saldra el saludo");
		saludoLabel.setBounds(20, 20, 120, 50); //x, y, ancho alto
		
		// creamos un botón para saludar
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30); //x, y, ancho alto
		//Establecemos un listenes para la pulsación del botón
		saludarButton.addActionListener(e -> saludoLabel.setText("¡¡¡Hola Mundo!!!")); //Mostramos el saludo en la etiqueta
		//panel (contenedor) que contiene etiqueta y botón
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		//ventana
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		frame.setVisible(true);
		
	}

}
