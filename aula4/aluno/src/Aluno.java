class Aluno{
    String nome;
    int matricula;
    double nota1;
    double nota2;

    Aluno(String nome, int matricula, double n1, double n2 ){
        this.nome = nome;
        this.matricula = matricula;
        nota1 = n1;
        nota2 = n2;
    }

    double calcularMedia(){
        return (this.nota1+nota2)/2.0;
    }

    boolean estaAprovado(){
        return calcularMedia() >=6.0;
    }

    void exibirBoletim(){
        System.out.println("###################################");
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Notas: " + this.nota1 + "|" + nota2);
        System.out.println("Média: " +  this.calcularMedia());

        System.out.print("Situação: ");
        if(estaAprovado()){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
        System.out.println("###################################");
    }

}