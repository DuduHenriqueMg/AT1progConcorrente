package at1;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Banco{
	
	private Lock lock;
	
	public Banco(Lock lock) {
	
		this.lock = lock;
		

	}
	
	public void pagamento(Integer product) {

		
	}
	
}
