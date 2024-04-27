package at1;

public class Conta{
	
	private double saldo;
	
	
	public Conta(double saldo) {
		this.saldo = saldo;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double value) {
		this.saldo += value;
	}
	
	public boolean sacar(double value) {
		if(value <= this.saldo) {
			this.saldo -= value;
			return true;
		}
		
		return false;
	}
}
