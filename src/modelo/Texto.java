package modelo;

import modelo.EDD.ArbolBB;
import modelo.EDD.Pila;

public class Texto {
	private ArbolBB textoA;//arbol ordenado de nodoInicio a NodoFin
	private ArbolBB textoB;//arbol ordenado de nodoFin a nodoInicio 
	private String cadenaTexto;
	public Texto() {
		this.textoA = new ArbolBB();
		this.textoB = new ArbolBB();
		this.cadenaTexto = null;
	}
	
	public void generarArboles(){
		Pila<Palabra> pila = new Pila<Palabra>();
		String t = this.cadenaTexto;
		String[] listaPalabras = t.split("[ \n\t\r,.;:!?(){}]");
		System.out.println("******** Ini Arbol A *********");
		for (int i = 0; i < listaPalabras.length; i++) {
			Palabra palabra = new Palabra( listaPalabras[i] );
			pila.push(palabra);
			this.textoA.insertar(palabra);
		}
		System.out.println("******** Fin Arbol A *********");
		System.out.println("******** Ini Arbol B *********");
		for (int i = 0; i < listaPalabras.length; i++) {
			this.textoB.insertar(pila.pop());
		}
		System.out.println("******** Fin Arbol B *********");
	}
	public ArbolBB getTextoA() {
		return textoA;
	}
	public ArbolBB getTextoB() {
		return textoB;
	}
	public void setCadenaTexto(String cadenaTexto) {
		this.cadenaTexto = cadenaTexto;
	}	
}
