//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Yuri");
        a1.imprimir();

        Aluno a2 = new Aluno("Nickolas",
                        123);
        a2.imprimir();

        Aluno a3 = new Aluno();
        a3.imprimir();

        Aluno a4 = new Aluno(6666);
        a4.imprimir();


    }
}