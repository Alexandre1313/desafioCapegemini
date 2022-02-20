package desafio2teste;

import java.util.Scanner;

import desafio2infra.InfraP;

public class testePassword {

	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		Boolean x = false;
		
		while(x == false) {
			System.out.print("\nInforme a senha para cadastro: ");
			String pass = inn.nextLine();
			InfraP s = new InfraP(pass);
			x = s.isValid();
			}
		System.out.println("SENHA CADASTRADA COM SUCESSO!");
		inn.close();
	}
}
