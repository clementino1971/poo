public class Mago  extends  Personagem{
    public String elemento;

    Mago(String nome_personagem, String nome_elemento){
        super(nome_personagem);
        elemento = nome_elemento;
    }

    public int lancarFeitico(){
        if(gastarEnergia(40)){
            return 60;
        }else{
            return 0;
        }
    }

    void exibirEstado(){
        super.exibirEstado();
        System.out.println("Elemento: " + elemento);
    }

}
