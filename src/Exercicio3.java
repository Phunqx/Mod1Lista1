import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/* 3 � Solicite ao usu�rio a digita��o de 2 n�meros inteiros, nas vari�veis A e B. Sem usar uma terceira vari�vel, troque os valores de A e B entre si. */

		Scanner leitor = new Scanner(System.in);
		int a, b;
		
		System.out.print("Digite o valor de A: ");
		a = leitor.nextInt();
		System.out.print("Digite o valor de B: ");
		b = leitor.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Valor final de A: " + a);
		System.out.println("Valor final de B: " + b);
		leitor.close();
	}

}
