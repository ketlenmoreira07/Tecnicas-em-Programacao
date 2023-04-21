package lista2;
public class questao6 {

	
	public static int [] minhaFuncao(String v[] ) {
		
		int aux[] = new int [10];
		for (int i = 0; i < v.length; i++) {
			v[i]= "a"+ i;
		}
        
		for (int i = 0; i < 10; i++) {
			 aux[i]=i;
		}
		return aux;
	}
	
	public static int numero() {
		return 10;
	}
	
	public static boolean controle() {
		return true;
	}
	public static void main(String[] args) {

		
		int soma = numero()+20;
		
		boolean controle = controle();
		
		String vetor [] = new String [10];
		
		int numeros[] =   minhaFuncao(vetor);
		
		System.out.println("vetor: "+numeros[0]);
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);		
		};
		
		
		int vet[][] = new int [2][3];
		
		int contador=0;
		
		vet[0][0]=20;
		vet[0][1]=20;
		vet[0][0]=20;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.println(vet[i][j] = contador);
				contador++;
			}
		} 
		
	}

}