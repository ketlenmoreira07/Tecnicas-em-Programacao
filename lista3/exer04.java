package lista3;

public class exer04 {
	public static int contDeElementeos(int vetA[],  int vetB[], int cont) {
		int quant=0;
		for(int i=0;i<vetA.length;i++) {
			if(vetA[i]==cont) {
				quant++;
			}
		}
		for(int i=0;i<vetB.length;i++) {
			if(vetB[i]==cont) {
				quant++;
			}
		}
		return quant;
	}
	
	public static void main(String[] args) {
		int vetA[] = new int[4];
		int vetB[] = new int[4];
		for(int i = 0; i < vetA.length; i++) {
			vetA[i] = i*2;
			vetB[i] = i*3;
		}
		int contador=3;
		
		System.out.println("O número " + contador + " se repete " + contDeElementeos(vetA, vetB, contador) + " vezes");
	}
}
