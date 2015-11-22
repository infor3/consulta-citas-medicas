package Model.Datos;

import java.util.ArrayList;

public class ARS {
	private String nombre;
	private ArrayList<EPS> listaEPS = new ArrayList<>();

	public ARS() {
	}

	public ARS(String nombre, ArrayList<EPS> listaEPS) {
		this.nombre = nombre;
		this.listaEPS = listaEPS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<EPS> getListaEPS() {
		return listaEPS;
	}

	public void setListaEPS(ArrayList<EPS> listaEPS) {
		this.listaEPS = listaEPS;
	}
}
