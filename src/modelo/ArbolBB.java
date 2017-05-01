package modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ArbolBB {
	private Palabra raiz;
    private ArbolBB izq;
    private ArbolBB der;
    private ArrayList<Palabra> nodosNivel;
    
    public ArbolBB(){
        raiz = null;
        izq = null;
        der = null;
    }
    public boolean vacio(){
        return raiz == null && izq == null && der == null;
    }
    public void insertar(Palabra x){
    	if(vacio()){
            raiz = x;
            System.out.println("--Nodo--[-"+x.getCadena()+"-]");
            izq = new ArbolBB();
            der = new ArbolBB();
        }
        else{
            if(x.getCadena().compareTo(raiz.getCadena()) < 0){
            	//comparacion de palabras y las ordena alfabeticamente
                //System.out.println("comparando: "+x.getCadena()+" con "+raiz.getCadena()+" = "+x.getCadena().compareTo(raiz.getCadena()));
                System.out.println("ruta: Izquierda ---> ");
            	izq.insertar(x);
            }
            else{
            	//System.out.println("comparando: "+x.getCadena()+" con "+raiz.getCadena()+" = "+x.getCadena().compareTo(raiz.getCadena()));
            	System.out.println("ruta: Derecha ---> ");
            	der.insertar(x);
            }
        }
    }
    
    public ArrayList<Palabra> getNodosNivel(int nivel){
    	nodosNivel = null;
    	
    	if (izq.vacio()  && der.vacio()) {
			
    		nodosNivel.add(raiz);
    		
		} else {
			izq.nodosNivel( nivel - 1 );
			der.nodosNivel( nivel - 1 );
		}
    	return nodosNivel;
    }
    
    public void nodosNivel( int nivel ){
    	
    }
    
    public ArbolBB getIzq(){
    	return izq;
    }
    
    public ArbolBB getDer(){
    	return der;
    }
    
    public void busquedaAmplitud(){
    	Queue<ArbolBB> colaP = new LinkedList();
    	ArbolBB aux;
    	
    	if (!vacio()) {
			
    		System.out.println(raiz.getCadena());
        	
        	if(!izq.vacio())
                colaP.add(izq);
            if (!der.vacio())
                colaP.add(der);
        	
        	while (!colaP.isEmpty()) {
    			aux = colaP.remove();
    			System.out.println(aux.raiz.getCadena());
    		 
    	   		 if (!izq.vacio()) {
    					
    	   			 colaP.add(aux.izq);
    				}
    	   		 
    	   		 if (!der.vacio()) {
    					colaP.add(aux.der);
    				}
    			
    		}
		}
			
		
    }
    
    public void recorridoAmplitud()
    {
        Cola <ArbolBB> q = new Cola <ArbolBB>();
        ArbolBB a1;
        if (!vacio())
        {
            System.out.println(raiz.getCadena());
            
                if(!izq.vacio())
                    q.insert(izq);
                if (!der.vacio())
                    q.insert(der);
            while (!q.empty())
            {
                a1=q.remove();
                System.out.println(a1.raiz.getCadena());
                if(!a1.izq.vacio())
                    q.insert(a1.izq);
                if (!a1.der.vacio())
                    q.insert(a1.der);
            }
        }
    } 
    
    public static void main(String[] args) {
		 ArbolBB prueba = new ArbolBB();
		 String texto = "Enseguida se muestra un programa ejemplo de la utilización";
		 String[] listaPalabras = texto.split("[ \n\t\r,.;:!?(){}]");
			
			for (int i = 0; i < listaPalabras.length; i++) {
				Palabra palabra = new Palabra( listaPalabras[i] );
				prueba.insertar(palabra);
			}
		 
		
		
		prueba.recorridoAmplitud();
	}
    
}
