package at1;

public class Loja extends Thread{
	
	private Conta conta;
		
	public Loja(Conta conta) {
		this.conta = conta;
	}
	
	public Conta getConta() {
		return this.conta;
	}
	
	public double saldo() {
		return this.conta.getSaldo();
	}
	
	
	
}
