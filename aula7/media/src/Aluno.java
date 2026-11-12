import java.util.Scanner;

public class Aluno {
    String nome;
    double media;
    String status;

    Aluno(String nome){
        this.nome = nome;
    }

    void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Media: " + media);
        System.out.println("Status: " + status);
    }

    void calcular_media(int num_notas){
        System.out.println("Preenchendo as infos de " + nome);
        Scanner leitor = new Scanner(System.in);
        double nota,soma = 0;
        for(int i = 1; i<=num_notas; i+=1){
            System.out.println("Insira o valor da nota " + i );
            nota = leitor.nextDouble();
            soma = soma + nota;
        }

        media = soma/num_notas;
        calcular_status();
    }

    void calcular_status(){
        if(media >= 7.0){
            status = "Aprovado";
        }else if(media >= 5.0){
            status = "Prova Final";
        }else{
            status = "Reprovado";
        }
    }

}









