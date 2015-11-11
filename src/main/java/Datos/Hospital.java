package Datos;

import java.util.ArrayList;

public class Hospital {
	private String nombre;
	private int telefono;

	private ArrayList<String> listaEspecialidades=new ArrayList<>();
	private ArrayList<Consultorio> consultorios=new ArrayList<>();
	private ArrayList<Medico> listaMedicos=new ArrayList<>();
	private ArrayList<Cita> citas= new ArrayList<>();
	private ArrayList<Paciente> listaPacientes= new ArrayList<>();
	private Agenda agenda;

	public Hospital(){}
	public Hospital(String nombre, int telefono, ArrayList medicos, ArrayList pacientes, ArrayList hospitales, ArrayList citas, Agenda agenda){
		this.nombre=nombre;
		this.telefono=telefono;
		this.listaMedicos=medicos;
		this.listaPacientes=pacientes;
		this.consultorios=consultorios;
		this.citas=citas;
		this.agenda=agenda;
	}



	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(ArrayList<String> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}
	public ArrayList<Medico> getListaMedicos() {
		return listaMedicos;
	}
	public void setListaMedicos(ArrayList<Medico> listaMedicos) {
		this.listaMedicos = listaMedicos;
	}
	public ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}
	public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
}
