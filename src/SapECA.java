
public class SapECA extends BotECA{
	
	public SapECA() {
		super.ataque = 8;
		super.defesa = 6;
	}
	
	public void celebrar() {
		System.out.println("\nSapECA: Vit�ria !!!");
	}
	
	public void morrer() {
		System.out.println("\nSapECA: Oh n�o...");
	}

}
