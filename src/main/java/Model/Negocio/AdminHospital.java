package Model.Negocio;

import java.util.ArrayList;
import java.util.HashSet;

import Model.Datos.EPS;
import Model.Datos.Hospital;
import Model.Datos.Medico;


public class AdminHospital {

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

    public void crear(String nombre, int telefono, EPS eps){
        eps.getListaHospitales().add(new Hospital(nombre, telefono, eps));
    }

    public void actualizar(Hospital hospital, EPS eps){
        for (int i = 0; i < eps.getListaHospitales().size(); i++) {
            if(hospital.getNombre().equals(eps.getListaHospitales().get(i).getNombre())){
                eps.getListaHospitales().add(i, hospital);
                break;
            }
        }
    }

    public void eliminar(String nombre, EPS eps){
        Hospital temp = buscar(nombre, eps);
        if(!temp.getNombre().equals(null)){
            for (int i = 0; i < eps.getListaHospitales().size(); i++) {
                eps.getListaHospitales().remove(i);
            }
        }
    }

    public Hospital buscar(String nombre, EPS eps){
        for(Hospital h: eps.getListaHospitales()) {
            if (h.getNombre().equals(nombre)) {
                return h;
            }
        }
        return null;
    }

}
