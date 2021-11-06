package main.java.br.jogo;
public enum ProbabilidadesEnum {
    A(6), B(7), C(8), D(9);
    //60%, 70%, 80%, 90%

    private int probabilidade;

    ProbabilidadesEnum(int probabilidade) {
        this.probabilidade = probabilidade;
    }

    public int getProbabilidade(){
        return this.probabilidade;
    }
}