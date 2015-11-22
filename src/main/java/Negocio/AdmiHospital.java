package Negocio;

import java.util.ArrayList;
import java.util.HashSet;
import Datos.Hospital;
import Datos.Medico;


public class AdmiHospital {

	public void modificarEspeRemove(Hospital hospital, Medico medico) {
		ArrayList<Medico> medic=hospital.getListaMedicos();
		ArrayList<String> especialidades=new ArrayList<>();
		for (Medico aMedic : medic) {
			if (!(aMedic.equals(medico))) {
				for (int j = 0; j < aMedic.getListaEspecialidades().size(); j++) {
					especialidades.add(aMedic.getListaEspecialidades().get(j));
				}
			}
		}
		HashSet<String> hashSet=new HashSet<>(especialidades);
		especialidades.clear();
		especialidades.addAll(hashSet);
		hospital.setListaEspecialidades(especialidades);
	}
	public void modificarEspeAdd(Hospital hospital,ArrayList<String> nueva) {
		ArrayList<String> compara=hospital.getListaEspecialidades();
		for (int j = 0; j < nueva.size(); j++)
			for (String aCompara : compara) {
				if (nueva.get(j).equals(aCompara)) {
					nueva.remove(j);
				}
			}
		if (nueva.size()>0) {
			for (String aNueva : nueva) {
				compara.add(aNueva);
			}
			hospital.setListaEspecialidades(compara);
		}
	}


}
