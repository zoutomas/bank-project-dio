package desafioBanco;

public class Main {
    public static void main(String[] args) {
        Cliente zou = new Cliente();
        zou.setNome("ZOU");

        Conta cc = new ContaCorrente(zou);
        Conta poupanca = new ContaPoupanca(zou);


        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}