import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/* 5 – Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles
deve ser carregado pelo drone.
*/

		Scanner leitor = new Scanner(System.in);
		int peso1, peso2, peso3;
		
		System.out.print("Digite o peso do lixo 1: ");
		peso1 = leitor.nextInt();
		System.out.print("Digite o peso do lixo 2: ");
		peso2 = leitor.nextInt();
		System.out.print("Digite o peso do lixo 3: ");
		peso3 = leitor.nextInt();
	
		if (peso1 < peso2 && peso1 < peso3)
			System.out.println("O menor peso é o lixo 1");
		else if(peso2 < peso1 && peso2 < peso3)
			System.out.println("O menor peso é o lixo 2");
		else
			System.out.println("O menor peso é o lixo 3");		
		
		leitor.close();
	}

}
