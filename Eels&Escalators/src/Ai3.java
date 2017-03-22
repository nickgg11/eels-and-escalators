import java.util.Random;
import java.util.Scanner;

public class Ai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Okay now there are two modes please choose one \n normal \n special");
		String type=in.nextLine();
		if (type.equalsIgnoreCase("Normal"))
		{
			//Var
			int playerposition=1;
			int ai1pos=0;
			int ai2pos=0;
			int ai3pos=0;
			Random rnd=new Random();
			int movep=0;
			int moveai1=0;
			int moveai2=0;
			int moveai3=0;
			//Eels & Escalators
			int ladder1= rnd.nextInt(3-3+1)+3;
			int ladder2= rnd.nextInt(30-21+1)+21;
			int ladder3= rnd.nextInt(70-61+1)+61;
			int snake1= rnd.nextInt(40-31+1)+31;
			int snake2= rnd.nextInt(70-61+1)+61;
			while (playerposition<=100)
			{
				System.out.println("Okay lets roll!");
				in.nextLine();
				int dice1= rnd.nextInt(6-1+1)+1;
				int dice2= rnd.nextInt(6-1+1)+1;
				int diceai1= rnd.nextInt(6-1+1)+1;
				int diceai2= rnd.nextInt(6-1+1)+1;
				int diceai3= rnd.nextInt(6-1+1)+1;
				int diceai4= rnd.nextInt(6-1+1)+1;
				int diceai5= rnd.nextInt(6-1+1)+1;
				int diceai6= rnd.nextInt(6-1+1)+1;
				movep=dice1+dice2;
				moveai1=diceai1+diceai2;
				moveai2=diceai3+diceai4;
				moveai3=diceai5+diceai6;
				playerposition=playerposition+movep;
				if (playerposition==99)
				{
					System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1);
					playerposition=playerposition-20;
					System.out.println("Your position is 79.");
				}
				else if (playerposition==snake1)
				{
					System.out.println("Your role was "+move+".");
					playerposition=playerposition-20;
					System.out.println("Your positon is "+playerposition+".");
					if (playerposition<1){
						playerposition=1;
					}
				}
				else if (playerposition==snake2)
				{
					System.out.println("Your role was "+move+".");
					playerposition=playerposition-20;
					if (playerposition<1){
						playerposition=1;
					}
					System.out.println("Your position is "+playerposition+".");
				}
				else if (playerposition==ladder1)
				{
					System.out.println("Your role was "+move+".");
					playerposition=playerposition+20;
					System.out.println("Your position is "+playerposition+".");
				}
				else if (playerposition==ladder2)
				{
					System.out.println("Your role was "+move+".");
					playerposition=playerposition+20;
					System.out.println("Your position is "+playerposition+".");
				}
				else if (playerposition==ladder3)
				{
					System.out.println("Your role was "+move+".");
					playerposition=playerposition+20;
					System.out.println("Your position is "+playerposition+".");
				}
				else 
				{
					System.out.println("Your move was "+move+" and your current position is "+playerposition+".");
				}
			}
			System.out.println("Congratulations you won!");
		}
		else
		{
			//Var
			int playerposition=1;
			Random rnd=new Random();
			int move=0;
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
			while (playerposition<=1000)
			{
				System.out.println("Okay lets roll!");
				in.nextLine();
				int dice1= rnd.nextInt(18-1+1)+1;
				int dice2= rnd.nextInt(18-1+1)+1;
				move=dice1+dice2;
				playerposition=playerposition+move;
				if (playerposition==999)
				{
					System.out.println("Your role was "+move+".");
					playerposition=playerposition-70;
					System.out.println("You hit a snake. Your position is ."+ playerposition+".");
				}
				else if (playerposition==snake1||playerposition==snake2||playerposition==snake3||playerposition==snake4)
				{
					System.out.println("Your role was "+move+".");
					playerposition=playerposition-70;
					System.out.println("You hit a snake. Your position is ."+ playerposition+".");
					if (playerposition<1){
						playerposition=1;
					}
				}
				else if (playerposition==ladder1||playerposition==ladder2||playerposition==ladder3||playerposition==ladder4||playerposition==ladder5||playerposition==ladder6||playerposition==ladder7)
				{
					System.out.println("Your role was "+move+".");
					playerposition=playerposition+70;
				}

			}
			System.out.println("Congratulations you won!");
		}
	}
}


