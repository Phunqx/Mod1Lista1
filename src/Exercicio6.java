import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/* 6 – Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		“DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e um
		cupom, informando o valor final a ser pago. */

		Scanner leitor = new Scanner(System.in);
		double valorCompra;
		String cupom;
		
		System.out.print("Digite o valor da compra: ");
		valorCompra = leitor.nextInt();
		System.out.print("Digite o cupom: ");
		cupom = leitor.next();
		
		if(cupom.equals("DIADEFESTA"))
			valorCompra = valorCompra * 0.97;
		
		System.out.println("O valor final da compra é " + valorCompra);
		
		leitor.close();
	}

}
