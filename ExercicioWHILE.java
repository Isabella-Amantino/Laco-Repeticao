package LacoRepeticao;

import java.util.Scanner;

public class ExercicioWHILE {

	public static void main(String[] args) {
		
		//Exercício 3 - Laço de Repetição WHILE
		
		int idade,contA=0,contB=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			if(idade < 21) {
				contA++;
			}else if(idade > 50) {
				contB++;
			}
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos: "+contA);
		System.out.println("\nO total de pessoas com mais de 50 anos: "+contB);
		
		
				

	}

}
