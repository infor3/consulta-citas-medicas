package Model.Datos;



		import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private String correo;
	private String direccion;
	private int edad;
	private int telefono;
	private int celular;

	public Persona(String nombre, String apellido, String correo, String direccion, int telefono, int celular){
		this.nombre=nombre;
		this.apellido=apellido;
		this.correo=correo;
		this.direccion=direccion;
		this.telefono=telefono;
		this.celular=celular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}


}

