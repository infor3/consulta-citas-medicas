package Datos;

import java.util.ArrayList;
import java.util.Date;

public class Agenda {
	private Date inicioAgenda;
	private Date finAgenda;
	private Date fecha;
	private Date inicio;
	private Date fin;
	private ArrayList<Cita> listaCitas=new ArrayList<>();

	public Agenda(Date inicioAgenda, Date finAgenda, Date fecha, Date inicio, Date fin) {
		this.inicioAgenda = inicioAgenda;
		this.finAgenda = finAgenda;
		this.fecha = fecha;
		this.inicio = inicio;
		this.fin = fin;
	}

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

	public ArrayList<Cita> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(ArrayList<Cita> listaCitas) {
		this.listaCitas = listaCitas;
	}
}
