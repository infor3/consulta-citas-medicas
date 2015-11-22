package Model.Negocio;

import Model.Datos.*;

import java.util.ArrayList;


public class AdmiAgenda {

    public void listadoCitas(Hospital hospital){
        ArrayList<Cita> totalCitas=new ArrayList<>();
        ArrayList<Medico> listaMedicos;
        listaMedicos = new ArrayList<>();
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
    public void crear(String nombre, String apellido, String correo, String direccion, String id, String contrasenia, int nivel, int edad, int telefono, int celular, boolean afiliado, EPS eps){
        new Paciente(nombre, apellido, correo, direccion, id, contrasenia, nivel, edad, telefono, celular, afiliado, eps);
    }

    public void actualizar(Paciente paciente, EPS eps){
        for (int i = 0; i < eps.getListaPaciente().size(); i++) {
            if(paciente.getId().equals(eps.getListaPaciente().get(i).getId())){
                eps.getListaPaciente().add(i, paciente);
                break;
            }
        }
    }

    public void eliminar(String id, EPS eps){
        Paciente temp = buscar(id, eps);
        if(!temp.getId().equals(null)){
            for (int i = 0; i < eps.getListaPaciente().size(); i++) {
                if(temp.getId().equals(id)){
                    eps.getListaPaciente().remove(i);
                }
            }
        }
    }

    public Paciente buscar(String id, EPS eps){
        for(Paciente p: eps.getListaPaciente()){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

}
