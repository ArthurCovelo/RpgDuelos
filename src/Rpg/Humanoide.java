package Rpg;

import java.util.Random;

public abstract class Humanoide {
	static boolean[] defendendo = new boolean[2];
	static boolean[] atacando = new boolean[2];
	static Random sorteardefesa = new Random();
	static Random sortearatacar = new Random();
	boolean defesa = false;
	boolean atacar = false;
	String defensa;
	int energia;
	int pExp;
	int level;
	protected int vidaMax;
	int vida;
	String ID;
	
	public void Curar() {
		vida = vidaMax;	
	}

	public void Ataque(Humanoide alvo) {

		alvo.defesa = Sorteio("D");
		atacar = true;
		
		if(alvo.defesa == false && (alvo.vida >= 1 && vida >= 1))
		{
			alvo.vida -= energia;
			System.out.println(ID + " atacou com " + energia + " de dano e deixou " + alvo.ID + " com " + alvo.vida + " de vida");
		}
		else if(alvo.vida >= 1 && vida >= 1)
			System.out.println(alvo.ID + " atacou e " + ID + " defendeu com " + defensa + " e vida atual do " + ID + ": " + vida);
		
	}
	public void Defender(Humanoide alvo)
	{
		defesa = Sorteio("D");
		alvo.atacar = Sorteio("A");
		
		
		if(defesa == false && alvo.atacar == true && (alvo.vida >= 1 && vida >= 1))
		{
			vida -= energia;
			
			System.out.println( ID + " não defendeu e o " + alvo.ID + " atacou com " + alvo.energia + " de dano e deixou " + ID + " com " + vida + " de vida");
		}
		else if(alvo.vida >= 1 && vida >= 1)
		{
			System.out.println(alvo.ID + " atacou e " + ID + " defendeu com " + defensa + " e vida atual do " + ID + ": " + vida);
		}
	}
	
	private static boolean Sorteio(String escolher)
	{
		boolean _sortear = false;
		
		defendendo[0] = true;
		defendendo[1] = false;
		
		atacando[0] = true;
		atacando[1] = false;
		
		switch (escolher) 
		{
			case "D": {
				
				_sortear = defendendo[sorteardefesa.nextInt(defendendo.length)];
			}
			case "A": {
				
				_sortear =  atacando[sortearatacar.nextInt(atacando.length)];
			}
		}
	
		
		return _sortear;
	}
	
	public abstract Humanoide Clone();
}
