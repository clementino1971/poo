import java.util.Scanner;

public class Main {
    //  Isto é um comentário

    /*
    Isto é um comentário com várias linhas.
     */
    public static void main(String[] args){
//       double n1 = 10,n2= 7;
//       String nome = "Julio Cesar";
//
//       System.out.println(n1 + " " + n2);
//       System.out.print(n2);
//       System.out.println(" Nome:" + nome);
//
//       // Imprimindo com prinf
//       double n3 = 5.439203;
//       System.out.printf("%.3f\n",n3);
//
//       // calculando média
       Scanner leitor = new Scanner(System.in);
//
//       n1 = leitor.nextDouble();
//       n2 = leitor.nextDouble();
//
//       leitor.nextLine();
//       nome = leitor.nextLine();
//
//       System.out.println("Nome: " + nome);
//       System.out.println("Notas " + n1 + " " + n2);
//       double media = (n1+n2) /2;
//       System.out.println("Média :" + media);
//
//
//       int n_aux = 10;
//       n_aux += 5;
//       System.out.println(n_aux);
//
//       String s = "Vamo fazer ";
//       s += "a chamada!";
//       System.out.println(s);
//
//       boolean resultado = 10 > 10 ||  5 == 50 ||  3-1 == 20 || 10>11;
//       System.out.println("Resposta 1 " + resultado);
//        System.out.println("Resposta 2 " + !resultado);
//
//
//        if(media >= 6.0) {
//            System.out.println("Aprovado!");
//        }else if(media >= 5.0){
//            System.out.println("Exame Final!");
//        }else{
//            System.out.println("Reprovado!");
//        }

        String senha = "SIM";
        String digitado = leitor.nextLine();

        if(digitado.equalsIgnoreCase(senha)){
            System.out.println("Acessou o sistema");
        }
    }

}
