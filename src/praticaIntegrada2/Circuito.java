package praticaIntegrada2;

import java.util.List;

public class Circuito {

    private String nome;
    private int km;
    private double valorCrianca;
    private double valorAdulto;
    List<Participante> listaDeParticipantes;

    public List<Participante> getListaDeParticipantes() {
        return listaDeParticipantes;
    }

    public void setListaDeParticipantes(List<Participante> listaDeParticipantes) {
        this.listaDeParticipantes = listaDeParticipantes;
    }

    public double getValorCrianca() {
        return valorCrianca;
    }

    public void setValorCrianca(double valorCrianca) {
        this.valorCrianca = valorCrianca;
    }

    public double getValorAdulto() {
        return valorAdulto;
    }

    public void setValorAdulto(double valorAdulto) {
        this.valorAdulto = valorAdulto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
