package matematica;

public class Matematica {
	public static int operacoes (int a, int b, char operacao) throws ArithmeticException {
		switch(operacao) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			case '/':
				return a / b;
			default:
				System.out.println("Operação inválida");
		}

		return 0;
	}

	public static int fatorial(int n) throws ArithmeticException {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * fatorial(n - 1);
	}
}