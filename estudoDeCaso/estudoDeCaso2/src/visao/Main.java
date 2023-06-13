package visao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer op = 0;
		String str = "";

		do {
			menu();
			str = in.nextLine();
			op = Integer.valueOf(str);
			if (op >= 1 || op <= 3) {

			} else {
				System.out.println("Erro");
				op = null;
			}

			switch (op) {
			case 1: {

				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			}

			System.out.print("Deseja voltar[s/n]: ");
			str = in.nextLine();

		} while (str.equals("s"));

	}

	public static void menu() {
		System.out.printf("%21s\n%9s\n%18s\n%4s", "Histórico de vendas[01]", "Estoque[02]", "Cadastrar vendas[03]",
				"OP: ");
	}
}
