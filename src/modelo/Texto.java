package modelo;

public class Texto {
	private ArbolBB texto;
	private String cadenaTexto;
	public Texto() {
		this.texto = null;
		this.cadenaTexto = null;
	}
	
	public void generarArbolTexto(){
		String t = this.cadenaTexto;
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
	public void setCadenaTexto(String cadenaTexto) {
		this.cadenaTexto = cadenaTexto;
	}	
}
