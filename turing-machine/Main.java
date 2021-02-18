import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Maquina maquina = new Maquina();
        Main main = new Main();
        main.menu();
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();

        while (op != 2) {
            switch (op) {
                case 1:
                    maquina.start();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida! ");
            }
            main.menu();
            op = scanner.nextInt();
        }

    }

    public void menu() {
        System.out.println("______________________________________");
        System.out.println("|                                    |");
        System.out.println("|         MAQUINA DE TURING          |");
        System.out.println("|  Reconhecedor da gramática anbncn  |");
        System.out.println("|____________________________________|");
        System.out.println("|                                    |");
        System.out.println("|  1 | Reconhecer Palavra            |");
        System.out.println("|  2 | Sair                          |");
        System.out.println("|____________________________________|");
    }
}