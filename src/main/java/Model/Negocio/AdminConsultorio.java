package Model.Negocio;

import Model.Datos.*;

import java.util.ArrayList;
import java.util.HashSet;

public class AdminConsultorio {
    public void ConsultorioAdd(String id, int telefono, Hospital hospital) {
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

    public void crear(boolean estado, String id, int telefono, Hospital hospital, Medico medico){
        Consultorio c=new Consultorio(estado, id, telefono, hospital, medico);
        hospital.getListaConsultorios().add(c);

    }

    public void actualizar(Cita cita, Paciente paciente){
        for (int i = 0; i < paciente.getListaCitas().size(); i++) {
            if(cita.getId().equals(paciente.getListaCitas().get(i).getId())){
                paciente.getListaCitas().add(i,cita);
                break;
            }
        }
    }

    public void eliminar(String id,Hospital hospital){
        Consultorio temp = buscar(id, hospital);
        if(!temp.getId().equals(null)){
            for (int i = 0; i < hospital.getListaConsultorios().size(); i++) {
                if(temp.getId().equals(id)){
                   hospital.getListaConsultorios().remove(i);
                }
            }
        }
    }

    public Consultorio buscar(String id, Hospital hospital){
        for(Consultorio c:hospital.getListaConsultorios()){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
