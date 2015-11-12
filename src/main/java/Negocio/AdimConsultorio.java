package Negocio;

import Datos.Agenda;
import Datos.Cita;
import Datos.Consultorio;
import Datos.Hospital;

import java.util.ArrayList;

public class AdimConsultorio {
    public void ConsultorioAdd(int id, int telefono, Hospital hospital) {
        Consultorio consultorio = new Consultorio(true, id, telefono, hospital, null);
        hospital.getListaConsultorios().add(consultorio);
    }

    public void ConsultorioRemove(Consultorio consultorio) {
        ArrayList<Agenda> ag=consultorio.getHospital().getAgenda();
        for (int j = 0; j < ag.size(); j++) {
            for (int k = 0; k < ag.get(k).getListaCitas().size(); k++) {
               // if (ag.get(j).getListaCitas().get(k)){}
            }
        }
    }
}
