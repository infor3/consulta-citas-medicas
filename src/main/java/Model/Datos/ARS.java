package Model.Datos;

import java.util.ArrayList;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ARS {
    private String nombre;
    private ArrayList<EPS> listaEPS=new ArrayList<EPS>();

    public ARS(String nombre, ArrayList listaEps){
        this.nombre=nombre;
        this.listaEPS=listaEPS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void crearEPS(){
        Scanner xx=new Scanner(System.in);
        String nombre=xx.nextLine();
        ArrayList<Hospital> listaHospitales=new ArrayList<Hospital>();
        EPS eps = new EPS(nombre,listaHospitales);
        listaEPS.add(eps);
    }

    public EPS buscarEPS(String nombre){
        ArrayList<EPS> l= listaEPS;
        for(EPS s : l){
            if(s.getNombre().equalsIgnoreCase(nombre))
                return s;
        }
        return null;
    }

    public void listarEPS(){
        ArrayList<EPS> l=listaEPS;
        for(EPS s:l)
            System.out.println(s);
    }

    public void modificarEPS(String nombre){
        Scanner xx=new Scanner(System.in);
        EPS eps=buscarEPS(nombre);
        System.out.println("Ingrese nuevo nombre");
        eps.setNombre(xx.nextLine());
    }

    public void eliminarEPS(String nombre){
        EPS eps=buscarEPS(nombre);
        listaEPS.remove(eps);
    }



}

