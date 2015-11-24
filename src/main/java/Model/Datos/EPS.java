package Model.Datos;



		import java.util.ArrayList;
		import java.util.Scanner;

public class EPS {
	private String nombre;
	private ArrayList<Hospital> hospitales=new ArrayList<Hospital>();


	public EPS(String nombre, ArrayList hospitales){
		this.nombre=nombre;
		this.hospitales=hospitales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void crearHospital(Agenda agenda){
		Scanner xx=new Scanner(System.in);
		System.out.println("Ingrese el nombre del hospital");
		String nombre=xx.nextLine();
		System.out.println("Ingrese numero de telefono");
		int telefono=xx.nextInt();
		ArrayList<Consultorio> consultorios=new ArrayList<Consultorio>();
		ArrayList<Medico> medicos= new ArrayList<Medico>();
		ArrayList<Cita> citas= new ArrayList<Cita>();
		ArrayList<Paciente> pacientes= new ArrayList<Paciente>();
		Hospital hospital = new Hospital(nombre, telefono, consultorios, medicos, citas, pacientes, agenda);
		hospitales.add(hospital);
	}

	public Hospital buscarHospital(String nombre){
		ArrayList<Hospital> l= hospitales;
		for(Hospital s : l){
			if(s.getNombre().equalsIgnoreCase(nombre))
				return s;
		}
		return null;
	}

	public void listarHospital(){
		ArrayList<Hospital> l=hospitales;
		for(Hospital s:l)
			System.out.println(s);
	}

	public void modificarHospital(String nombre){
		Scanner xx=new Scanner(System.in);
		Hospital hospital=buscarHospital(nombre);
		System.out.println("Ingrese nuevo nombre");
		hospital.setNombre(xx.nextLine());
		System.out.println("Ingrese nuevo numero");
		hospital.setTelefono(xx.nextInt());
	}

	public void eliminarHospital(String nombre){
		Hospital hospital=buscarHospital(nombre);
		hospitales.remove(hospital);
	}

}


