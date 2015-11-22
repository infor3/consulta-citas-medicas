package Model.Datos;

import java.util.ArrayList;
import java.util.Date;

public class Agenda {
	private Date inicioAgenda;
	private Date finAgenda;
	private ArrayList<Cita> listaCitas=new ArrayList<>();

	public Agenda(Date inicioAgenda, Date finAgenda) {
		this.inicioAgenda = inicioAgenda;
		this.finAgenda = finAgenda;
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

	public ArrayList<Cita> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(ArrayList<Cita> listaCitas) {
		this.listaCitas = listaCitas;
	}
}
