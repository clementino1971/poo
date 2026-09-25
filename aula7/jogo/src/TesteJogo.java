public class TesteJogo {

    public static void main(String[] args){
        Personagem ana = new Personagem("Ana");
        Personagem beto = new Personagem("Beto");

        System.out.println(ana.getNome());
        System.out.println(ana.getVida());
        System.out.println(ana.getEnergia());

        System.out.println("Viva? " + ana.estaVivo());
        ana.setNome("Luna");

        ana.exibirEstado();
        beto.exibirEstado();
    }
}
