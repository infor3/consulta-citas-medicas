package Datos;

import java.util.Date;

public class Cita {
	private Date fecha;
	private Date hora;
	private boolean estado;
	private int id;
	private Paciente paciente;
	
	public Cita(Date fecha, Date hora, boolean estado, int id, Paciente paciente){
		this.fecha=fecha;
		this.hora=hora;
		this.estado=estado;
		this.id=id;
		this.paciente=paciente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
