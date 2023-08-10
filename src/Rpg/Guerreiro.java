package Rpg;

public class Guerreiro extends Humanoide {
	
	public Guerreiro() {
		ID = "Guerreiro";
		vidaMax = 10;
		energia = 4;
		pExp = 0;
		level = 1;
		defensa = "Armadura";
	}

	@Override
	public Humanoide Clone() {
		return new Guerreiro();
	}

}
