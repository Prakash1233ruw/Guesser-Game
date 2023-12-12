package guessing.Game;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Empire decision=new Empire();
	decision.collectNumFromGuessor();
	decision.collectNumFromPlayers();
	decision.compare();
	decision.restart();
	
}
}
