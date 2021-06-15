import pessoa.*;
import turma.*;
import menu.*;


class Main {
	public static void main(String[] args) {
		// Instância do objeto Menu
		Menu menu = new Menu();

		// Menu principal da aplicação
		try {
			menu.menuPrincipal();
		} catch(Exception e) {
			System.out.println("Opção Inválida, reinicie o programa");
		}
  	}
}