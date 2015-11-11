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

	public Hospital(String nombre, int telefono, ArrayList medicos, ArrayList pacientes, ArrayList consultorios, ArrayList citas, Agenda agenda){
		this.setNombre(nombre);
		this.setTelefono(telefono);
		this.setListaMedicos(medicos);
		this.setListaPacientes(pacientes);
		this.setConsultorios(consultorios);
		this.setCitas(citas);
		this.agenda=agenda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public ArrayList<String> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(ArrayList<String> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}

	public ArrayList<Consultorio> getConsultorios() {
		return consultorios;
	}

	public void setConsultorios(ArrayList<Consultorio> consultorios) {
		this.consultorios = consultorios;
	}

	public ArrayList<Medico> getListaMedicos() {
		return listaMedicos;
	}

	public void setListaMedicos(ArrayList<Medico> listaMedicos) {
		this.listaMedicos = listaMedicos;
	}

	public ArrayList<Cita> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}

	public ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}

	public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
}
