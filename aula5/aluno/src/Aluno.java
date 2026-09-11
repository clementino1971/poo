public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome){
        this(nome, 0);
    }

    public Aluno(){
        this("Sem nome");
    }

    public Aluno(int valor){
        this("Sem nome", valor);
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
    }

}
