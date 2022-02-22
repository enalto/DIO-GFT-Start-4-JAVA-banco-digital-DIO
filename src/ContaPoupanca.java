public class ContaPoupanca extends Conta{

    private static int SEQUENCIA=1;

    public ContaPoupanca(Cliente cliente){
        super(cliente);
        super.agencia=Conta.AGENCIA;
        super.numero=SEQUENCIA++;
    }
}
