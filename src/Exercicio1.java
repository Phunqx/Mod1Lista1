import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/* Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá no
		dia 31 de dezembro de 2021. */
		
		Scanner leitor = new Scanner(System.in);
		int ano;
		System.out.print("Digite o ano de nascimento:");
		ano = leitor.nextInt();
		ano = 2021 - ano;
		System.out.println("A idade em 2021 é: " + ano);
		
		leitor.close();
	}

}
