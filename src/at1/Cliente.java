package at1;

import java.util.Random;

public class Cliente extends Thread{
	
	private Conta conta;
	private String name;
	private Loja lojaA;
	private Loja lojaB;
	private Random random;
	private Banco banco;
	
	public Cliente(String name, Conta conta, Loja lojaA, Loja lojaB, Banco banco) {
		this.name = name;
		this.conta = conta;
		this.random = new Random();
		this.lojaA = lojaA;
		this.lojaB = lojaB;
		this.banco = banco;
	}	
	
	public void run() {
		while(this.conta.getSaldo()  > 0) {
			double valor_compra= random.nextInt(2) == 0 ? 100 : 200;
			
			if (this.conta.getSaldo() >= valor_compra) {
                if (random.nextBoolean()) {
                    this.banco.transferir(valor_compra, this.conta, this.lojaA.getConta());
                    System.out.println(this.name + " realizou uma compra de R$" + valor_compra + " na loja A, Saldo restante: R$" + this.conta.getSaldo() + ". Saldo da loja: " + this.lojaA.saldo());
                   
                } else {
                    this.banco.transferir(valor_compra, this.conta, this.lojaB.getConta());
                    System.out.println(this.name + " realizou uma compra de R$" + valor_compra + " na loja , Saldo restante: R$" + this.conta.getSaldo() + ". Saldo da loja: " + this.lojaB.saldo());
	            }
	            try {
		            Thread.sleep(1000); 
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			}
		}
		System.out.println(this.name +": R$"+ this.conta.getSaldo());
		
	}
	
}
