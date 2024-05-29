package modelos;

public class Persona {

	String nombre;
	String apellidos;
	int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		
		
		
		if(edad<0||edad>130) {
			throw new IllegalArgumentException("edad incorrecta");
		}
		else {
			this.edad=edad;
			this.nombre = nombre;
			this.apellidos = apellidos;
		}

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String mostrarEdad() {
		String respuesta=null;
		
		if (this.edad<18) {
			respuesta="menor de edad";
			
		}
		else if(this.edad>=18 && this.edad<=65) {
			respuesta="mayor de edad";
		}
		else if(this.edad>65) {
			respuesta="jubilado";
		}
		return respuesta;
		
	}
	
	
}
