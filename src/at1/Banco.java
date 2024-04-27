package at1;



public class Banco {

	public void transferir(double valor, Conta contaA, Conta contaB) {
		if(contaA.getSaldo() >= valor){
			
			if(contaA.sacar(valor)){
				contaB.depositar(valor);
			}else {
				System.out.println("\nNao foi possivel sacar");
			}
		}else {
			System.out.println("\n Nao foi possivel tranferir");
		}
	}
	
	
	
}
