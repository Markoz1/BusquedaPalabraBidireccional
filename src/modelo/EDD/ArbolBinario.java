package modelo.EDD;

import modelo.Palabra;

public class ArbolBinario {
	private NodoArbol raiz;
	
	public ArbolBinario() {
		this.raiz = null;
	}
	public boolean esVacio(){
		return (this.raiz==null);
	}
	public void insertarNodo(Palabra p){
		boolean inserto = false;
		NodoArbol nodoNuevo = new NodoArbol(p);
		if(esVacio()){
			this.raiz = nodoNuevo;
		}
		else{
			NodoArbol aux = this.raiz;
			NodoArbol padre;
			while(!inserto){
				padre = aux;
				if(padre.getHijoIzq() == null){
					padre.setHijoIzq(nodoNuevo);
					inserto = true;
				}
				else{
					aux = aux.getHijoIzq();
					if(padre.getHijoDer() == null){
						padre.setHijoDer(nodoNuevo);
						inserto = true;
					}
					else{
						aux = aux.getHijoDer();
					}
				}			
			}
		}
	}
}
