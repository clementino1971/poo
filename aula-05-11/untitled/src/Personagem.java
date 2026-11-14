class Personagem {
    protected String nome;
    protected int vida;
    protected int energia;

    Personagem(String nome_personagem){
        nome = nome_personagem;
        vida = 100;
        energia = 100;
    }

    Personagem(String nome_personagem,
                        int valor_vida,
                        int valor_energia){
        nome = nome_personagem;
        vida = valor_vida;
        energia =valor_energia;
    }

    void exibirEstado(){
        System.out.println("##################################");
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

    public String getNome() {
        return nome;
    }

    public String retornarNome() {
        return nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNome(String nome) {
        if(nome == "" || nome.length() > 10){
            System.out.println("Nome Inválido");
            return;
        }
        this.nome = nome;
    }

    public boolean gastarEnergia(int energia_gasta){
        if(energia_gasta > energia){
            return false;
        }

        energia -= energia_gasta;
        return true;
    }

    public int atacar(){
        if(gastarEnergia(20)){
            return 30;
        }else{
            return 0;
        }
    }

    public void descansar(){
        energia = 100;
    }

    public void descansar(int qtd_descanso){
        energia = energia + qtd_descanso;
        if(energia > 100){
            energia = 100;
        }
    }

}
