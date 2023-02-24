
public class SonECA extends BotECA{
	
	public SonECA() {
		super.ataque = 4;
		super.defesa = 9;
	}
	
	public void celebrar() {
		System.out.println("\nSonECA: Finalmente posso dormir !");
	}
	
	public void morrer() {
		System.out.println("\nSonECA: Devia ter dormido antes...");
	}

}
