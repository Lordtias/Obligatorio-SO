
public final class Semaforo {
	private int counter;	
	
	public Semaforo(final int counter) {
		this.counter = counter;
	}
	
	public synchronized void decrease() throws InterruptedException {
		while (counter == 0) {
			wait();
		}
		counter--;
	}
	
	public synchronized void increase() {					
		counter++;
		notify();							
	}	
	

}
