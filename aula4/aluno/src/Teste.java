class Teste{

    public static void main(String[] args){
        Aluno aluno_top = new Aluno("Julio", 18, 6.0, 6.0);
//        aluno_top.exibirBoletim();

        aluno_top.nota1 = 10.0;

        Aluno aluno_legal = new Aluno("Sara", 28, 5.0, 5.0);
//        aluno_legal.exibirBoletim();

        Turma es_poo = new Turma("ES POO 2026/2", 2);

        es_poo.matricular(aluno_top);
        es_poo.matricular(aluno_legal);

        es_poo.exibirResultado();

    }
}