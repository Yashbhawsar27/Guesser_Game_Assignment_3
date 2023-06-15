package pack1;

 import pack1.*;
class Empire{
	int guessNum1;
	int playerNum1;
	int playerNum2;
	int playerNum3;
	
	void guessingbyguesser()
	{
		while(true) {
		Guesser guess=new Guesser();
	
		guessNum1=guess.guess();
	
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
	
		playerNum1=p1.guess();
	
		playerNum2=p2.guess();
		
		playerNum3=p3.guess();
		
		 if(guessNum1==playerNum1) {
			 if(guessNum1==playerNum1&&guessNum1==playerNum2&&guessNum1==playerNum3) {
					System.out.println("all players are winners");
				}
				else if(guessNum1==playerNum1&&guessNum1==playerNum2) {
					System.out.println("player 1 & 2  are winners");
				}
				else {
			System.out.println("player 1 is winner");
				}
			 System.out.println("The Number is "+ guessNum1);
			 break;
		}
		else if (guessNum1==playerNum2) {
			if(guessNum1==playerNum2&&guessNum1==playerNum3)
			System.out.println("player 2 & 3 are winners");
			
			else {
				System.out.println("player 2 is winner");
				
			}
			 System.out.println("The Number is "+ guessNum1);
			break;
		}
		else if(guessNum1==playerNum3) {
			System.out.println("player 3 is winner");
			 System.out.println("The Number is "+ guessNum1);
			break;
		}
		 if(guessNum1!=playerNum1&&guessNum1!=playerNum2&&guessNum1!=playerNum3) {
			System.out.println("ALL ARE LOST!!  PLAY AGAIN");
		 }
		 System.out.println("The Number is "+ guessNum1);
		}
}

}