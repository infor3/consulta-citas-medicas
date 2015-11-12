package Datos;

import java.util.ArrayList;

public class Medico extends Persona {
	
	private ArrayList<String> listaEspecialidades =new ArrayList<>();

	public Medico(String nombre, String apellido, String correo, String direccion, String id, String contrasenia, int nivel, int edad, int telefono, int celular, ArrayList<String> listaEspecialidades) {
		super(nombre, apellido, correo, direccion, id, contrasenia, nivel, edad, telefono, celular);
		this.listaEspecialidades = listaEspecialidades;
	}

	public Medico() {}

	public ArrayList<String> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(ArrayList<String> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}


}
