class Turma{
    String nome;
    Aluno[] alunos;
    int quantidade;

    Turma(String nome, int capacidade){
        this.nome = nome;
        this.alunos = new Aluno[capacidade];
        this.quantidade = 0;
    }

    boolean possuiVaga(){
        return quantidade < alunos.length;
    }

    boolean matricular(Aluno a){
        if(possuiVaga()){
            alunos[this.quantidade] = a;
            this.quantidade++;
            System.out.println("Aluno Matriculado!");
            return true;
        }else{
            System.out.println("Turma Cheia!");
            return false;
        }
    }

    double calcularMediaTurma(){
        if(quantidade == 0){
            return 0.0;
        }

        double soma = 0.0;
        for(int i=0;i<quantidade;i++){
            soma = soma + alunos[i].calcularMedia();
        }

        double media = soma/quantidade;
        return media;
    }

    int contaAprovados(){
        int contador = 0;
        for(int i=0;i<quantidade;i++){
            if(alunos[i].estaAprovado()){
                contador = contador + 1;
            }
        }
        return  contador;
    }

    void exibirResultado(){
        System.out.println("Turma: " + this.nome);
        System.out.println("Quantidade de Alunos:" + this.quantidade);

        for(int i=0;i<quantidade;i++){
            alunos[i].exibirBoletim();
            System.out.println();
        }

        System.out.println("Média da Turma: " + this.calcularMediaTurma());
        System.out.println("Aprovados: " + this.contaAprovados());
    }


}



