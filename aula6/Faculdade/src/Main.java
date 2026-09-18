public class Main {
    public static void main(String[] args) {

//    Pessoa pessoa_top = new Pessoa("Thailsson",25);
//    pessoa_top.imprimir();
//
//    Pessoa pessoa_top2 = new Pessoa("Cleferson",19);
//    pessoa_top2.imprimir();
//
//    pessoa_top.fazerAniversario();
//    pessoa_top.imprimir();

      Aluno aluno_top = new Aluno("Clefersson",19,123);
      aluno_top.imprimir_aluno();
      aluno_top.fazerAniversario();

      Professor professor_top = new Professor("Thailsson",
                                       25, "POO");
      professor_top.imprimir_professor();
      professor_top.fazerAniversario();

      professor_top.registrarAula();

      professor_top.imprimir_professor();
      professor_top.registrarAula(5);

      professor_top.imprimir_professor();


    }
}