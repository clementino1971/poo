public class Aluno extends Pessoa {
    private int matricula;
    private double nota1;
    private double nota2;

    Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public void imprimir_aluno(){
        super.imprimir();
        System.out.println("Matricula:" + this.matricula);
    }

}
