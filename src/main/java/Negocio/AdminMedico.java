package Negocio;

import Datos.Hospital;
import Datos.Medico;

import java.util.ArrayList;

/**
 * Created by Jorge.
 */
public class AdminMedico {
    public void crear(String nombre, String apellido, String correo, String direccion, String id, String contrasenia, int nivel, int edad, int telefono, int celular, ArrayList<String> especialidades, Hospital hospital){
        Medico med = new Medico(nombre, apellido,correo,direccion,id,contrasenia,nivel,edad,telefono,celular,especialidades,hospital);
        hospital.getListaMedicos().add(med);
    }

    public void actualizar(Medico medico, Hospital hospital){
        for (int i = 0; i < hospital.getListaMedicos().size(); i++) {
            if(medico.getId().equals(hospital.getListaMedicos().get(i).getId())){
                hospital.getListaMedicos().add(i, medico);
                break;
            }
        }
    }

    public void eliminar(String id, Hospital hospital){
        Medico temp = buscar(id, hospital);
        if(!temp.getId().equals(null)){
            for (int i = 0; i < hospital.getListaMedicos().size(); i++) {
                if(temp.getId().equals(id)){
                    hospital.getListaMedicos().remove(i);
                }
            }
        }
    }

    public Medico buscar(String id, Hospital hospital){
        for(Medico m: hospital.getListaMedicos()){
            if(m.getId().equals(id)){
                return m;
            }
        }
        return null;
    }
}
