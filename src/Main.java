public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Joaquim da silva", "joaquim@gmail.com");
        Conta conta1 = new ContaCorrente(cliente1);
        banco.adicionarConta(conta1);

        conta1.depositar(1000);
        conta1.depositar(500);
        conta1.sacar(100);

        Cliente cliente2 = new Cliente("Jose da silva", "jose@gmail.com");
        Conta conta2 = new ContaCorrente(cliente2);
        banco.adicionarConta(conta2);

        conta2.depositar(5000);
        conta2.depositar(750);
        conta2.sacar(200);

        banco.listarContas();

        conta1.extrato();
        conta2.extrato();


    }
}
