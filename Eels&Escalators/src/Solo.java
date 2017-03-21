import java.util.Random;
import java.util.Scanner;

public class Solo {
	public static void SoloFun(){
		Scanner in=new Scanner(System.in);
		System.out.println("Okay now there are two modes please choose one \n normal \n special");
		String type=in.nextLine();
		if (type.equalsIgnoreCase("Normal"))
		{
			//Var
			int playerposition=1;
			Random rnd=new Random();
			int move=0;
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
				move=dice1+dice2;
				playerposition=playerposition+move;
				if (playerposition==99)
				{
					System.out.println("Your role was "+move+".");
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
	}
}



