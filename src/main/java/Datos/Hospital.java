package Datos;

import java.util.ArrayList;

public class Hospital {
	private String nombre;
	private int telefono;
    private EPS eps;
	private ArrayList<String> listaEspecialidades=new ArrayList<>();
	private ArrayList<Consultorio> listaConsultorios =new ArrayList<>();
	private ArrayList<Medico> listaMedicos=new ArrayList<>();
	private ArrayList<Cita> listaCitas= new ArrayList<>();
	private ArrayList<Cita> agenda= new ArrayList<>();

	public Hospital(){}

	public Hospital(String nombre, int telefono, EPS eps) {
		this.nombre = nombre;
		this.telefono = telefono;
        this.eps = eps;
	}

    public EPS getEps() {
        return eps;
    }

    public void setEps(EPS eps) {
        this.eps = eps;
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

	public ArrayList<Consultorio> getListaConsultorios() {
		return listaConsultorios;
	}

	public void setListaConsultorios(ArrayList<Consultorio> listaConsultorios) {
		this.listaConsultorios = listaConsultorios;
	}

	public ArrayList<Medico> getListaMedicos() {
		return listaMedicos;
	}

	public void setListaMedicos(ArrayList<Medico> listaMedicos) {
		this.listaMedicos = listaMedicos;
	}

	public ArrayList<Cita> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(ArrayList<Cita> listaCitas) {
		this.listaCitas = listaCitas;
	}

	public ArrayList<Cita> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Cita> agenda) {
        this.agenda = agenda;
    }


}
