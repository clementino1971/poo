public class Main {
    public static void main(String[] args) {

        Produto top = new Produto("Produto top",
                        "New Balance", 100);

        top.imprimir();
        top.aumentarPreco(10);
        top.imprimir();

        System.out.println("Preço : R$ " + top.getPreco());
        top.setNome("");
        top.imprimir();

    }
}



