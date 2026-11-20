public abstract class Cliente {
    String agencia;
    String contaCorrente;
    double saldo;

    Cliente(){

    }

    Cliente(String agencia_parametro,
            String contaCorrente_parametro, double saldo_parametro){
        agencia = agencia_parametro;
        contaCorrente = contaCorrente_parametro;
        saldo = saldo_parametro;
    }

    public double getSaldo() {
        return saldo;
    }
}
