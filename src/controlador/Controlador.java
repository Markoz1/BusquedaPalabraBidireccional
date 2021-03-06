package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.Ventana;
import modelo.Modelo;

public class Controlador implements ActionListener{
	private Modelo modelo;
	private Ventana ventana;
	
	public Controlador() {
		super();
		this.modelo = new Modelo();
		this.ventana = new Ventana();
		setListeners();
	}
	public void setListeners(){
		this.ventana.getBtnBuscar().addActionListener(this);
		this.ventana.getBtnLimpiar().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		Object boton = event.getSource();		
		if(boton == this.ventana.getBtnBuscar()){
			//codigo q se ejecutara cuando se presione el boton buscar
			insertarTextoModelo();
			busquedaBidireccional();
		}
		else{
			if(boton == this.ventana.getBtnLimpiar()){
				/*this.ventana.getTxtrTexto().setText("boton limpiar presionado");*/
				this.ventana.getTxtrTexto().setText(null);
				this.ventana.getTxtPalabra().setText(null);
			}
		}
	}
	private void insertarTextoModelo() {
		String text = this.ventana.getTxtrTexto().getText();
		this.modelo.getTexto().setCadenaTexto(text);
		System.out.println("--Contruyendo Arboles--");
		this.modelo.getTexto().generarArboles();
		System.out.println("--Recorriendo Arbol A por Amplitud--");
		this.modelo.getTexto().getTextoA().recorridoAmplitud();
		System.out.println("--Recorriendo Arbol B por profundidad--");
		this.modelo.getTexto().getTextoB().recorridoProfundidad();
		
	}
	public boolean busquedaBidireccional(){
		boolean res = false;
		String palabra = this.ventana.getTxtPalabra().getText();//recuperando la palabra de la vista
		String texto = this.ventana.getTxtrTexto().getText();//recuperando el texto de la vista
		System.out.println("se busaca la palabra "+palabra+"  en el texto "+texto);
		return res;
	}	
}
