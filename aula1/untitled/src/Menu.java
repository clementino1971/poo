import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite o nome do aluno:");
        String nome = leitor.nextLine();
        System.out.println("Digite a n1:");
        double n1 = leitor.nextDouble();
        System.out.println("Digite a n2:");
        double n2 = leitor.nextDouble();

        Aluno aluno_top = new Aluno(nome,n1,n2);
        double media = aluno_top.calcula_media();
       // status_aluno(nome, media);

    }

}






