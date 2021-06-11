import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* 2 – Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
solicite ao usuário que digite o tempo de um filme em minutos e informe a duração
desse filme em horas e em segundos */
		
		Scanner leitor = new Scanner(System.in);
		double horas, minutos, segundos;
		
		System.out.print("Digite o tempo em minutos: ");
		minutos = leitor.nextDouble();
		segundos = minutos * 60;
		horas = minutos / 60;
		
		System.out.println("O tempo em horas é: " + horas);
		System.out.println("O tempo em segundos é: " + segundos);
		
		leitor.close();
	}

}
