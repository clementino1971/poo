import java.util.Scanner;

public class Main {

    static double calcularMedia(double n1, double n2,
                         double n3){
        double media;
        media = (n1+n2+n3)/3.0;
        return media;
    }

    public static void main(String[] args) {
        Scanner banana = new Scanner(System.in);

        double n1 = banana.nextDouble();
        double n2 = banana.nextDouble();
        double n3 = banana.nextDouble();

        double media = calcularMedia(n1,n2,n3);

        System.out.println("Média = " + media);
        System.out.print("Média = " + media + "\n");
        System.out.printf("Média = %f\n", media);

    }
}



