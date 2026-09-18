public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String parametro_nome, int idade){
        nome = parametro_nome;
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("#######################");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("#######################");
    }

    public void fazerAniversario(){
        System.out.println("Feliz Aniversário!!!!");
        this.idade = this.idade+1;
    }


}
