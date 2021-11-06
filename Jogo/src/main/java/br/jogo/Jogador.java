package main.java.br.jogo;
import java.util.Date;
import java.util.Random;

public class Jogador {
    int id;
    String nome;
    String apelido;
    Date dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoes;
    boolean suspenso;
    boolean treinamentoConcluido;

    public Jogador() {

    }

    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade,
            int cartoes, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
    }
    
    public boolean verificarCondicaoDeJogo(){
        if(cartoes == 3 || suspenso){
            return false;
        }
        return true;
    }

    public void aplicarCartao(int qtd){
        cartoes += qtd;
        if(!verificarCondicaoDeJogo()) {
            suspenso = true;
        }
    }

    public void cumprirSuspencao() {
        cartoes = 0;
        suspenso = false;
    }

    public void sofrerLesao(int lesao) {
        int qualidadeFinal = qualidade;

        switch(lesao + 1){
            case 1:
            qualidadeFinal -= qualidadeFinal * 0.15;
            break;

            case 2:
            qualidadeFinal -= qualidadeFinal * 0.10;
            break;

            case 3:
            qualidadeFinal -= qualidadeFinal * 0.05;
            break;

            case 4:
            qualidadeFinal -= 2;
            break;

            default:
            qualidadeFinal -= 1;
            break;
            }
            if(qualidadeFinal >= 0){
                qualidade = qualidadeFinal;
            } else {
                System.out.println("Qualidade final não pode ser inferior a 0");
            }
        }

        public void executarTreinamento() {
            Random treinamento = new Random();
            if(treinamentoConcluido){
                System.out.println("O treinamento ja foi concluido");
            } else {
                if(treinamento.nextInt(100) <= 5){
                    qualidade += 5;
                } else if(treinamento.nextInt(100) > 5 && treinamento.nextInt(100) <= 10){
                    qualidade += 4;
                } else if(treinamento.nextInt(100) > 10 && treinamento.nextInt(100) <= 15){
                    qualidade += 3;
                } else if(treinamento.nextInt(100) > 15 && treinamento.nextInt(100) <= 30){
                    qualidade += 2;
                } else if(treinamento.nextInt(100) > 30 && treinamento.nextInt(100) <= 40){
                    qualidade += 1;
                }
            }
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getApelido() {
            return apelido;
        }

        public void setApelido(String apelido) {
            this.apelido = apelido;
        }

        public Date getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getPosicao() {
            return posicao;
        }

        public void setPosicao(String posicao) {
            this.posicao = posicao;
        }

        public int getQualidade() {
            return qualidade;
        }

        public void setQualidade(int qualidade) {
            this.qualidade = qualidade;
        }

        public int getCartoes() {
            return cartoes;
        }

        public void setCartoes(int cartoes) {
            this.cartoes = cartoes;
        }

        public boolean isSuspenso() {
            return suspenso;
        }

        public void setSuspenso(boolean suspenso) {
            this.suspenso = suspenso;
        }

        public boolean isTreinamentoConcluido() {
            return treinamentoConcluido;
        }

        public void setTreinamentoConcluido(boolean treinamentoConcluido) {
            this.treinamentoConcluido = treinamentoConcluido;
        }
}
