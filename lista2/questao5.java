package lista2;
import java.util.Scanner;


public class questao5 {
		public static void main(String[] args) {


			Scanner coluna = new Scanner(System.in);
			System.out.println("Digite o limite de unidades da coluna esquerda:");
			int limEsquerda = coluna.nextInt();

			System.out.println("Digite o limite de unidades da coluna direita:");
			int limDireita = coluna.nextInt();
			coluna.close();

			 for (int esquerda = 0 ; esquerda <= limEsquerda; esquerda++) {
				 for (int direita = 0 ; direita <= limDireita; direita++) {
					 System.out.println(esquerda + "-" + direita);
				 }
			 }

			}
}
