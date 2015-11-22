package Model.Datos;

import java.util.ArrayList;

public class Medico extends Persona {
	
	private ArrayList<String> listaEspecialidades =new ArrayList<>();
	private ArrayList<Agenda> agenda=new ArrayList<>();
	private Hospital hospital;

	public Medico(String nombre, String apellido, String correo, String direccion, String id, String contrasenia, int nivel, int edad, int telefono, int celular, ArrayList<String> especialidades, Hospital hospital) {
		super(nombre, apellido, correo, direccion, id, contrasenia, nivel, edad, telefono, celular);
		this.listaEspecialidades = especialidades;
        this.hospital = hospital;
	}

	public Medico() {}

	public ArrayList<String> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(ArrayList<String> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}

	public ArrayList<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(ArrayList<Agenda> agenda) {
		this.agenda = agenda;
	}

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
