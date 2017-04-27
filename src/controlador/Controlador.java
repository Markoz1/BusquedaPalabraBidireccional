package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.Ventana;
import modelo.Modelo;

public class Controlador implements ActionListener{
	private Modelo modelo;
	private Ventana ventana;
	
	public Controlador(String t) {
		super();
		this.modelo = new Modelo(t);
		this.ventana = new Ventana();
		setListeners();
	}
	public void setListeners(){
		this.ventana.getBtnBuscar().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String mensaje = "boton presionado";
		this.ventana.getTxtrTexto().setText(mensaje);
		System.out.println("boton presionado");
	}
	
}
