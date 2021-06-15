import matematica.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1 - Operacoes básicas 2 - Fatorial");
	int opt = Integer.parseInt(sc.nextLine());

	switch(opt) {
		case 1:
			System.out.print("Primeiro número: ");
			int a = Integer.parseInt(sc.nextLine());

			System.out.print("Segundo número: ");
			int b = Integer.parseInt(sc.nextLine());

			System.out.print("Operaçãão [+,-,*,/]: ");
			char op = sc.nextLine().charAt(0);

			try {
    			System.out.print(Matematica.operacoes(a, b, op));
			} catch (Exception e) {
				System.out.println("Não é possível dividir por zero");
			}
			break;
		case 2:
			System.out.print("Número: ");
			int n = Integer.parseInt(sc.nextLine());

			try {
    			System.out.print(Matematica.fatorial(n));
			} catch (Exception e) {
				System.out.println("Erro");
			}
			break;
		default:
			System.out.println("Opção inválida");
	}
  }
}