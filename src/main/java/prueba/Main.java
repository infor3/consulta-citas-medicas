package prueba;

import java.util.ArrayList;

import Datos.Hospital;
import Datos.Medico;
import Negocio.AdministracionHospital;

public class Main {

	public static void main(String[] args) {
		Hospital hos=new Hospital();
		AdministracionHospital ad=new AdministracionHospital();
		ArrayList<String> prueba= new ArrayList<>();
		ArrayList<String> prueba2= new ArrayList<>();
		ArrayList<String> prueba3= new ArrayList<>();
		prueba.add("item 1");
		prueba.add("item 2");
		for (int i = 0; i < 2; i++) {
			prueba2.add(prueba.get(i));
		}
		prueba.add("item 3");
		prueba.add("item 4");
		prueba2.add("item 7");
		
		Medico me=new Medico();
		Medico me1=new Medico();
		me.setEspecialidades(prueba);
		me1.setEspecialidades(prueba2);
		hos.getListaMedicos().add(me);
		hos.getListaMedicos().add(me1);
		prueba3.add("item 14");
		prueba3.add("item 15");
		Medico me2=new Medico();
		me2.setEspecialidades(prueba3);
		hos.getListaMedicos().add(me2);
		ad.modificarEspeRemove(hos, me2);

		prueba2=hos.getListaEspecialidades();
		for (int i = 0; i < prueba2.size(); i++) {
			System.out.println(prueba2.get(i));
		}

		
	}
}
