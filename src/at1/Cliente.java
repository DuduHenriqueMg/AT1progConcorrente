package at1;

import java.util.Random;

import at1.Conta;

public class Cliente extends Thread{
	
	private Conta conta;
	private double saldo_inicial = 1000;
	
	public Cliente(Conta conta) {
		this.conta = conta;
	}
	
	public void run() {

	}
	
	public void compra() {

	}
	
}
