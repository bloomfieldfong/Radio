
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

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

	Interfaz rad= new Radio();
	int x=0;
	
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
		
		JLabel impresion = new JLabel("");
		impresion.setBounds(357, 27, 139, 29);
		contentPane.add(impresion);
		
		JButton boton1 = new JButton("1");
		
		boton1.setBounds(110, 92, 57, 29);
		contentPane.add(boton1);
	
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=1; 
				float estacion= rad.Seleccionar(x);
				System.out.println(estacion);
				if (estacion!=0){
					impresion.setText(Float.toString(estacion));
				}
			}
		});
		
		JButton boton2 = new JButton("2");
		boton2.setBounds(182, 92, 57, 29);
		contentPane.add(boton2);
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=2; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(254, 92, 57, 29);
		contentPane.add(boton3);
		
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=3; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton4 = new JButton("4");
		boton4.setBounds(326, 92, 57, 29);
		contentPane.add(boton4);
		
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=4; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton5 = new JButton("5");
		boton5.setBounds(398, 92, 57, 29);
		contentPane.add(boton5);
		
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=5; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton6 = new JButton("6");
		boton6.setBounds(470, 92, 57, 29);
		contentPane.add(boton6);
		
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=6; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton7 = new JButton("7");
		boton7.setBounds(110, 150, 57, 29);
		contentPane.add(boton7);
		
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=7; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton8 = new JButton("8");
		boton8.setBounds(182, 150, 57, 29);
		contentPane.add(boton8);
		
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=8; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton9 = new JButton("9");
		boton9.setBounds(254, 150, 57, 29);
		contentPane.add(boton9);
		
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=9; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton10 = new JButton("10");
		boton10.setBounds(326, 150, 57, 29);
		contentPane.add(boton10);
		
		boton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=10; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton11 = new JButton("11");
		boton11.setBounds(398, 150, 57, 29);
		contentPane.add(boton11);
		
		boton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=11; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JButton boton12 = new JButton("12");
		boton12.setBounds(470, 150, 57, 29);
		contentPane.add(boton12);
		
		boton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=12; 
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(238, 372, -80, -76);
		contentPane.add(layeredPane);
		
		JButton botonGrabar = new JButton("Grabar Estacion");
		botonGrabar.setBounds(242, 209, 158, 29);
		contentPane.add(botonGrabar);
		
		botonGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rad.Guardar(x);
			}
		});
		
		
		
		JButton botonAnterior = new JButton("Anterior");
		botonAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rad.Cambiar(false);
				x=0;
				rad.Seleccionar(x);
				impresion.setText(Float.toString(rad.Seleccionar(x)));
				
			}
		});
		
		botonAnterior.setBounds(110, 328, 115, 29);
		contentPane.add(botonAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rad.Cambiar(true);
				x=0;
				impresion.setText(Float.toString(rad.Seleccionar(x)));
			}
		});
		btnSiguiente.setBounds(412, 328, 115, 29);
		contentPane.add(btnSiguiente);
		
		
		JButton botonEncender = new JButton("Encender/Apagar");
		
		botonEncender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rad.Estado();
				
			}
		});
		botonEncender.setBounds(111, 27, 200, 29);
		contentPane.add(botonEncender);
		
		
		
		JButton botonCambio = new JButton("AM/FM");
		botonCambio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rad.Frecuencia();
			}
		});
		botonCambio.setBounds(264, 269, 115, 29);
		contentPane.add(botonCambio);
		
		
	}
}
