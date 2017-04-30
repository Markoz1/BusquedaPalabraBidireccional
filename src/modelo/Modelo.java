package modelo;

public class Modelo {
	private Texto texto;

	public Modelo(String t) {
		super();
		this.texto = new Texto(t);
	}
	public boolean busquedaBidireccional(){
		boolean res = false;
		return res;
	}
	public Texto getTexto() {
		return texto;
	}
}
