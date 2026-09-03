public class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    ContaBancaria(int numero_conta, String nome_titular){
        numero = numero_conta;
        titular = nome_titular;
        saldo = 0;
    }

    void exibirResumo(){
        System.out.println("####################");
        System.out.println("Número da Conta:" + numero);
        System.out.println("Títular:" + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("####################");
    }

    boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }else{
            saldo = saldo + valor;
            return true;
        }
    }

    boolean sacar(double valor){
        if(valor > saldo){
            return false;
        }else{
            saldo = saldo - valor;
            return true;
        }
    }

}









