package Rpg;

public class Mago extends Humanoide {
	
	public Mago() {
		ID = "Mago";
		vidaMax = 10;
		energia = 5;
		pExp = 0;
		level = 1;
		defensa = "Escudo mágico" ;
	}
	
	@Override
	public Humanoide Clone() {
		return new Mago();
	}


}
