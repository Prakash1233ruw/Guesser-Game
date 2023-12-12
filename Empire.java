package guessing.Game;

import java.util.Scanner;

class Empire{
	int numFromGuessor;
	int numFromP1;
	int numFromP2;
	int numFromP3;
   void collectNumFromGuessor() {
	   Guesser g=new Guesser();
	   numFromGuessor=g.guesserNumber();
   }
   void collectNumFromPlayers() {
	   Player p1=new Player();
	   numFromP1=p1.PlayerNumber();
	   Player p2=new Player();
	   numFromP2=p2.PlayerNumber();
	   Player p3=new Player();
	   numFromP3=p3.PlayerNumber();
   }
   void compare() {
	   if(numFromGuessor==numFromP1) {
		   if(numFromGuessor==numFromP1&&numFromGuessor==numFromP2) {
			 if(  numFromGuessor==numFromP1&&numFromGuessor==numFromP1&&numFromGuessor==numFromP2) {
				 System.out.println("p1 ,p2 and p3 are winners");
			 }else
			   System.out.println("p1 and p2  are winners");
		   }else
		   System.out.println("p1 is winner");
	   }
	   else if(numFromGuessor==numFromP2) {
		   if(numFromGuessor==numFromP2&&numFromGuessor==numFromP3) {
			   System.out.println("p2 and p3 are winners");
		   }else
		   System.out.println("p2 is winner");
	   }else
		   System.out.println("p3 is winner");
	   }
   
  public  void restart() {
	  System.out.println("wanna play the game again then type Y ");
	  Scanner scanner=new Scanner(System.in);
		String choice=scanner.nextLine();
		if(choice.equalsIgnoreCase("Y")) {
		Empire decision2=new Empire();
		decision2.collectNumFromGuessor();
		decision2.collectNumFromPlayers();
		decision2.compare();
		}else {
			System.out.println("thank u for playing");
		}
   }
   }


