package Model.Negocio;

import Model.Datos.*;

import java.util.Date;

/**
 * Created by Andrew on 13/11/2015.
 */
public class AdmiCita {

    public void citaAdd(Cita cita, Hospital hospital, Medico medico){
        for (int i = 0; i < hospital.getAgenda().size(); i++) {
            Cita c=hospital.getAgenda().get(i);
            if (c.getMedico()==cita.getMedico() && c.getHora()==cita.getHora() && c.getFecha()==cita.getFecha()){
                hospital.getAgenda().set(i,cita);
            }
        }
        for (int i = 0; i <medico.getAgenda().size() ; i++) {
            for (int j = 0; j <medico.getAgenda().get(i).getListaCitas().size() ; j++) {
                Cita c=medico.getAgenda().get(i).getListaCitas().get(j);
                if (c.getMedico()==cita.getMedico() && c.getHora()==cita.getHora() && c.getFecha()==cita.getFecha()){
                    medico.getAgenda().get(i).getListaCitas().set(j,cita);
                }
            }
        }
    }
    public void crear(Date fecha, Date hora, boolean estado, String id, Consultorio consultorio, Paciente paciente, Medico medico){
        Cita cita=new Cita(fecha, hora, estado, id, consultorio, paciente, medico);
        paciente.getListaCitas().add(cita);

    }

    public void actualizar(Cita cita, Paciente paciente){
        for (int i = 0; i < paciente.getListaCitas().size(); i++) {
            if(cita.getId().equals(paciente.getListaCitas().get(i).getId())){
                paciente.getListaCitas().add(i,cita);
                break;
            }
        }
    }

    public void eliminar(String id, Paciente paciente){
        Cita temp = buscar(id, paciente);
        if(!temp.getId().equals(null)){
            for (int i = 0; i < paciente.getListaCitas().size(); i++) {
                if(temp.getId().equals(id)){
                    paciente.getListaCitas().remove(i);
                }
            }
        }
    }

    public Cita buscar(String id, Paciente paciente){
        for(Cita cita: paciente.getListaCitas()){
            if(cita.getId().equals(id)){
                return cita;
            }
        }
        return null;
    }

}
