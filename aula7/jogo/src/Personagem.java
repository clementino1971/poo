public class Personagem {
    private String nome;
    private int vida;
    private int energia;


    Personagem(String nome){
        this.nome = nome;
        this.vida = 100;
        this.energia = 100;
    }

    public String getNome(){
        return this.nome;
    }

    public int getVida(){
        return this.vida;
    }

    public int getEnergia(){
        return this.energia;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean estaVivo(){
        return this.vida > 0;
    }

    public void exibirEstado(){
        System.out.println("\n#### Personagem ####");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Energia: " + this.energia);
        System.out.println("####################\n\n");
    }

}
