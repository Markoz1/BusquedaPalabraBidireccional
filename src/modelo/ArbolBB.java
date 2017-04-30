package modelo;

public class ArbolBB{
	private Palabra raiz;
    private ArbolBB izq;
    private ArbolBB der;
    
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
    
}
