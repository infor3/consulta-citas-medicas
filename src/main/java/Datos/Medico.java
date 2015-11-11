package Datos;

import java.util.ArrayList;

public class Medico extends Persona {
	
	private ArrayList<String> especialidades=new ArrayList<>();
	
	public Medico(String nombre, String apellido, String correo, String direccion, int celular, int telefono,ArrayList<String> especialidades){
		super(nombre,apellido,correo,direccion,telefono,celular);	
		this.setEspecialidades(especialidades);
	}


	public Medico() {}

	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(ArrayList<String> especialidades) {
		this.especialidades = especialidades;
	}


}
