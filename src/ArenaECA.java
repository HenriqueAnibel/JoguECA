import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ArenaECA {
	
	private static Object Bot1;
	private static Object Bot2;
	static int round1P1 = 0;
	static int round1P2 = 0;
	static int round2P1 = 0;
	static int round2P2 = 0;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		System.out.println("\nPrecione '1' - MunhECA;\nPrecione '2' - SonECA;\nPrecione '3' - SapECA;\nPrecione '4' - MelECA;");
		
		/*
		 * Escolha de personagem do jogador 1.
		 */
		
		int numBot1;
		System.out.println("\nPlayer 1 escolha seu personagem:");
		Bot1 = new Scanner(System.in);
		numBot1 = ((Scanner) Bot1).nextInt();
		if(numBot1 == 1) {
			System.out.println("\nVocê escolheu MunhECA.\n");
		}
		if(numBot1 == 2) {
			System.out.println("\nVocê escolheu SonECA.\n");
		}
		if(numBot1 == 3) {
			System.out.println("\nVocê escolheu SapECA.\n");
		}
		if(numBot1 == 4) {
			System.out.println("\nVoce escolheu MelECA.\n");
		}
		
		switch(numBot1) {
		case 1:
			MunhECA munheca1 = new MunhECA();
			ArenaECA.Bot1 = munheca1;
			break;
			
		case 2:
			SonECA soneca1 = new SonECA();
			ArenaECA.Bot1 = soneca1;
			break;
			
		case 3:
			SapECA sapeca1 = new SapECA();
			ArenaECA.Bot1 = sapeca1;
			break;
			
		case 4:
			MelECA meleca1 = new MelECA();
			ArenaECA.Bot1 = meleca1;
			break;
		}
		
		/*
		 * Escolha de personagem do jogador 2.
		 */
		
		int numBot2;
		System.out.println("\n\nPlayer 2 escolha seu personagem:");
		Bot2 = new Scanner(System.in);
		numBot2 = ((Scanner) Bot2).nextInt();
		if(numBot2 == 1) {
			System.out.println("\nVocê escolheu MunhECA.\n");
		}
		if(numBot2 == 2) {
			System.out.println("\nVocê escolheu SonECA.\n");
		}
		if(numBot2 == 3) {
			System.out.println("\nVocê escolheu SapECA.\n");
		}
		if(numBot2 == 4) {
			System.out.println("\nVoce escolheu MelECA.\n");
		}
		
		switch(numBot2) {
		case 1:
			MunhECA munheca2 = new MunhECA();
			ArenaECA.Bot2 = munheca2;
			break;
			
		case 2:
			SonECA soneca2 = new SonECA();
			ArenaECA.Bot2 = soneca2;
			break;
			
		case 3:
			SapECA sapeca2 = new SapECA();
			ArenaECA.Bot2 = sapeca2;
			break;
			
		case 4:
			MelECA meleca2 = new MelECA();
			ArenaECA.Bot2 = meleca2;
			break;
		}
		
		System.out.println("\n\n\nQue a luta BotECA começe .....");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(" \n FIGHT!!!\n\n\n");
		
		Scanner move1;
		Scanner move2;
		
		//Scanner do jogador 1.
		System.out.println("\n'1' - Ataque;\n'2' - Defesa;\nPlayer 1 faça seu movimento !");		
		move1 = new Scanner(System.in);
		int numMove1 = move1.nextInt();
		
		switch(numMove1) {
		case 1:
			round1P1 = BotECA.ataque;
			System.out.println("\nVocê atacou.\n");
			break;
			
		case 2:
			round1P1 = BotECA.defesa;
			System.out.println("\nVocê defendeu.\n");
			break;
		}
		
		TimeUnit.SECONDS.sleep(1);
		
		//Scanner do jogador 2.
		System.out.println("\n'1' - Ataque;\n'2' - Defesa;\nPlayer 2 faça seu movimento !");
		move2 = new Scanner(System.in);
		int numMove2 = move2.nextInt();
		
		switch(numMove2) {
		case 1:
			round1P2 = BotECA.ataque;
			System.out.println("\nVocê atacou.\n");
			break;
			
		case 2:
			round1P2 = BotECA.defesa;
			System.out.println("\nVocê defendeu.\n");
			break;
		}
		
		//contadores do primeiro round.
		int contadorBot1r1 = round1P1 - round1P2;
		int contadorBot2r1 = round1P2 - round1P1;
		
		/*
		 * Round 2. 
		 */
		
		System.out.println("\n\nROUND 2 !\n\n");
		
		//Scanner do jogador 2.
		System.out.println("\n'1' - Ataque;\n'2' - Defesa;\nPlayer 2 faça seu movimento !");
		move2 = new Scanner(System.in);
		int numMove2r2 = move2.nextInt();
		
		switch(numMove2r2) {
		case 1:
			round2P2 = BotECA.ataque;
			System.out.println("\nVocê atacou.\n");
			break;
			
		case 2:
			round2P2 = BotECA.defesa;
			System.out.println("\nVocê defendeu.\n");
			break;
		}
		
		TimeUnit.SECONDS.sleep(1);
		
		//Scanner do jogador 1.
		System.out.println("\n'1' - Ataque;\n'2' - Defesa;\nPlayer 1 faça seu movimento !");		
		move1 = new Scanner(System.in);
		int numMove1r2 = move1.nextInt();
		
		switch(numMove1r2) {
		case 1:
			round2P1 = BotECA.ataque;
			System.out.println("\nVocê atacou.\n");
			break;
			
		case 2:
			round2P1 = BotECA.defesa;
			System.out.println("\nVocê defendeu.\n");
			break;
		}
		
		//contador do segundo round.
		int contadorBot1r2 = round2P1 - round2P2;
		int contadorBot2r2 = round2P2 - round2P1;
		
		//Soma dos pontos de ambos jogadores.
		int contadorB1 = contadorBot1r1 + contadorBot1r2;
		int contadorB2 = contadorBot2r1 + contadorBot2r2;
		
		if(contadorB1 > contadorB2) {
			System.out.println("\n\n\nPlayer 1 é o vencedor !!!\n");
			((BotECA) Bot1).celebrar();
			((BotECA) Bot2).morrer();
		}else {
			if(contadorB1 < contadorB2) {
				System.out.println("\n\n\nPlayer 2 é o vencedor !!!\n");
				((BotECA) Bot1).morrer();
				((BotECA) Bot2).celebrar();
			}
		}
		
	}
}
