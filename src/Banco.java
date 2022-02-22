import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas=new ArrayList<>();

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public void listarContas(){
        System.out.println("Clientes do banco");
        for(Conta conta: contas){
            System.out.println("Cliente "+conta.cliente.getNome()+" Conta: "+conta.numero);
        }
    }
}
