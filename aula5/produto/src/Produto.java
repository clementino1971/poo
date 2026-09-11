public class Produto {
    private String nome;
    private String marca;
    private double preco;

    public Produto(String nome_par, String marca_par, double preco_par){
        this.nome = nome_par;
        this.marca = marca_par;

        if(preco_par >= 0) {
            this.preco = preco_par;
        }else{
            this.preco = 10000.0;
        }
    }

    public void imprimir(){
        this.informarNomeMarca();
        System.out.println(this.preco);
    }

    private void informarNomeMarca(){
        System.out.println(this.nome + " - " + this.marca);
    }

    public boolean aumentarPreco(double percentual){
        if(percentual <= 0){
            return false;
        }

        double acrescimo = this.preco * (percentual/100.0);
        this.preco = this.preco + acrescimo;
        return true;
    }

    public double getPreco(){
        return this.preco;
    }

    public boolean setNome(String novoNome){
        if(novoNome.isEmpty() || novoNome.length() > 30){
            return false;
        }

        this.nome = novoNome;
        return true;
    }

}
