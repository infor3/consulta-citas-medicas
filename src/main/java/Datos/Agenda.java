package Datos;

import java.util.Date;

public class Agenda {
	private Date inicioAgenda;
	private Date finAgenda;
	private Date fecha;
	private Date inicio;
	private Date fin;
	private boolean disponibilidad;

	public Date getInicioAgenda() {
		return inicioAgenda;
	}

	public void setInicioAgenda(Date inicioAgenda) {
		this.inicioAgenda = inicioAgenda;
	}

	public Date getFinAgenda() {
		return finAgenda;
	}

	public void setFinAgenda(Date finAgenda) {
		this.finAgenda = finAgenda;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
}
