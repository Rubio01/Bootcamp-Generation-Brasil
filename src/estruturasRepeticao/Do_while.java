package estruturasRepeticao;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String usuarioCorreto = "admin";
		String senhaCorreta = "12345";
		boolean autenticado = false;

		do {

			System.out.print("Digite o nome de usuário: ");
			String usuario = scanner.nextLine();

			System.out.print("Digite a senha: ");
			String senha = scanner.nextLine();

			if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {

				System.out.println("Autenticado com sucesso!");
			} else {
				System.out.println("Usuário ou senha incorretos. Tente novamente.");
				System.out.print("Deseja tentar novamente? (s/n): ");
				String continuar = scanner.nextLine().toUpperCase();
				if (continuar.equals("S")) {
					autenticado = true;
				} else {
					autenticado = false;
					System.out.println("Usuário ou senha incorretos. Tente novamente.");
				}

			}

		} while (autenticado);
	}

}
