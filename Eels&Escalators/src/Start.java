import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String AI;
		String Friends;
		System.out.println("Hello! Welcome to Eels & Escalator");
		System.out.println("Do you want to play with a friend?");
		Friends=in.nextLine();
		if(Friends.equalsIgnoreCase("No"))
		{
			System.out.println("Would you like to play with AI?");
			AI=in.nextLine();
			if (AI.equalsIgnoreCase("Yes"))
			{
				System.out.println("Okay, how many AI will you play with, up to three?");
				int AIcount = in.nextInt();
				if (AIcount==3)
				{
				Ai3.Ai3Fun();
				}
				else if (AIcount==2)
				{
				Ai2.Ai2Fun();
				}
				else if (AIcount==1)
				{
				Ai1.Ai1Fun();
				}
			}
			else
			{
				System.out.println("Okay, lets start the game!");
				Solo.SoloFun();
			}
		}
		else
		{
			System.out.println("Okay you will be playing with one other friend, lets begin.");
		}
	}

}
