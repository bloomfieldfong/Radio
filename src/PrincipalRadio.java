
/**
 * @author Rodrio Juarez 16073 
 * @author Michelle Blooomfield 16803
 *
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import java.awt.Color;

public class PrincipalRadio extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalRadio frame = new PrincipalRadio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalRadio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 488);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1 = new JButton("1");
		boton1.setBounds(110, 92, 57, 29);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setBounds(182, 92, 57, 29);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(254, 92, 57, 29);
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("4");
		boton4.setBounds(326, 92, 57, 29);
		contentPane.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setBounds(398, 92, 57, 29);
		contentPane.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setBounds(470, 92, 57, 29);
		contentPane.add(boton6);
		
		JButton boton7 = new JButton("7");
		boton7.setBounds(110, 150, 57, 29);
		contentPane.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setBounds(182, 150, 57, 29);
		contentPane.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setBounds(254, 150, 57, 29);
		contentPane.add(boton9);
		
		JButton boton10 = new JButton("10");
		boton10.setBounds(326, 150, 57, 29);
		contentPane.add(boton10);
		
		JButton boton11 = new JButton("11");
		boton11.setBounds(398, 150, 57, 29);
		contentPane.add(boton11);
		
		JButton boton12 = new JButton("12");
		boton12.setBounds(470, 150, 57, 29);
		contentPane.add(boton12);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(238, 372, -80, -76);
		contentPane.add(layeredPane);
		
		JRadioButton radioFM = new JRadioButton("FM");
		radioFM.setBounds(343, 267, 57, 29);
		contentPane.add(radioFM);
		
		JRadioButton radioAM = new JRadioButton("AM");
		radioAM.setBounds(238, 267, 57, 29);
		contentPane.add(radioAM);
		
		JButton botonGrabar = new JButton("Grabar Estacion");
		botonGrabar.setBounds(242, 209, 158, 29);
		contentPane.add(botonGrabar);
		
		JButton botonAnterior = new JButton("Anterior");
		botonAnterior.setBounds(110, 328, 115, 29);
		contentPane.add(botonAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(412, 328, 115, 29);
		contentPane.add(btnSiguiente);
		
		JButton botonEncender = new JButton("Encender/Apagar");
		botonEncender.setBounds(220, 28, 200, 29);
		contentPane.add(botonEncender);
	}
}
