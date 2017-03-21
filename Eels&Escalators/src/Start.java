import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

				}
				else if (AIcount==2)
				{

				}
				else if (AIcount==1)
				{

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
