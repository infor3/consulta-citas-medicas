package Negocio;

import Datos.*;

import java.util.ArrayList;
import java.util.HashSet;

public class AdimConsultorio {
    public void ConsultorioAdd(int id, int telefono, Hospital hospital) {
        Consultorio consultorio = new Consultorio(true, id, telefono, hospital, null);
        hospital.getListaConsultorios().add(consultorio);
    }

    public void ConsultorioRemove(Consultorio consultorio) {
        ArrayList<Cita> ag=consultorio.getHospital().getAgenda();
        ArrayList<Medico> med=new ArrayList<>();
        ArrayList<Paciente> pad=new ArrayList<>();
        for (int j = 0; j < ag.size(); j++) {
            if (ag.get(j).getConsultorio().equals(consultorio)){
                med.add(ag.get(j).getMedico());
                pad.add(ag.get(j).getPaciente());
                ag.remove(j);
            }
        }
        HashSet<Medico> hashSet=new HashSet<>(med);
        med.clear();
        med.addAll(hashSet);
        HashSet<Paciente> hashSet2=new HashSet<>(pad);
        pad.clear();
        pad.addAll(hashSet2);

        
    }
}
