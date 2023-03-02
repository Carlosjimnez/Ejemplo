package clase2;

public class Profesor {
	private String nombre ;
	private int numeroProfesor;
	public Profesor(String nombre, int numeroProfesor) {
		super();
		this.nombre = nombre;
		this.numeroProfesor = numeroProfesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroProfesor() {
		return numeroProfesor;
	}
	public void setNumeroProfesor(int numeroProfesor) {
		this.numeroProfesor = numeroProfesor;
	}
	
}
