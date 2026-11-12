import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {

    static void status(double media){

    }

    public static void main(String[] args) {

        Aluno joao = new Aluno("João Lucas");
        Aluno jamilly = new Aluno("Jamilly");
        Aluno walter = new Aluno("Walter");

        joao.calcular_media(2);
        joao.imprimir();

        jamilly.calcular_media(2);
        jamilly.imprimir();

    }
}