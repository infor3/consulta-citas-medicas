package Negocio;

import java.util.ArrayList;
import java.util.HashSet;

import Datos.Hospital;
import Datos.Medico;


public class AdmiHospital {

	public void modificarEspeRemove(Hospital hospital, Medico medico) {
		ArrayList<Medico> medic=hospital.getListaMedicos();
		ArrayList<String> especialidades=new ArrayList<>();
		for (int i = 0; i < medic.size(); i++) {
			if (!(medic.get(i).equals(medico))) {
				for (int j = 0; j < medic.get(i).getEspecialidades().size(); j++) {
					especialidades.add(medic.get(i).getEspecialidades().get(j));
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
		for (int j = 0; j < nueva.size(); j++) {
			for (int i = 0; i < compara.size(); i++) {
				if (nueva.get(j).equals(compara.get(i))) {
					nueva.remove(j);
				}
			}
		}
		if (nueva.size()>0) {
			for (int i = 0; i < nueva.size(); i++) {
				compara.add(nueva.get(i));
			}
			hospital.setListaEspecialidades(compara);
		}
	}


}
