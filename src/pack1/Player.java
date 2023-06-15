package pack1;

import java.util.Scanner;

class Player{
	int playerNum;
	int guess() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the player guesse Number");
		playerNum=s.nextInt();
	return playerNum;
	

	}
}