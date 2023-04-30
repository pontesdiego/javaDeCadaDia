package teacher_tim;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int quantity = 0;
		String playerName;
		int playerScore;

		System.out.println("Digite a quantidade de jogadores: ");
		int players = sc.nextInt();
		sc.nextLine(); 

		do {

		    System.out.println("Digite seu nome: ");
		    playerName = sc.nextLine();

		    System.out.println("Digite Seu Score: ");
		    playerScore = sc.nextInt();
		    sc.nextLine();
		    
		    if(players > 1) {
		    	
		   System.out.println("Score do player computado..... digite o próximo");
		   System.out.println("");
		   
		    }
		    
            quantity++;
                                 
		} while (quantity < players);
		
		
		
		int highScorePosition = calculateHighScorePosition(playerScore);
		
		displayHighScorePosition(playerName, highScorePosition);

		sc.close();

	}
	
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " está na posição : " + 
	         highScorePosition);
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		}
		else if (playerScore > 500) {
			return 2;
		}
		else if (playerScore > 500) {
			return 3;
		}
		else {
			return 4;
		}
		
	}

}
