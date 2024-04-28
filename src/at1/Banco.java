package at1;
import java.util.concurrent.locks.Lock;

public class Banco {
	private Lock lock;
	
	public Banco(Lock lock) {
		this.lock = lock;
	}
	
	public void transferir(double valor, Conta contaA, Conta contaB) {
		this.lock.lock();
		
		try {
			if(contaA.getSaldo() >= valor){
				contaA.sacar(valor);
				contaB.depositar(valor);
				
			}else {
				System.out.println("Nao foi possivel transferir ");
			}
			
		} finally {
			this.lock.unlock();
		}
		
		
	}
	
}
