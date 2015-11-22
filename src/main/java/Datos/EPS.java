package Datos;

import java.util.ArrayList;

public class EPS {
	private String nombre;
	private ArrayList<Hospital> listaHospitales=new ArrayList<>();

    private ArrayList<Paciente> listaPaciente = new ArrayList<>();

	public EPS() {
	}

	public EPS(String nombre, ArrayList<Hospital> listaHospitales) {
		this.nombre = nombre;
		this.listaHospitales = listaHospitales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Hospital> getListaHospitales() {
		return listaHospitales;
	}

	public void setListaHospitales(ArrayList<Hospital> listaHospitales) {
		this.listaHospitales = listaHospitales;
	}

    public ArrayList<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public void setListaPaciente(ArrayList<Paciente> listaPaciente) {
        this.listaPaciente = listaPaciente;
    }
}
