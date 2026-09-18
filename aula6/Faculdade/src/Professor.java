public class Professor extends Pessoa{
    private String disciplina;
    private int quantidadeAulas;

    Professor(String nome, int idade, String disciplina){
        super(nome,idade);
        this.disciplina = disciplina;
        this.quantidadeAulas = 0;
    }

    public void imprimir_professor(){
        super.imprimir();
        System.out.println("Disciplina: "+ this.disciplina);
        System.out.println("Quantidade Aulas: " + this.quantidadeAulas);
    }

    public void registrarAula(){
        this.quantidadeAulas += 1;
    }

    public void registrarAula(int qtdAulas){
        this.quantidadeAulas += qtdAulas;
    }

}
