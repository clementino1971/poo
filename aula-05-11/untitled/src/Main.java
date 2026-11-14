
public class Main {
    public static void main(String[] args) {

//        Personagem ana = new Personagem("Ana");
//
//        ana.exibirEstado();
  //      ana.receberDano(50);
    //    System.out.println(ana.getNome());
        Personagem bob = new Personagem("bob top");
        Personagem bob2 = new Personagem("bob top",
                                        10, 50);

            Guerreiro beto = new Guerreiro("Francisco"
                                        ,"Espada");
        beto.exibirEstado();
        System.out.println(beto.arma);
        beto.receberDano(50);
        beto.gastarEnergia(80);
        beto.exibirEstado();

        Mago carlos = new Mago("Carlos"
                ,"Fogo");
        carlos.exibirEstado();
        System.out.println(carlos.elemento);
        carlos.receberDano(10);
        boolean conseguiu = carlos.gastarEnergia(110);
        carlos.exibirEstado();
        System.out.println(conseguiu);
//        System.out.println("Nome na cabeça:" + ana.retornarNome());

        System.out.println("\n\nComeçou a luta");
        //Carlos atacou beto
        int dano = carlos.atacar();
        beto.receberDano(dano);

        carlos.exibirEstado();
        beto.exibirEstado();

        dano = carlos.lancarFeitico();
        beto.receberDano(dano);

        carlos.exibirEstado();
        beto.exibirEstado();

        carlos.descansar();
        beto.descansar(20);

        carlos.exibirEstado();
        beto.exibirEstado();

    }
}