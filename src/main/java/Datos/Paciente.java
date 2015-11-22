package Datos;

import java.util.ArrayList;

public class Paciente extends Persona{
	private boolean afiliado;
	private Hospital hospital;
	private ArrayList <Cita> listaCitas=new ArrayList<>();

	public Paciente(String nombre, String apellido, String correo, String direccion, String id, String contrasenia, int nivel, int edad, int telefono, int celular, boolean afiliado, Hospital hospital) {
		super(nombre, apellido, correo, direccion, id, contrasenia, nivel, edad, telefono, celular);
		this.afiliado = afiliado;
		this.hospital = hospital;
	}

	public Paciente(){

	}

	public void agregarpaciente(){


	}

	public boolean isAfiliado() {
		return afiliado;
	}

	public void setAfiliado(boolean afiliado) {
		this.afiliado = afiliado;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public ArrayList<Cita> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(ArrayList<Cita> listaCitas) {
		this.listaCitas = listaCitas;
	}
}
