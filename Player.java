package guessing.Game;

import java.util.Scanner;

class Player{
	int playerNumber;
	int PlayerNumber() {
		System.out.println("player please guess the number between 1 and 10");
		Scanner sc=new Scanner(System.in);
	    playerNumber=sc.nextInt();
	    if(playerNumber>0&&playerNumber<10) {
		    return playerNumber;
	    }
	    else {
	    	System.out.println("please choose the number correctly");
			return PlayerNumber();
		}
}
}
