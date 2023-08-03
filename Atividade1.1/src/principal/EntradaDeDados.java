package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.print("Por favor digite seu nome: ");
		//Leitura de dados tipo String (conjunto de caracteres)
		nome = leia.nextLine();
		
		System.out.print("\nDigite sua idade: ");
		//Leitura de dados Int (conjunto de caracteres)
		idade = leia.nextInt();
		
		System.out.print("\nDigite sua altura: ");
		//Leitura de dados tipo Double (conjunto de caracteres)
		altura = leia.nextDouble();
		
		System.out.print("\nQual o sexo (m/f): ");
		//Leitura de dados tipo Char (conjunto de caracteres)
		sexo = leia.next().charAt(0);
		
		System.out.println("\nO nome digitado foi: " + nome);
		System.out.println("A idade digitada foi: " + idade);
		System.out.println("A altura digitada foi: " + altura);
		System.out.println("O sexo digitado foi: " + sexo);
		
		
		
		leia.close();
	}

}
