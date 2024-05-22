import java.util.Locale;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o Número!");

		int numero = sc.nextInt();

		System.out.println("Por favor, digite a Agência!");

		String agencia = sc.next();

		sc.nextLine();

		System.out.println("Por favor, digite o Nome do Cliente!");

		String nomeDoCliente = sc.nextLine();

		System.out.println("Por favor, digite o valor do Saldo!");

		double saldo = sc.nextDouble();

		System.out.println("###########################################################");

		System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco,"

				+ " sua agência é " + agencia

				+ ", conta " + numero

				+ " de seu saldo " + saldo

				+ " já está disponível para saque.");

		sc.close();

	}

}