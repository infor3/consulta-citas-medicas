package Model.Datos;



public class Medico extends Persona {

	private String especialidad;

	public Medico(String nombre, String apellido, String correo, String direccion, int celular, int telefono,String especialidad){
		super(nombre,apellido,correo,direccion,telefono,celular);
		this.especialidad=especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}

