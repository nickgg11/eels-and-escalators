import java.util.Random;
import java.util.Scanner;
public class Ai1 
{
	public static void Ai1Fun() 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Okay now there are two modes please choose one \n normal \n special");
		String type=in.nextLine();
		//Var
		int turn=1;
		int playerposition=1;
		int ai1pos=0;
		Random rnd=new Random();
		int movep=0;
		int moveai1=0;
		if (type.equalsIgnoreCase("Normal"))

		{

			//Eels & Escalators
			int ladder1= rnd.nextInt(3-3+1)+3;
			int ladder2= rnd.nextInt(30-21+1)+21;
			int ladder3= rnd.nextInt(70-61+1)+61;
			int snake1= rnd.nextInt(40-31+1)+31;
			int snake2= rnd.nextInt(70-61+1)+61;
			while (playerposition<=100&&ai1pos<=100)
			{
				System.out.println("Okay lets roll!");
				in.nextLine();
				int dice1= rnd.nextInt(6-1+1)+1;
				int dice2= rnd.nextInt(6-1+1)+1;
				int diceai1= rnd.nextInt(6-1+1)+1;
				int diceai2= rnd.nextInt(6-1+1)+1;
				movep=dice1+dice2;
				moveai1=diceai1+diceai2;
				playerposition=playerposition+movep;
				ai1pos=ai1pos+moveai1;
				if (playerposition==99||ai1pos==99)
				{
					System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
					System.out.println("A snake has been hit");
					if (turn==1){
						playerposition=playerposition-20;
						System.out.println("You hit he snake so now your position is now 79.");
					}
					else
					{
						ai1pos=ai1pos-20;
						System.out.println("The bot hit the snake so its position is now 79.");
					}
				}
				else if (playerposition==snake1||ai1pos==snake1||playerposition==snake2||ai1pos==snake2)
				{
					System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
					if (turn==1){
						playerposition=playerposition-20;
						System.out.println("You hit he snake so now your position is now "+playerposition+".");
					}
					else
					{
						ai1pos=ai1pos-20;
						System.out.println("The bot hit the snake so its position is now "+ai1pos+".");

					}
				}
				else if (playerposition==ladder1||ai1pos==ladder1||playerposition==ladder3||ai1pos==ladder3||playerposition==ladder2||ai1pos==ladder2)
				{
					System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
					if (turn==1){
						playerposition=playerposition+20;
						System.out.println("You hit a ladder so now your position is now "+playerposition+".");
					}
					else
					{
						ai1pos=ai1pos+20;
						System.out.println("The bot hit a ladder so its position is now "+ai1pos+".");

					}
				}
				turn=turn*-1;
			}
			System.out.println("The game is over!");
		}
		else
		{
			//Var
			//Eels & Escalators
			int ladder1= rnd.nextInt(90-80+1)+80;
			int ladder2= rnd.nextInt(150-140+1)+140;
			int ladder3= rnd.nextInt(300-290+1)+290;
			int snake1= rnd.nextInt(500-490+1)+490;
			int snake2= rnd.nextInt(900-890+1)+890;
			int ladder4= rnd.nextInt(534-441+1)+441;
			int ladder5= rnd.nextInt(147-134+1)+134;
			int ladder6= rnd.nextInt(471-454+1)+454;
			int snake3= rnd.nextInt(435-412+1)+412;
			int snake4= rnd.nextInt(865-855+1)+855;
			int ladder7= rnd.nextInt(879-867+1)+867;
			while (playerposition<=1000&&ai1pos<=1000)
			{
				System.out.println("Okay lets roll!");
				in.nextLine();
				int dice1= rnd.nextInt(32-1+1)+1;
				int dice2= rnd.nextInt(32-1+1)+1;
				int diceai1= rnd.nextInt(32-1+1)+1;
				int diceai2= rnd.nextInt(32-1+1)+1;
				movep=dice1+dice2;
				moveai1=diceai1+diceai2;
				playerposition=playerposition+movep;
				ai1pos=ai1pos+moveai1;

				if (playerposition==999||ai1pos==999)
				{
					System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
					System.out.println("A snake has been hit");
					if (turn==1){
						playerposition=playerposition-100;
						System.out.println("You hit he snake so now your position is now 79.");
					}
					else
					{
						ai1pos=ai1pos-100;
						System.out.println("The bot hit the snake so its position is now 79.");
					}
				}
				else if (playerposition==snake1||ai1pos==snake1||playerposition==snake2||ai1pos==snake2)
				{
					System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
					if (turn==1){
						playerposition=playerposition-100;
						System.out.println("You hit he snake so now your position is now "+playerposition+".");
					}
					else
					{
						ai1pos=ai1pos-100;
						System.out.println("The bot hit the snake so its position is now "+ai1pos+".");

					}
				}
				else if (playerposition==ladder1||ai1pos==ladder1||playerposition==ladder3||ai1pos==ladder3||playerposition==ladder2||ai1pos==ladder2)
				{
					System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
					if (turn==1){
						playerposition=playerposition+100;
						System.out.println("You hit a ladder so now your position is now "+playerposition+".");
					}
					else
					{
						ai1pos=ai1pos+100;
						System.out.println("The bot hit a ladder so its position is now "+ai1pos+".");

					}
				}
				turn=turn*-1;

			}
			System.out.println("The game is over!");
		}
	}
}


