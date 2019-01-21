package teoria;

public class Persona {

	private String nombre, apellido1, apellido2;
	private int edad;
	private float peso;

	public Persona(String nombre, String apellido1, String apellido2, int edad, float peso) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona de nombre " + nombre + ", edad " + edad + "y peso " + peso;
	}
	
	
	
}
