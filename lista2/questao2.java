package lista2;
import java.util.Scanner;

public class questao2 {
  public static void main(String[] args) {

			int numero, soma = 0;

			do {
			System.out.println("Digite um número:");
			Scanner entra = new Scanner(System.in);
			numero = entra.nextInt();

			entra.close();

				if (numero >= 0) 
					soma = numero + soma;

			}while (numero >= 0);


			System.out.println("A soma dos números digitados é: "+ soma);

		}
}
