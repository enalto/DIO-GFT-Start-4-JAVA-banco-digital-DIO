public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Joaquim da silva", "joaquim@gmail.com");
        IConta conta1 = new ContaCorrente(cliente1);
        conta1.depositar(1000);
        conta1.depositar(500);
        conta1.sacar(100);

        Cliente cliente2 = new Cliente("Jose da silva", "jose@gmail.com");
        IConta conta2 = new ContaCorrente(cliente2);
        conta2.depositar(5000);
        conta2.depositar(750);
        conta2.sacar(200);

        conta1.extrato();

        conta2.extrato();


    }
}
