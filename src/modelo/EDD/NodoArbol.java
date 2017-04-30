package modelo.EDD;

import modelo.Palabra;

public class NodoArbol {
	private Palabra dato;
	private NodoArbol hijoIzq, HijoDer;
	
	public NodoArbol(Palabra d) {
		this.dato = d;
		this.hijoIzq = null;
		this.HijoDer = null;
	}
	public Palabra getDato() {
		return dato;
	}
	public NodoArbol getHijoDer() {
		return HijoDer;
	}
	public NodoArbol getHijoIzq() {
		return hijoIzq;
	}
	public void setDato(Palabra dato) {
		this.dato = dato;
	}
	public void setHijoIzq(NodoArbol hijoIzq) {
		this.hijoIzq = hijoIzq;
	}
	public void setHijoDer(NodoArbol hijoDer) {
		HijoDer = hijoDer;
	}
}
