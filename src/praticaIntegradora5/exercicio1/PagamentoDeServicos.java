package praticaIntegradora5.exercicio1;

public class PagamentoDeServicos implements Transacao {

    @Override
    public boolean transacaoOK() {
        return false;
    }

    @Override
    public boolean trasacaoNaoOk() {
        return false;
    }
}
