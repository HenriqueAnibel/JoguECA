
public class MelECA extends BotECA{
	
	public MelECA() {
		super.ataque = 9;
		super.defesa = 5;
	}
	
	public void celebrar () {
		System.out.println("\nMelECA: Achei f�cil ! *arrota*");
	}
	
	public void morrer() {
		System.out.println("\nMelECA: Estou me afogando no meu pr�prio lixo...");
	}

}
