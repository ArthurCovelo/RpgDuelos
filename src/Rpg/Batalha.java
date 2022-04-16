package Rpg;

import java.util.Random;

public class Batalha {
	private static final int _Max_time = 1000;
	
	Humanoide ganhador;
	public Batalha(Random sortear, Humanoide player1, Humanoide player2) {
		player1.Curar();
		player2.Curar();
		while(player1.vida > 0 && player2.vida > 0) {
			player1.Ataque(player2);	
			 EsperaTempo();
			player2.Defender(player1);	
			 EsperaTempo();
			player2.Ataque(player1);
			 EsperaTempo();
			player1.Defender(player2);
			 EsperaTempo();
		}
		if (player1.vida > 0) {
			System.out.println(player1.ID + " Ganhou!!!");
			ganhador = player1;
		}
		else if (player2.vida > 0) {
			System.out.println(player2.ID + " Ganhou!!!");
			ganhador = player2;
		}
		else if(sortear.nextBoolean()) {
			System.out.println(player1.ID + " ganhou em Empate!!!");
			ganhador = player1;
			}
			else {
			System.out.println(player2.ID + " ganhou em Empate!!!");
			ganhador = player2;
			}
	}
	private void EsperaTempo() {
        int tempo = (int) (Math.random() * _Max_time);
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
    }
}
