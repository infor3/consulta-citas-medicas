package Datos;

import java.util.ArrayList;

public class Medico extends Persona {
	
	private ArrayList<String> especialidades=new ArrayList<>();

	public Medico(String nombre, String apellido, String correo, String direccion, String id, String contrasenia, int nivel, int edad, int telefono, int celular, ArrayList<String> especialidades) {
		super(nombre, apellido, correo, direccion, id, contrasenia, nivel, edad, telefono, celular);
		this.especialidades = especialidades;
	}

	public Medico() {}

	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(ArrayList<String> especialidades) {
		this.especialidades = especialidades;
	}


}
