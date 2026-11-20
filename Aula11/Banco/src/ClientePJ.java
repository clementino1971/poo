public class ClientePJ extends Cliente{
    String cnpj;

    ClientePJ(String agencia_parametro,
              String contaCorrente_parametro,
              double saldo_parametro,
              String cnpj_parametro){
        super(agencia_parametro,contaCorrente_parametro,saldo_parametro);
        cnpj = cnpj_parametro;
    }
}
