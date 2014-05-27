
public class Agencia extends Thread {
	/*Nombre de la Agencia*/
	private String nombre;
	
	/*Métodos get y set de la Agencia*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*Constructor de la Agencia*/
	public Agencia(String nombre){
		this.setNombre(nombre);
	}

}
