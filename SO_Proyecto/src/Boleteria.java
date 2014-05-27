
public class Boleteria extends Thread{

	private String nombre;

	/*Métodos get y set de la Boletería*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*Constructor de la Boletería*/
	public Boleteria(String nombre){
		this.nombre=nombre;
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(this.nombre+" "+"está vendiendo entradas");
		}
		System.out.println("Se terminó el plazo de vender entradas");
	}
	
}
