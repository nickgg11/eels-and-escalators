import java.util.Random;
import java.util.Scanner;
public class twoplayer {



	public static void twoplayerfun(){
		int turn=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Okay now there are two modes please choose one \n normal \n special");
		String type=in.nextLine();
		if (type.equalsIgnoreCase("Normal"))
		{
			//Var
			int secondplayer=1;
			int playerposition=1;
			Random rnd=new Random();
			int move2=0;
			int move=0;
			//Eels & Escalators
			int ladder1= rnd.nextInt(3-3+1)+3;
			int ladder2= rnd.nextInt(30-21+1)+21;
			int ladder3= rnd.nextInt(70-61+1)+61;
			int snake1= rnd.nextInt(40-31+1)+31;
			int snake2= rnd.nextInt(70-61+1)+61;
			while (playerposition<=100&&secondplayer<=100)
			{
				if (turn==1)
				{
					System.out.println("It's player ones turn,please roll.");
				}
				else
				{
					System.out.println("it's player twos turn, please roll");
				}
				System.out.println("Okay lets roll!");
				in.nextLine();
				int dice1= rnd.nextInt(6-1+1)+1;
				int dice2= rnd.nextInt(6-1+1)+1;
				int diceb1=rnd.nextInt(6-1+1)+1;
				int diceb2=rnd.nextInt(6-1+1)+1;
				move=dice1+dice2;
				move2=diceb1+diceb2;
				secondplayer=secondplayer+move2;
				playerposition=playerposition+move;
				if (playerposition==99||secondplayer==99)
				{
					System.out.println("Your role was "+move+"and the rolls of the first second and third Ai in their respective order."+move2+".");
					System.out.println("A snake has been hit");
					if (turn==1){
						playerposition=playerposition-20;
						System.out.println("You hit he snake so now your position is now 79.");
					}
					else
					{
						secondplayer=secondplayer-20;
						System.out.println("The bot hit the snake so its position is now 79.");
					}
				}
				else if (playerposition==snake1||playerposition==snake2||secondplayer==snake2||secondplayer==snake1)
				{
					System.out.println("Your role was "+move+"and the rolls of the first second and third Ai in their respective order."+move2+".");
					if (turn==1){
						playerposition=playerposition-20;
						System.out.println("You hit he snake so now your position is now "+playerposition+".");
						if (playerposition<1)
						{
							playerposition=1;
						}
					}
					else
					{
						secondplayer=secondplayer-20;
						System.out.println("The bot hit the snake so its position is now "+secondplayer+".");
						if (playerposition<1)
						{
							secondplayer=1;
						}

					}
				}

				else if (playerposition==ladder1||secondplayer==ladder1||playerposition==ladder2||secondplayer==ladder2||playerposition==ladder3||secondplayer==ladder3)
				{
					if (turn==1){
						playerposition=playerposition+20;
						System.out.println("You hit a ladder so now your position is now "+playerposition+".");
					}
					else if (turn==2)
					{
						secondplayer=secondplayer+20;
						System.out.println("The bot hit a ladder so its position is now "+secondplayer+".");
					}
					else 
					{
						System.out.println("Your move was "+move+" and your current position is "+playerposition+".");
					}
					turn=turn*-1;
				}
				System.out.println("Congratulations you won!");
			}
		}
		else
		{
			//Var
			int playerposition=1;
			int secondplayer=1;
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
				int diceb1=rnd.nextInt(18-1+1)+1;
				int diceb2=rnd.nextInt(18-1+1)+1;
				int move2=diceb1+diceb2;
				move=dice1+dice2;
				secondplayer=secondplayer+move2;
				playerposition=playerposition+move;
				if (playerposition==999)
				{
					System.out.println("Your role was "+move+".");
					playerposition=playerposition-70;
					System.out.println("You hit a snake. Your position is ."+ playerposition+".");
				}
				else if (playerposition==snake1||playerposition==snake2||playerposition==snake3||playerposition==snake4)
				{
					if (turn==1)
					{
						System.out.println("Your role was "+move+"and the rolls of the first second and third Ai in their respective order."+move2+".");
						System.out.println("A snake has been hit");
						if (turn==1){
							playerposition=playerposition-70;
							System.out.println("You hit he snake so now your position is now 79.");
						}
						else
						{
							secondplayer=secondplayer-70;
							System.out.println("The bot hit the snake so its position is now 79.");
						}
					}
				}
				else if (playerposition==ladder1||playerposition==ladder2||playerposition==ladder3||playerposition==ladder4||playerposition==ladder5||playerposition==ladder6||playerposition==ladder7)
				{
					if (turn==1){
						playerposition=playerposition+70;
						System.out.println("You hit a ladder so now your position is now "+playerposition+".");
					}
					else if (turn==2)
					{
						secondplayer=secondplayer+70;
						System.out.println("The bot hit a ladder so its position is now "+secondplayer+".");
					}
					else 
					{
						System.out.println("Your move was "+move+" and your current position is "+playerposition+".");
					}
					turn=turn*-1;
				}
				System.out.println("Congratulations you won!");
			}
		}
	}
}





