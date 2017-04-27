package modelo;
import java.

public class Palabra {
	private String cadena;

	public Palabra(String c) {
		super();
		this.cadena = c;
	}
	public boolean comparar(Palabra p){
		boolean res = false;
		if(cadena.equalsIgnoreCase(p.getCadena())){
			res= true;
		}
		//comparar dos palabras
		return res;
	}
	public String getCadena() {
		return cadena;
	}
}
