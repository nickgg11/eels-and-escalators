import java.util.Random;
import java.util.Scanner;

public class Solo {
	public static void SoloFun(){
		Scanner in=new Scanner(System.in);
		System.out.println("Okay now there are two modes please choose one /n normal /n special");
		String type=in.nextLine();
		if (type.equalsIgnoreCase("Normal"))
		{
			//Var
			int playerposition=0;
			Random rnd=new Random();
			int move=0;
				while (playerposition!=100)
				{
					int dice1= rnd.nextInt(6-1+1)+1;
					int dice2= rnd.nextInt(6-1+1)+1;
					move=dice1+dice2;
					playerposition=playerposition+move;
					if
				}
		}
	}
}



