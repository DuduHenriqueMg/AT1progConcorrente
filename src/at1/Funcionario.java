package at1;

public class Funcionario extends Thread{
	
	private String name;
	private Conta conta_salario;
	private Conta conta_investimento;
	private Loja loja;
	private Banco banco;
	
	public Funcionario(String name, Conta conta_salario, Conta conta_investimento, Loja loja, Banco banco) {
		this.name = name;
		this.conta_salario = conta_salario;
		this.conta_investimento = conta_investimento;
		this.loja = loja;
		this.banco = banco;
	}
	
	public Conta getContaSalario() {
		return this.conta_salario;
	}
	
	public Conta getContainvestimento() {
		return this.conta_investimento;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				System.out.println("Thread foi interrompida!");
			}
			if(this.loja.saldo() >= 1400) {
				this.banco.transferir(1400, this.loja.getConta(), this.conta_salario);
				double valor_investir = this.conta_salario.getSaldo() * 0.20;
				this.banco.transferir(valor_investir, this.conta_salario, this.conta_investimento);
				System.out.println(this.name + " recebeu o salário da loja e investiu:" + valor_investir + ". Saldo restante da conta salário: " + this.conta_salario.getSaldo());
				break;
			}
		}
		
		
		
	}
	
	
}
