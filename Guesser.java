package guessing.Game;

import java.util.Scanner;

class Guesser{
	int number;
	int guesserNumber() {
		System.out.println("Guessor please guess the number between 1 and 10");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		if(number>0&&number<10) {
		    return number;
		}
		else {
			System.out.println("please choose the number correctly");
			return guesserNumber();
		}
	}
}
