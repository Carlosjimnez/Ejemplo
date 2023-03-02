package clase1;

public class Alumno {
	private int numero;
	private String dni;
	private String apellido;
	public Alumno(int numero, String dni) {
		super();
		this.numero = numero;
		this.dni = dni;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
