public class Aluno {
    String nome;
    double n1,n2;
    int matricula;
    double media;

    Aluno(){
    }

    void status_aluno(){
        System.out.println("Aluno: " + this.nome);
        if(this.media >= 6){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
    }

    double calcula_media(){
        this.media = (this.n1+this.n2)/2;
        return this.media;
    }
}
