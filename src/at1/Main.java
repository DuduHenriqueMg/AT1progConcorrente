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

		Funcionario funcionario1 = new Funcionario("Rodrigo", new Conta(0), new Conta(0), lojaA, banco);
		Funcionario funcionario2 = new Funcionario("Clerinton", new Conta(0), new Conta(0), lojaB, banco);
		Funcionario funcionario3 = new Funcionario("Isabela", new Conta(0), new Conta(0), lojaA, banco);
		Funcionario funcionario4 = new Funcionario("Amanda", new Conta(0), new Conta(0), lojaB, banco);
		
		funcionario1.start();
		funcionario2.start();
		funcionario3.start();
		funcionario4.start();
		
		
	}
}
