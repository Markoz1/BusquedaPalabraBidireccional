package modelo;

public class Texto {
	private ArbolBB texto;
	public Texto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Texto(String t){
		
		texto = new ArbolBB();
		String[] listaPalabras = t.split("[ \n\t\r,.;:!?(){}]");
		
		for (int i = 0; i < listaPalabras.length; i++) {
			//System.out.println(listaPalabras[i]);
			Palabra palabra = new Palabra( listaPalabras[i] );
			texto.insertar(palabra);
		}
	}
	public ArbolBB getTexto() {
		return texto;
	}
	
	
}
