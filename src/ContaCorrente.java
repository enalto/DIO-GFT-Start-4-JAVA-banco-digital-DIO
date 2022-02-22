public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente){
        super(cliente);
        super.numero = SEQUENCIAL++;

    }

}
