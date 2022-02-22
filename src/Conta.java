import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta{

    protected static final int AGENCIA=1;

    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected double saldo;
    protected double limite;
    protected List<Lancamento> lancamentos;

    Conta(Cliente cliente){
        this.cliente=cliente;
        if(lancamentos==null){
            lancamentos=new ArrayList<>();
        }
    }

    @Override
    public void sacar(double valor) {
        if(valor<=this.saldo+this.limite){
            lancamentos.add(new Lancamento(LocalDate.now(), this, "SAQUE", valor));
            this.saldo -= valor;
            return;
        }
        throw new RuntimeException("Saldo insuficiente.");
    }

    @Override
    public void depositar(double valor) {
        lancamentos.add(new Lancamento(LocalDate.now(), this, "DEPOSITO", valor));
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        lancamentos.add(new Lancamento(LocalDate.now(), this, "TRANSFERENCIA", valor));
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void extrato(){
        System.out.println("Extrato conta= "+this.numero);
        for (Lancamento lancamento: lancamentos) {
            System.out.println(lancamento.getData()+" "+lancamento.getOperacaoConta()+" "+lancamento.getValor());
        }
    }

}
