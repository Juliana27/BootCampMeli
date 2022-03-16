package praticaIntegradora5.exercicio1;

public class Deposito implements Transacao {

    @Override
    public boolean transacaoOK() {
        return false;
    }

    @Override
    public boolean trasacaoNaoOk() {
        return false;
    }
}
