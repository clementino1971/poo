class Personagem {
    private String nome;
    private int vida;
    private int energia;

    Personagem(String nome_personagem){
        nome = nome_personagem;
        vida = 100;
        energia = 100;
    }

    void exibirEstado(){
        System.out.println("Nome:" + nome);
        System.out.println("Vida:" + vida);
        System.out.println("Energia:" + energia);
    }

    private boolean estaVivo(){
        if(vida == 0){
            return false;
        }else{
            return true;
        }
    }

    boolean receberDano(int danoCausado){
        if(!estaVivo()){
            return false; // Não conseguimos causar dano
        }

        vida -= danoCausado;
        if(vida < 0){
            vida = 0;
        }
        return true; // Conseguimos causar dano
    }

    public String retornarNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == "" || nome.length() > 10){
            System.out.println("Nome Inválido");
            return;
        }
        this.nome = nome;
    }
}
