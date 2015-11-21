package Negocio;

import Datos.Cita;
import Datos.Hospital;
import Datos.Medico;

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
    public void citaRemove(Cita cita,Hospital hospital,Medico medico){
        //for (int i = 0; i < ; i++) {
        //}
    }

}
