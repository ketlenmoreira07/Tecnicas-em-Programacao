package lista3;
import java.util.Scanner;
public class exer01 {
	
	public static int soma(int vet[]) {
		int a = 0;
		for(int i = 2; i < vet.length -2; i++) {
		a = vet[i]+a;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		int tam;
		int vet[];
		System.out.println("Digite o tamanho do vetor");
		tam = entra.nextInt();
		vet = new int[tam];
		for(int i = 0; i < vet.length; i++) {
			System.out.println(i+"º posição: ");
			vet[i] = entra.nextInt();
		}
		
		System.out.println("A soma é:" +soma(vet));
	}
}
	
	
	
	
	
