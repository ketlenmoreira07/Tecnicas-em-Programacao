package lista3;

import java.util.Scanner;

public class exer02 {
	
	public static double media(int vetA[], int vetB[]) {
		int soma = 0;
		for(int i = 0; i < vetA.length; i++) {
		soma = vetA[i]+vetB[i]+soma;
		}
		return (soma/(vetA.length + vetB.length));
	}
	
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		int tamA, tamB;
		int vetA[];
		System.out.println("Digite o tamanho do vetor A");
		tamA = entra.nextInt();
		vetA = new int[tamA];
		int vetB[];
		System.out.println("Digite o tamanho do vetor B");
		tamB = entra.nextInt();
		vetB = new int[tamB];
		
		for(int i = 0; i < vetA.length; i++) {
			System.out.println(i+"º posição: ");
			vetA[i] = entra.nextInt();
		}
		for(int i = 0; i < vetB.length; i++) {
			System.out.println(i+"º posição: ");
			vetB[i] = entra.nextInt();
		}
		
		System.out.println("A média é " + media(vetA, vetB));
	}
}
