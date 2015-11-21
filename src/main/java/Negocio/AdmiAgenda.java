package Negocio;

import Datos.Cita;
import Datos.Hospital;
import Datos.Medico;

import java.util.ArrayList;

/**
 * Created by Andrew on 12/11/2015.
 */
public class AdmiAgenda {

    public void listadoCitas(Hospital hospital){
        ArrayList<Cita> totalCitas=new ArrayList<>();
        ArrayList<Medico> listaMedicos=new ArrayList<>();
        for (Medico listaMedico : listaMedicos) {
            for (int j = 0; j < listaMedico.getAgenda().size(); j++) {
                for (int k = 0; k < listaMedico.getAgenda().get(j).getListaCitas().size(); k++) {
                    if (listaMedico.getAgenda().get(j).getListaCitas().get(k).isEstado()) {
                        totalCitas.add(listaMedico.getAgenda().get(j).getListaCitas().get(k));
                    }
                }
            }
        }
        hospital.setAgenda(totalCitas);
    }

}
