import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double n1;
        double n2;

        Scanner yuri = new Scanner(System.in);
        n1 = yuri.nextDouble();
        n2 = yuri.nextDouble();

        System.out.println("N1:" + n1);
        System.out.println("N2:" + n2);

        double media = (n1+n2)/2;
        System.out.println("Média:" + media);

        if(media >= 6.0){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }

    }
}
