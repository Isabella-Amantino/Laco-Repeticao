package LacoRepeticao;

import java.util.Scanner;

public class ExercicioDOWHILE {

	public static void main(String[] args) {
		
		//Exercício 6 - Laço de Repetição DO...WHILE
		
		int numeros,somaNum=0,contNum=0;
		float media;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um número: ");
		numeros = leia.nextInt();
		
		do {
			if(numeros%3==0) {
				somaNum += numeros;
				contNum++;
			}
			System.out.println("\nEntre com um número: ");
			numeros = leia.nextInt();
			
		}while(numeros != 0);
		
		if(contNum == 0) {
			System.out.println("\nNão é possível fazer divisão por zero.");
		}else {
			
		media = (somaNum)/ contNum;
		System.out.printf("\nMédia dos números múltiplos de 3: %.2f ",media);
	}

}
}
