package Rpg;

public class Templario extends Humanoide {
	
	public Templario() {
		ID = "Luma";
		vidaMax = 10;
		energia = 4;
		pExp = 0;
		level = 1;
		defensa = "Espada";
	}
	
	@Override
	public Humanoide Clone() {
		// TODO Auto-generated method stub
		return new Templario();
	}


}
