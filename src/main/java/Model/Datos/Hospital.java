package Model.Datos;

		import java.util.ArrayList;
		import java.util.Date;
		import java.util.Scanner;

public class Hospital {
	private String nombre;
	private int telefono;
	private ArrayList<Consultorio> consultorios=new ArrayList<Consultorio>();
	private ArrayList<Medico> medicos=new ArrayList<Medico>();
	private ArrayList<Cita> citas= new ArrayList<Cita>();
	private ArrayList<Paciente> pacientes= new ArrayList<Paciente>();
	private Agenda agenda;


	public Hospital(String nombre, int telefono, ArrayList medicos, ArrayList pacientes, ArrayList hospitales, ArrayList citas, Agenda agenda){
		this.nombre=nombre;
		this.telefono=telefono;
		this.medicos=medicos;
		this.pacientes=pacientes;
		this.consultorios=consultorios;
		this.citas=citas;
		this.agenda=agenda;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void crearConsultorio(Hospital hospital,Medico medico){
		Scanner xx=new Scanner(System.in);
		System.out.println("Ingrese id del consultorio");
		int id=xx.nextInt();
		boolean estado=false;
		System.out.println("Ingrese el numero de telefono del consultorio");
		int telefono=xx.nextInt();

		Consultorio consultorio=new Consultorio(estado,id,telefono,hospital, medico);

		consultorios.add(consultorio);

	}

	public Consultorio buscarConsultorio (int id){
		ArrayList<Consultorio> l=consultorios;
		for(Consultorio s:l)
			if(s.getId()==id)
				return s;
		return null;
	}

	public void listarConsultorio(){
		ArrayList<Consultorio> l=consultorios;
		for(Consultorio s:l)
			System.out.println(s);
	}

	public void modificarConsultorio(int id){
		Scanner xx=new Scanner(System.in);
		Consultorio consultorio=buscarConsultorio(id);
		System.out.println("Ingrese nuevo id");
		consultorio.setId(xx.nextInt());
		System.out.println("Ingrese nuevo telefono");
		consultorio.setTelefono(telefono);
	}

	public void eliminarConsultorio(int id){
		Consultorio consultorio=buscarConsultorio(id);
		consultorios.remove(consultorio);
	}

	public void crearMedico(){
		Scanner xx=new Scanner(System.in);
		System.out.println("Ingrese nombre del medico");
		String nombre=xx.nextLine();
		System.out.println("Ingrese apellido del medico");
		String apellido=xx.nextLine();
		System.out.println("Ingrese correo del medico");
		String correo=xx.nextLine();
		System.out.println("Ingrese direccion de residencia");
		String direccion=xx.nextLine();
		System.out.println("Ingrese el numero de celular del medico");
		int celular=xx.nextInt();
		System.out.println("Ingrese el telefono fijo del medico");
		int telefono=xx.nextInt();
		System.out.println("Ingrese la especialidad");
		String especialidad=xx.nextLine();

		Medico medico=new Medico(nombre,apellido,correo,direccion,celular,telefono,especialidad);

		medicos.add(medico);

	}

	public Medico buscarMedico (String nombre, String apellido){
		ArrayList<Medico> l=medicos;
		for(Medico s:l)
			if(s.getNombre().equalsIgnoreCase(nombre) && s.getApellido().equalsIgnoreCase(apellido))
				return s;
		return null;
	}

	public void listarMedico(){
		ArrayList<Medico> l=medicos;
		for(Medico s:l)
			System.out.println(s);
	}

	public void modificarMedico(String nombre, String apellido){
		Scanner xx=new Scanner(System.in);
		Medico medico=buscarMedico(nombre, apellido);
		System.out.println("Ingrese nuevo nombre");
		medico.setNombre(xx.nextLine());
		System.out.println("Ingrese nuevo apellido");
		medico.setApellido(xx.nextLine());
		System.out.println("Ingrese nuevo correo");
		medico.setCorreo(xx.nextLine());
		System.out.println("Ingrese nueva direccion");
		medico.setDireccion(xx.nextLine());
		System.out.println("Ingrese nuevo numero de celular");
		medico.setCelular(xx.nextInt());
		System.out.println("Ingrese nuevo telefono fijo");
		medico.setTelefono(xx.nextInt());
		System.out.println("Ingrese la especialidad");
		medico.setEspecialidad(xx.nextLine());
	}

	public void eliminarMedico(String nombre, String apellido){
		Medico medico=buscarMedico(nombre, apellido);
		medicos.remove(medico);
	}

	public void crearCita(Paciente paciente){
		Scanner xx=new Scanner(System.in);
		Date fecha=new java.util.Date();
		Date hora=new java.util.Date();
		boolean estado=false;
		System.out.println("Ingrese el id de la cita");
		int id=xx.nextInt();

		Cita cita=new Cita(fecha,hora,estado,id,paciente);

		citas.add(cita);

	}

	public Cita buscarCita (int id){
		ArrayList<Cita> l=citas;
		for(Cita s:l)
			if(s.getId()==id)
				return s;
		return null;
	}

	public void listarCita(){
		ArrayList<Cita> l=citas;
		for(Cita s:l)
			System.out.println(s);
	}

	public void modificarCita(int id){
		Scanner xx=new Scanner(System.in);
		Cita cita=buscarCita(id);
		cita.setFecha(new java.util.Date());
		cita.setHora(new java.util.Date());
		System.out.println("Ingrese el id de la cita");
		cita.setId(xx.nextInt());
	}

	public void eliminarCita(int id){
		Cita cita=buscarCita(id);
		citas.remove(cita);
	}

	public void crearPaciente(){
		Scanner xx=new Scanner(System.in);
		System.out.println("Ingrese nombre del paciente");
		String nombre=xx.nextLine();
		System.out.println("Ingrese apellido del paciente");
		String apellido=xx.nextLine();
		System.out.println("Ingrese correo del paciente");
		String correo=xx.nextLine();
		System.out.println("Ingrese direccion de residencia");
		String direccion=xx.nextLine();
		System.out.println("Ingrese el telefono fijo del paciente");
		int telefono=xx.nextInt();
		System.out.println("Ingrese el numero de cedula del paciente");
		int id=xx.nextInt();
		System.out.println("Ingrese el numero de celular del paciente");
		int celular=xx.nextInt();
		boolean afiliado=false;
		ArrayList<Cita> citasPaciente=new ArrayList<Cita>();

		Paciente paciente=new Paciente(nombre,apellido,correo,direccion,telefono,id,celular,afiliado,citasPaciente);

		pacientes.add(paciente);

	}

	public Paciente buscarPaciente (int  id){
		ArrayList<Paciente> l=pacientes;
		for(Paciente s:l)
			if(s.getId()==id)
				return s;
		return null;
	}

	public void listarPaciente(){
		ArrayList<Paciente> l=pacientes;
		for(Paciente s:l)
			System.out.println(s);
	}

	public void modificarPaciente(int id){
		Scanner xx=new Scanner(System.in);
		Paciente paciente=buscarPaciente(id);
		System.out.println("Ingrese nuevo nombre");
		paciente.setNombre(xx.nextLine());
		System.out.println("Ingrese nuevo apellido");
		paciente.setApellido(xx.nextLine());
		System.out.println("Ingrese nuevo correo");
		paciente.setCorreo(xx.nextLine());
		System.out.println("Ingrese nueva direccion");
		paciente.setDireccion(xx.nextLine());
		System.out.println("Ingrese nuevo telefono fijo");
		paciente.setTelefono(xx.nextInt());
		System.out.println("Ingrese nuevo numero de cedula");
		paciente.setId(xx.nextInt());
		System.out.println("Ingrese nuevo numero de celular");
		paciente.setCelular(xx.nextInt());
	}

	public void eliminarPaciente(int id){
		Paciente paciente=buscarPaciente(id);
		pacientes.remove(paciente);
	}




}

