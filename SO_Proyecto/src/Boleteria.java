
public class Boleteria extends Thread{

	private String nombre;

	/*M�todos get y set de la Boleter�a*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*Constructor de la Boleter�a*/
	public Boleteria(String nombre){
		this.nombre=nombre;
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(this.nombre+" "+"est� vendiendo entradas");
		}
		System.out.println("Se termin� el plazo de vender entradas");
	}
	
}
