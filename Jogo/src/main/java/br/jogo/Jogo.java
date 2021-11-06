package main.java.br.jogo;

import java.util.Date;
import java.util.Random;
import org.junit.*;

public class Jogo {
    private Time mandante;
    private Time visitante;
    private Date dataDoJogo;
    private String estadio;
    private String cidade;
    private Integer placarMandante;
    private Integer placarVisitante;

    public Jogo () {

    }

    public Jogo(Time mandante, Time visitante, Date dataDoJogo, String estadio, String cidade, Integer placarMandante,
            Integer placarVisitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.dataDoJogo = dataDoJogo;
        this.estadio = estadio;
        this.cidade = cidade;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
    }

    public void gerarResultado() {
    	boolean timeVenceu = false;
        ProbabilidadesEnum p = ProbabilidadesEnum.A;
        Random random = new Random();
        int diferencaQualidade;

        int somaMandante = mandante.getRelacionados()
        .stream()
        .mapToInt(jogador -> jogador.getQualidade())
        .sum();
        int somaVisitante = visitante.getRelacionados()
        .stream()
        .mapToInt(jogador -> jogador.getQualidade())
        .sum();

        

        if(somaMandante >= somaVisitante){ // P/ mandante
        diferencaQualidade = somaMandante - somaVisitante;
        if(diferencaQualidade <= 10){
            p = ProbabilidadesEnum.A;
        } else if(diferencaQualidade <= 20 && diferencaQualidade > 10) {
            p = ProbabilidadesEnum.B;
        } else if(diferencaQualidade <= 30 && diferencaQualidade > 20) {
            p = ProbabilidadesEnum.C;
        } else if(diferencaQualidade <= 40 && diferencaQualidade > 30){
            p = ProbabilidadesEnum.D;
        }
        for(int i = 0; i < p.getProbabilidade(); i++){ // A quantidade de sorteio será com base na diferença de vantagem das equipes
            if(random.nextInt(10) == 5){ // Sorteia os numeros
                timeVenceu = true;
                break;
            }
        } 
        if(timeVenceu) {
        	System.out.println("Time da casa venceu!!");
        } else {
        	System.out.println("Time visitante venceu!!");
        }
        } else if (somaMandante < somaVisitante) { // P/ visitante
            diferencaQualidade = somaVisitante - somaMandante;
            if(diferencaQualidade <= 10){
                p = ProbabilidadesEnum.A;
            } else if(diferencaQualidade <= 20 && diferencaQualidade > 10) {
                p = ProbabilidadesEnum.B;
            } else if(diferencaQualidade <= 30 && diferencaQualidade > 20) {
                p = ProbabilidadesEnum.C;
            } else if(diferencaQualidade <= 40 && diferencaQualidade > 30){
                p = ProbabilidadesEnum.D;
            }
            for(int i = 0; i < p.getProbabilidade(); i++){
                if(random.nextInt(10) == 5){
                    timeVenceu = true;
                    break;
                }
            }
            if(timeVenceu) {
            	System.out.println("Time visitante venceu!!");
            } else {
            	System.out.println("Time da casa venceu!!");
            }
        }
    }

    public void gerarLesoes() {
        Random random = new Random();
        int timeEJogadorEscolhido = random.nextInt(1);

        if(timeEJogadorEscolhido == 0){ // Para o time mandante
            timeEJogadorEscolhido = random.nextInt(mandante.getRelacionados().size()); // Gera o numero referente a um jogador do time
            mandante.getRelacionados().get(timeEJogadorEscolhido).sofrerLesao(random.nextInt(5)); //Aplica entre 0 e 4 lesões
        } else { // Para o time visitante
            timeEJogadorEscolhido = random.nextInt(visitante.getRelacionados().size());
            visitante.getRelacionados().get(timeEJogadorEscolhido).sofrerLesao(random.nextInt(5));
        }
    }

    public void gerarCartoes() {
        Random random = new Random();
        int qtdCartoesPorJogo = random.nextInt(11); // Gera a quantia de cartões que irá ter no jogo
        int timeEJogadorEscolhido;
        for(int i = 0; i < qtdCartoesPorJogo; i++){
        timeEJogadorEscolhido = random.nextInt(1);

        if(timeEJogadorEscolhido == 0){ // Para o time mandante
            timeEJogadorEscolhido = random.nextInt(mandante.getRelacionados().size()); // Gera o numero referente a um jogador do time
            if(verificarAptidaoParaPenalizacao(mandante.getRelacionados().get(timeEJogadorEscolhido))){ // Verifica se o jogador pode receber cartões
            mandante.getRelacionados().get(timeEJogadorEscolhido).aplicarCartao(random.nextInt(3)); //Aplica entre 0 e 2 cartões
            } else { // Caso o jogador não possa receber mais cartões, outro cartão é escolhido no lugar dele
                i--;
            }
        } else { // Para o time visitante
            timeEJogadorEscolhido = random.nextInt(visitante.getRelacionados().size());
            if(verificarAptidaoParaPenalizacao(mandante.getRelacionados().get(timeEJogadorEscolhido))){
            visitante.getRelacionados().get(timeEJogadorEscolhido).aplicarCartao(random.nextInt(3));
            } else {
                i--;
            }
        }
    }
    }

    private boolean verificarAptidaoParaPenalizacao(Jogador jogadorPenalizado){ // Verifica  se o jogador será suspenso
            if(jogadorPenalizado.getCartoes() < 3){ // Jogador apto para receber mais cartões
                return  true;
            }
        return false;
    }

    public void permitirTreinamento() {
        mandante.getPlantel()
        .stream()
        .forEach(jogador -> jogador.setTreinamentoConcluido(false));
        visitante.getPlantel()
        .stream()
        .forEach(jogador -> jogador.setTreinamentoConcluido(false));
    }

    @Override
    public String toString() {
        return "Jogo no estadio " + estadio + " (" + cidade + "), ocorrerah " + dataDoJogo + "\nResultados:" +
                "\n- Mandante:" + mandante + " - " + placarMandante +
                "\n- Visitante: " + visitante + " - " + placarVisitante;
    }
}
