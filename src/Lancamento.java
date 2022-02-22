import java.time.LocalDate;

public class Lancamento {
    private LocalDate data;
    private Conta conta;
    private String operacaoConta;
    private double valor;

    public Lancamento(LocalDate data, Conta conta, String operacaoConta, double valor){
        this.conta=conta;
        this.data=data;
        this.operacaoConta=operacaoConta;
        this.valor=valor;
    }

    public LocalDate getData() {
        return data;
    }

    public Conta getConta() {
        return conta;
    }

    public String getOperacaoConta() {
        return operacaoConta;
    }

    public double getValor() {
        return valor;
    }


}
