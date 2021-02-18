import java.util.Scanner;

public class Maquina {

    int i;
    char fita[];

    public void start() {
        System.out.println("-> Digite a entrada na máquina: ");
        System.out.println("Obs: Colocar 'T' no final para representar o símbolo delimitador de fim");
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        i = 0;
        fita = palavra.toCharArray();
        q0();
    }

    public void q0() {
        try {
            if (i < fita.length) {
                if (fita[i] == 'a') {
                    fita[i] = 'A';
                    i++;
                    q1();
                } else if (fita[i] == 'B') {
                    fita[i] = 'B';
                    i++;
                    q0();
                } else if (fita[i] == 'C') {
                    fita[i] = 'C';
                    i++;
                    q0();
                } else if (fita[i] == 'T') {
                    fita[i] = 'T';
                    i++;
                    qf();
                } else if (fita[i] == 'b') {
                    fita[i] = 'b';
                    i++;
                    q2();
                } else if (fita[i] == 'c') {
                    fita[i] = 'c';
                    i++;
                    q2();
                } else {
                    abortar();
                }
            } else
                abortar();
        } catch (Exception e) {
            abortar();
        }
    }

    public void q1() {
        try {
            if (i < fita.length) {
                if (fita[i] == 'b') {
                    fita[i] = 'B';
                    i++;
                    q2();
                } else if (fita[i] == 'A') {
                    fita[i] = 'A';
                    i++;
                    q1();
                } else if (fita[i] == 'B') {
                    fita[i] = 'B';
                    i++;
                    q1();
                } else if (fita[i] == 'a') {
                    fita[i] = 'a';
                    i++;
                    q1();
                } else if (fita[i] == 'C') {
                    fita[i] = 'C';
                    i++;
                    q1();
                } else {
                    abortar();
                }
            } else
                abortar();
        } catch (Exception e) {
            abortar();
        }
    }

    public void q2() {
        try {
            if (i < fita.length) {
                if (fita[i] == 'c') {
                    fita[i] = 'C';
                    i--;
                    q3();
                } else if (fita[i] == 'b') {
                    fita[i] = 'b';
                    i++;
                    q2();
                } else if (fita[i] == 'C') {
                    fita[i] = 'C';
                    i++;
                    q2();
                } else if (fita[i] == 'T') {
                    fita[i] = 'T';
                    i--;
                    q1();
                } else {
                    abortar();
                }
            } else
                abortar();
        } catch (Exception e) {
            abortar();
        }
    }

    public void q3() {
        try {
            if (i < fita.length) {
                if (fita[i] == 'T') {
                    fita[i] = 'T';
                    i++;
                    qf();
                } else if (fita[i] == 'c') {
                    fita[i] = 'C';
                    i--;
                    q3();
                } else if (fita[i] == 'C') {
                    fita[i] = 'C';
                    i--;
                    q3();
                } else if (fita[i] == 'A') {
                    fita[i] = 'A';
                    i++;
                    q0();
                } else if (fita[i] == 'B') {
                    fita[i] = 'B';
                    i--;
                    q3();
                } else if (fita[i] == 'b') {
                    fita[i] = 'b';
                    i--;
                    q3();
                } else if (fita[i] == 'a') {
                    fita[i] = 'a';
                    i--;
                    q3();
                } else {
                    abortar();
                }
            } else
                abortar();
        } catch (Exception e) {
            abortar();
        }

    }

    public void qf() {
        System.out.println("______________________");
        System.out.println("|                     |");
        System.out.println("|  PALAVRA ACEITA!!!  |");
        System.out.println("|_____________________|");
    }

    public void abortar() {
        System.out.println("______________________");
        System.out.println("|                     |");
        System.out.println("| PALAVRA NAO ACEITA  |");
        System.out.println("|_____________________|");
    }
}