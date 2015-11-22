package Datos;

public class Consultorio {
	private boolean estado;
	private String id;
	private int telefono;
	private Hospital hospital;
	private Medico medico;
	
	public Consultorio(boolean estado, String id, int telefono, Hospital hospital, Medico medico){
		this.estado=estado;
		this.id=id;
		this.telefono=telefono;
		this.hospital=hospital;
		this.medico=medico;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
	

}
