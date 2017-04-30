package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtPalabra;
	private JButton btnBuscar;
	private JTextArea txtrTexto;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Ventana frame = new Ventana();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Busqueda de Palabra");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 774, 49);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 71, 774, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPalabra = new JLabel("Palabra:");
		lblPalabra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPalabra.setBounds(10, 11, 60, 14);
		panel.add(lblPalabra);
		
		txtPalabra = new JTextField();
		txtPalabra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPalabra.setBounds(74, 8, 86, 20);
		panel.add(txtPalabra);
		txtPalabra.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(184, 8, 89, 23);
		panel.add(btnBuscar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(675, 8, 89, 23);
		panel.add(btnLimpiar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 188, 774, 329);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEscribaUnTexto = new JLabel("Escriba un texto para buscar:");
		lblEscribaUnTexto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEscribaUnTexto.setBounds(10, 11, 381, 14);
		panel_1.add(lblEscribaUnTexto);
		
		txtrTexto = new JTextArea();
		txtrTexto.setBounds(10, 48, 754, 235);
		panel_1.add(txtrTexto);
		this.setVisible(true);
	}

	public JTextField getTxtPalabra() {
		return txtPalabra;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JTextArea getTxtrTexto() {
		return txtrTexto;
	}

	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}
	
}
