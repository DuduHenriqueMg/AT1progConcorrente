package at1;

public class Conta{
	
	private String nome;
	private double saldo;
	
	public Conta(double saldo, String name) {
		this.saldo = saldo;
		this.nome = name;
	}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
}
