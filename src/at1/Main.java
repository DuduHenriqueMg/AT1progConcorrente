package at1;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		Banco banco = new Banco(lock);
	
		Loja lojaA = new Loja(new Conta(0));
		Loja lojaB = new Loja(new Conta(0));
		
		Cliente cliente1 = new Cliente("Eduardo", new Conta(1000), lojaA, lojaB, banco);
		Cliente cliente2 = new Cliente("Cleiton", new Conta(1000), lojaA, lojaB, banco);
		Cliente cliente3 = new Cliente("Josivaldo", new Conta(1000), lojaA, lojaB, banco);
		Cliente cliente4 = new Cliente("Maria", new Conta(1000), lojaA, lojaB, banco);
		
		cliente1.start();
		cliente2.start();
		cliente3.start();
		cliente4.start();
		
		try {
			cliente1.join();
			cliente2.join();
			cliente3.join();
			cliente4.join();
		} catch (InterruptedException e) {
			System.out.println("Erro ao chamar joins...");
			e.printStackTrace();
		}
		
	}
}
