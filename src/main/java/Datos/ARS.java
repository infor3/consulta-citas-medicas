package Datos;

import java.util.ArrayList;

public class ARS {
	private String nombre;
	private ArrayList<EPS> listaEPS=new ArrayList<EPS>();
	
	public ARS(String nombre, ArrayList listaEps){
		this.nombre=nombre;
		this.listaEPS=listaEPS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
