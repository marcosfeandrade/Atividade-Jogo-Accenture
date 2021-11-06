package main.java.br.jogo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainJogo {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("00/00/0000");
        List <Jogador> jogadores1 = reservasTime1();
        List <Jogador> relacionados1 = relacionadosTime1();
        List <Jogador> jogadores2 = reservasTime2();
        List <Jogador> relacionados2 = relacionadosTime2();
//===================================================================================
        data = formatoData.parse("21/09/1950");
        Time sport = time("Sport", "Selecao", data, jogadores1, relacionados1);
        data = formatoData.parse("11/07/1930");
        Time paris = time("Paris", "PSG", data, jogadores2, relacionados2);
//===================================================================================
        // jogo
        data = formatoData.parse("10/01/2021");
		Jogo jogo = new Jogo(sport, paris, data, "Ilha", "Recife", 0, 0);
		System.out.println("==========");
		jogo.gerarLesoes();
		System.out.println("==========");
		jogo.gerarCartoes();
		System.out.println("==========");
		jogo.gerarResultado();
		System.out.println(jogo.toString());
		System.out.println("==========");
	}
	
	public static void exibirJogador(Jogador jogador){
        if(jogador.isSuspenso()){
        System.out.println(jogador.getNome() + " está suspenso.");
        }
        System.out.println("Informações do jogador: " 
        + "\nID: " + jogador.getId() 
        + "\nNome: " + jogador.getNome() 
        + "\nApelido: " + jogador.getApelido()
        + "\nData: " + jogador.getDataNascimento()
        + "\nNumero: " + jogador.getNumero()
        + "\nPosição: " + jogador.posicao
        + "\nQualidade: " + jogador.getQualidade()
        + "\nSuspenso: " + jogador.isSuspenso());
    }
	
	public static List<Jogador> relacionadosTime1() throws ParseException {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("00/00/0000");
        data = formatoData.parse("26/10/1985");
        Jogador jogador1 = new Jogador(1, "Marcos Andrade", "Marquinhos", data, 7, "Zagueiro", 10, 0, false);
        data = formatoData.parse("27/01/2003");
        Jogador jogador2 = new Jogador(2, "José Sabino", "Sabino", data, 8, "Zagueiro", 9, 0, false);
        data = formatoData.parse("15/12/1998");
        Jogador jogador3 = new Jogador(3, "Sergio Ramos", "Sergio Ramos", data, 10, "Zagueiro", 7, 0, false);
        data = formatoData.parse("25/07/1967");
        Jogador jogador4 = new Jogador(4, "Thiago Emiliano", "Thiago Silva", data, 12, "Zagueiro", 5, 0, false);
        data = formatoData.parse("27/10/2000");
        Jogador jogador5 = new Jogador(5, "Neymar Junior", "Neymar", data, 5, "Meia", 8, 0, false);
        data = formatoData.parse("26/10/1985");
        Jogador jogador6 = new Jogador(6, "Ronaldo Moreira", "Ronaldinho", data, 1, "Meia", 6, 0, false);
        data = formatoData.parse("12/01/2000");
        Jogador jogador7 = new Jogador(7, "Mohamed Salah", "Salah", data, 15, "Ponta", 6, 0, false);
        data = formatoData.parse("05/05/1990");
        Jogador jogador8 = new Jogador(8, "Antony Matheus", "Antony", data, 17, "Ponta", 6, 0, false);
        data = formatoData.parse("07/09/1950");
        Jogador jogador9 = new Jogador(9, "Lionel Messi", "Messi", data, 23, "Atacante", 8, 0, false);
        data = formatoData.parse("28/11/1978");
        Jogador jogador10 = new Jogador(10, "Alessandro Beti", "Magrão", data, 25, "Goleiro", 5, 0, false);
        data = formatoData.parse("13/08/1979");
        Jogador jogador11 = new Jogador(11, "Richarlison de Andrade", "Richarlison", data, 32, "Atacante", 4, 0, false);
        
        return List.of(jogador1, jogador2, jogador3, jogador4, jogador5, jogador6,
        		jogador7, jogador8, jogador9, jogador10, jogador11);
	}
	
	public static List<Jogador> relacionadosTime2() throws ParseException {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("00/00/0000");
		data = formatoData.parse("27/01/2003");
        Jogador jogador24 = new Jogador(1, "Andrade Marcos", "Marcão", data, 7, "Zagueiro", 10, 0, false);
        data = formatoData.parse("10/06/1996");
        Jogador jogador25 = new Jogador(2, "Sabino José", "José", data, 8, "Zagueiro", 10, 0, false);
        data = formatoData.parse("15/12/1998");
        Jogador jogador26 = new Jogador(3, "Ramos Sergio", "Ramos", data, 10, "Zagueiro", 10, 0, false);
        data = formatoData.parse("25/07/1967");
        Jogador jogador27 = new Jogador(4, "Emiliano Thiago", "Emiliano", data, 12, "Zagueiro", 10, 0, false);
        data = formatoData.parse("27/10/2000");
        Jogador jogador28 = new Jogador(5, "Junior Neymar", "Junior", data, 5, "Meia", 10, 0, false);
        data = formatoData.parse("26/10/1985");
        Jogador jogador29 = new Jogador(6, "Moreira Ronaldo", "Moreira", data, 1, "Meia", 10, 0, false);
        data = formatoData.parse("12/01/2000");
        Jogador jogador30 = new Jogador(7, "Salah Mohamed", "Mohamed", data, 15, "Ponta", 10, 0, false);
        data = formatoData.parse("05/05/1990");
        Jogador jogador31 = new Jogador(8, "Matheus Antony", "Matheus", data, 17, "Ponta", 10, 0, false);
        data = formatoData.parse("07/09/1950");
        Jogador jogador32 = new Jogador(9, "Messi Lionel", "Lionel", data, 23, "Atacante", 10, 0, false);
        data = formatoData.parse("28/11/1978");
        Jogador jogador33 = new Jogador(10, "Beti Alessandro", "Magrinho", data, 25, "Goleiro", 10, 0, false);
        data = formatoData.parse("13/08/1979");
        Jogador jogador34 = new Jogador(11, "Andrade de Richarlison", "Andrade", data, 32, "Atacante", 10, 0, false);
        
        return List.of(jogador24, jogador25, jogador26, jogador27, jogador28, jogador29,
        		jogador30, jogador31, jogador32, jogador33, jogador34);
	}
	
	public static List<Jogador> reservasTime1() throws ParseException {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("00/00/0000");
        Jogador jogador35 = new Jogador(12, "Luiz David", "David", data, 7, "Zagueiro", 10, 0, false);
        data = formatoData.parse("10/06/1996");
        data = formatoData.parse("28/11/1978");
        Jogador jogador12 = new Jogador(12, "David Luiz", "David Luiz", data, 7, "Zagueiro", 4, 0, false);
        data = formatoData.parse("10/06/1996");
        Jogador jogador13 = new Jogador(13, "José Sabino", "Sabino", data, 8, "Zagueiro", 5, 0, false);
        data = formatoData.parse("15/12/1998");
        Jogador jogador14 = new Jogador(14, "Presnel Kimpembe", "Kimpembe", data, 10, "Zagueiro", 6, 0, false);
        data = formatoData.parse("25/07/1967");
        Jogador jogador15 = new Jogador(15, "Thilo Kehrer", "Kehrer", data, 12, "Zagueiro", 4, 0, false);
        data = formatoData.parse("27/10/2000");
        Jogador jogador16 = new Jogador(16, "Julian Draxler", "Draxler", data, 5, "Meia", 4, 0, false);
        data = formatoData.parse("26/10/1985");
        Jogador jogador17 = new Jogador(17, "Marco Verratti", "Verratti", data, 1, "Meia", 4, 0, false);
        data = formatoData.parse("12/01/2000");
        Jogador jogador18 = new Jogador(18, "Mário Sérgio Santos", "Marinho", data, 15, "Ponta", 5, 0, false);
        data = formatoData.parse("05/05/1990");
        Jogador jogador19 = new Jogador(19, "Renyer Luan", "Renyer", data, 17, "Atacante", 6, 0, false);
        data = formatoData.parse("07/09/1950");
        Jogador jogador20 = new Jogador(20, "Gabriel Barbosa", "Gabigol", data, 23, "Atacante", 6, 0, false);
        data = formatoData.parse("28/11/1978");
        Jogador jogador21 = new Jogador(21, "Weverton Pereira", "Weverton", data, 25, "Goleiro", 5, 0, false);
        data = formatoData.parse("13/08/1979");
        Jogador jogador22 = new Jogador(22, "Sergio Aguero", "Aguero", data, 32, "Atacante", 5, 0, false);
        data = formatoData.parse("13/08/1979");
        Jogador jogador23 = new Jogador(23, "Ansu Fati", "Fati", data, 32, "Atacante", 4, 0, false);
        
        return List.of(jogador12, jogador13, jogador14, jogador15, jogador16, jogador17,
        		jogador18, jogador19, jogador20, jogador21, jogador22, jogador23);
	}
	
	public static List<Jogador> reservasTime2() throws ParseException {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("00/00/0000");
        Jogador jogador35 = new Jogador(12, "Luiz David", "David", data, 7, "Zagueiro", 10, 0, false);
        data = formatoData.parse("10/06/1996");
		data = formatoData.parse("10/06/1996");
        Jogador jogador36 = new Jogador(13, "Sabino José", "José", data, 8, "Zagueiro", 10, 0, false);
        data = formatoData.parse("15/12/1998");
        Jogador jogador37 = new Jogador(14, "Kimpembe Presnel", "Presnel", data, 10, "Zagueiro", 10, 0, false);
        data = formatoData.parse("25/07/1967");
        Jogador jogador38 = new Jogador(15, "Kehrer Thilo", "Thilo", data, 12, "Zagueiro", 10, 0, false);
        data = formatoData.parse("27/10/2000");
        Jogador jogador39 = new Jogador(16, "Draxler Julian", "Julian", data, 5, "Meia", 10, 0, false);
        data = formatoData.parse("26/10/1985");
        Jogador jogador40 = new Jogador(17, "Verratti Marco", "Marco", data, 1, "Meia", 10, 0, false);
        data = formatoData.parse("12/01/2000");
        Jogador jogador41 = new Jogador(18, "Sérgio Santos Mário", "Sérgio", data, 15, "Ponta", 10, 0, false);
        data = formatoData.parse("05/05/1990");
        Jogador jogador42 = new Jogador(19, "Luan Renyer", "Luan", data, 17, "Atacante", 10, 0, false);
        data = formatoData.parse("07/09/1950");
        Jogador jogador43 = new Jogador(20, "Barbosa Gabriel", "Barbosa", data, 23, "Atacante", 10, 0, false);
        data = formatoData.parse("28/11/1978");
        Jogador jogador44 = new Jogador(21, "Pereira Weverton", "Pereira", data, 25, "Goleiro", 10, 0, false);
        data = formatoData.parse("13/08/1979");
        Jogador jogador45 = new Jogador(22, "Aguero Sergio", "Sergio", data, 32, "Atacante", 10, 0, false);
        data = formatoData.parse("13/08/1979");
        Jogador jogador46 = new Jogador(23, "Fati Ansu", "Ansu", data, 32, "Atacante", 10, 0, false);
        
        return List.of(jogador35, jogador36, jogador37, jogador38, jogador39, jogador40, jogador41,
        		jogador42, jogador43, jogador44, jogador45, jogador46);
	}
	
	public static Time time(String nome, String apelido, Date fundacao, List<Jogador> reservas, List<Jogador> relacionados) {
		List<Jogador> plantel = new ArrayList<Jogador>();
		plantel.addAll(relacionados);
		plantel.addAll(reservas);
		Time time = new Time(nome, apelido, fundacao, plantel, relacionados);
		return time;
	}

}
