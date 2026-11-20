public class ClientePF extends Cliente{
    String cpf;

    ClientePF(String agencia_parametro,
              String contaCorrente_parametro,
              double saldo_parametro,
              String cpf_parametro){
        super();
        agencia = agencia_parametro;
        contaCorrente = contaCorrente_parametro;
        saldo = saldo_parametro;
        cpf = cpf_parametro;
    }
}
