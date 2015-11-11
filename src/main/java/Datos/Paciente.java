package Datos;

import java.util.ArrayList;

public class Paciente extends Persona{
	private int id;
	private boolean afiliado;
	private Hospital hospital;
	private ArrayList <Cita> citas=new ArrayList<Cita>();
	
	public Paciente(String nombre, String apellido, String correo, String direccion, int telefono, int id, int celular, boolean afiliado, ArrayList citas){
		super(nombre,apellido,correo,direccion,telefono,celular);		
		this.id=id;
		this.afiliado=afiliado;
		this.citas=citas;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
