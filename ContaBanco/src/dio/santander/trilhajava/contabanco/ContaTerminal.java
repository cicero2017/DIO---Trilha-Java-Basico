package dio.santander.trilhajava.contabanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) throws Exception {
		try {
			
			 int numero;
		     float saldo = 100;
		     
		     Scanner scanner = new Scanner(System.in);
		 
		     System.out.println("Digite seu nome");
		     String nomeCliente = scanner.next();
		     System.out.println("Digite sua agencia");
		     String agencia = scanner.next();
		     System.out.println("Digite o numero da conta");
		     int numeroConta  = scanner.nextInt();

		     System.out.println("Ola"+ " " + nomeCliente + ","+ "Obrigado por criar uma conta" +  
		     " em nosso banco, sua agência é:" + "\n" + agencia + "," +  "conta" + " " + numeroConta  + 
		      " e seu saldo:" + saldo + " " + "já está disponível para saque");
		     System.out.println("Enjoy!");

			
		} catch (java.util.InputMismatchException e) {
			
			System.out.println("Digite apenas números no campo" + " " + "numero da conta");
 		}

}
}