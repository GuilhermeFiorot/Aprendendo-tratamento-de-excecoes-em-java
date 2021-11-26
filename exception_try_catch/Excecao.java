package exception_try_catch;

public class Excecao {
	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];
			System.out.println("Antes da exception");
			vetor[4] = 1;
			System.out.println("Esse texto n�o ser� impresso");
		}
		catch(ArrayIndexOutOfBoundsException exception){	
			System.out.println("Excecao ao acessar um indice do vetor que n�o existe");
		}
		System.out.println("Esse texto ser� executado ap�s a exception");
	}
}