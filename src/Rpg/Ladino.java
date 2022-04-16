package Rpg;

public class Ladino extends Humanoide {
	
	public Ladino() {
		ID = "Luma";
		vidaMax = 10;
		energia = 4;
		pExp = 0;
		level = 1;
		defensa = "Escudo" ;
	}
	
	@Override
	public Humanoide Clone() {
		return new Ladino();
	}

}
