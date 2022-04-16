package Rpg;
import java.util.Scanner;
import javax.swing.*;
import java.util.Random;

public class Main {
	static Humanoide[] champions = new Humanoide[4];
	static Random sortear = new Random();	
	static int cont = 0;
	
	public static void main(String[] args) {
	
		
		champions[0] = new Ladino();
		champions[1] = new Guerreiro();
		champions[2] = new Templario();
		champions[3] = new Mago();	
		
		//Scanner entrar = new Scanner(System.in);
		
		System.out.println("---------------Batalha 1---------------");
		Batalha b1 = new Batalha(sortear, campeao(), campeao());
		
		//entrar.nextLine();		
		System.out.println("---------------Batalha 2---------------");
		Batalha b2 = new Batalha(sortear, campeao(), campeao());
		//entrar.nextLine();
		System.out.println("---------------Batalha 3---------------");
		Batalha b3 = new Batalha(sortear, campeao(), campeao());
		//entrar.nextLine();
		System.out.println("---------------Batalha 4---------------");
		Batalha b4 = new Batalha(sortear, campeao(), campeao());
		//entrar.nextLine();
		System.out.println("---------------Batalha Semi-Final ---------------");
		Batalha b5 = new Batalha(sortear, b1.ganhador, b2.ganhador);
		//entrar.nextLine();
		System.out.println("---------------Batalha Semi-Final ---------------");
		Batalha b6 = new Batalha(sortear, b3.ganhador, b4.ganhador);
		//entrar.nextLine();
		System.out.println("---------------Batalha Final ---------------");
		Batalha b7 = new Batalha(sortear, b5.ganhador, b6.ganhador);
		//entrar.nextLine();
		System.out.println("---------------Detalhes do Ganhador---------------");
		System.out.println(b7.ganhador.ID);
		System.out.println("Vida atual: " + b7.ganhador.vida);
		System.out.println("VidaMax: " + b7.ganhador.vidaMax);
		System.out.println("Dano: " + b7.ganhador.energia);
		System.out.println("Defesa: " + b7.ganhador.defensa);	

	}
	
	public static Humanoide campeao() {
		Humanoide novoChampions = champions[sortear.nextInt(champions.length)].Clone();
		novoChampions.ID += "(" + cont + ")";
		cont++;
		return novoChampions;
	}
	
    
}
