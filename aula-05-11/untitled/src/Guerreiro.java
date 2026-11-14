public class Guerreiro extends Personagem{
    public String arma;

    Guerreiro(String nome_personagem, String nome_arma){
        super(nome_personagem);
        arma = nome_arma;
    }

    public int golpePesado(){
        if(gastarEnergia(60)){
            return 70;
        }else{
            return 0;
        }
    }

    void exibirEstado(){
        super.exibirEstado();
        System.out.println("Arma: " + arma);
    }




}
