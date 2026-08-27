public class Pessoa {
    String nome;
    int altura;
    int cpf;

    public static void main(String[] args){
        Televisao samsung =  new Televisao();
        Televisao lg =  new Televisao();
        Televisao lg2 =  new Televisao();

        samsung.ligar();

        samsung.sintonizar(5);
        System.out.println("Canal Samsung:" + samsung.consultarCanal());

        lg.sintonizar(4);
        System.out.println("Canal LG:" + lg.consultarCanal());

        lg2.sintonizar(10);
        System.out.println("Canal LG2:" + lg2.consultarCanal());
    }
}
