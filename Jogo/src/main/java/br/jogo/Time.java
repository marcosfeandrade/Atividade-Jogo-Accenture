package main.java.br.jogo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Time {
    private String nome;
    private String apelido;
    private Date fundacao;
    private List<Jogador> plantel;
    private List<Jogador> relacionados;

    public Time(){

    }

    public Time(String nome, String apelido, Date fundacao, List<Jogador> plantel,
            List<Jogador> relacionados) {
        this.nome = nome;
        this.apelido = apelido;
        this.fundacao = fundacao;
        this.plantel = plantel;
        this.relacionados = relacionados;
    }

    public List<Jogador> relacionarJogadores (){
        plantel.sort(Comparator.comparing(Jogador::getQualidade).reversed());
        for(int i = 0; i <= 10; i++){
            relacionados.add(plantel.get(i));
        }
        return relacionados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getPlantel() {
        return plantel;
    }

    public void setPlantel(ArrayList<Jogador> plantel) {
        this.plantel = plantel;
    }

    public List<Jogador> getRelacionados() {
        return relacionados;
    }

    public void setRelacionados(ArrayList<Jogador> relacionados) {
        this.relacionados = relacionados;
    }

    @Override
    public String toString() {
        return "Time [apelido=" + apelido + ", fundacao=" + fundacao + ", nome=" + nome + ", plantel=" + plantel
                + ", relacionados=" + relacionados + "]";
    }
}
