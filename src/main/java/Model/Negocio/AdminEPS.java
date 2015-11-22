package Model.Negocio;

import Model.Datos.EPS;

import java.util.ArrayList;

/**
 * Created by Jorge.
 */
public class AdminEPS {

    public ArrayList<EPS> getListaEPS() {
        return listaEPS;
    }

    public void setListaEPS(ArrayList<EPS> listaEPS) {
        this.listaEPS = listaEPS;
    }

    private ArrayList<EPS> listaEPS = new ArrayList<>();

    public void crear(String nombre){
        this.getListaEPS().add(new EPS(nombre, null));
    }

    public void actualizar(EPS eps){
        for (int i = 0; i < this.getListaEPS().size(); i++) {
            if (eps.getNombre().equals(this.getListaEPS().get(i).getNombre())){
                this.getListaEPS().add(i, eps);
                break;
            }
        }
    }

    public void eliminar(String nombre){
        EPS temp = buscar(nombre);
        if(!temp.getNombre().equals(null)){
            for (int i = 0; i < this.getListaEPS().size(); i++) {
                if(temp.getNombre().equals(nombre)){
                    this.getListaEPS().remove(i);
                }
            }
        }
    }

    public EPS buscar(String nombre){
        for(EPS e: this.getListaEPS()){
            if(e.getNombre().equals(nombre)){
                return e;
            }
        }
        return null;
    }
}
