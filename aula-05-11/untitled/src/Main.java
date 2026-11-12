
public class Main {
    public static void main(String[] args) {

        Personagem ana = new Personagem("Ana");
        Personagem beto = new Personagem("Beto");
        Personagem carlos = new Personagem("Carlos");

        ana.exibirEstado();
        ana.receberDano(50);


        ana.setNome("João Lucas TOP");

        String top = "João Lucas TOP";
        ana.setNome(top);

        ana.exibirEstado();

        System.out.println("Nome na cabeça:" + ana.retornarNome());




    }
}