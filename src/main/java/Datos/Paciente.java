package Datos;

import java.util.ArrayList;

public class Paciente extends Persona{
	private boolean afiliado;
	private EPS eps;
	private ArrayList <Cita> listaCitas=new ArrayList<>();

	public Paciente(String nombre, String apellido, String correo, String direccion, String id, String contrasenia, int nivel, int edad, int telefono, int celular, boolean afiliado, EPS eps) {
		super(nombre, apellido, correo, direccion, id, contrasenia, nivel, edad, telefono, celular);
		this.afiliado = afiliado;
		this.eps = eps;
	}

	public boolean isAfiliado() {
		return afiliado;
	}

	public void setAfiliado(boolean afiliado) {
		this.afiliado = afiliado;
	}

	public ArrayList<Cita> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(ArrayList<Cita> listaCitas) {
		this.listaCitas = listaCitas;
	}

	public EPS getEps() {
		return eps;
	}

	public void setEps(EPS eps) {
		this.eps = eps;
	}
}
