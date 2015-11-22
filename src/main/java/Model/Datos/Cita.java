package Model.Datos;

import java.util.Date;

public class Cita {
	private Date fecha;
	private Date hora;
	private boolean estado;
	private String id;
	private Consultorio consultorio;
	private Paciente paciente;
	private Medico medico;

	public Cita(Date fecha, Date hora, boolean estado, String id, Consultorio consultorio, Paciente paciente, Medico medico) {
		this.fecha = fecha;
		this.hora = hora;
		this.estado = estado;
		this.id = id;
		this.consultorio = consultorio;
		this.paciente = paciente;
		this.medico = medico;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
}
