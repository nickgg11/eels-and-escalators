import java.util.Random;
import java.util.Scanner;

public class Ai3 {

	public static void Ai3Fun() {
		Scanner in=new Scanner(System.in);
		System.out.println("Okay now there are two modes please choose one \n normal \n special");
		String type=in.nextLine();
		//Var
		int turn=1;
		int playerposition=1;
		int ai1pos=0;
		int ai2pos=0;
		int ai3pos=0;
		Random rnd=new Random();
		int movep=0;
		int moveai1=0;
		int moveai2=0;
		int moveai3=0;
		if (type.equalsIgnoreCase("Normal"))

		{

			//Eels & Escalators
			int ladder1= rnd.nextInt(3-3+1)+3;
			int ladder2= rnd.nextInt(30-21+1)+21;
			int ladder3= rnd.nextInt(70-61+1)+61;
			int snake1= rnd.nextInt(40-31+1)+31;
			int snake2= rnd.nextInt(70-61+1)+61;
			while (playerposition<=100&&ai1pos<=100&&ai2pos<=100&&ai3pos<=100)
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
				ai1pos=ai1pos+moveai1;
				ai2pos=ai2pos+moveai2;
				ai3pos=ai3pos+moveai3;
				if (playerposition==99||ai1pos==99||ai2pos==99||ai3pos==99)
				{
					System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
					System.out.println("A snake has been hit");
					if (turn==1){
						playerposition=playerposition-20;
						System.out.println("You hit a snake so now your position is now 79.");
					}
					else if (turn==2)
					{
						ai1pos=ai1pos-20;
						System.out.println("The bot a the snake so its position is now 79.");
					}
					else if (turn==3)
					{
						ai2pos=ai2pos-20;
						System.out.println("The bot a the snake so its position is now 79.");
					}
					else if (turn==4)
					{
						ai3pos=ai3pos-20;
						System.out.println("The bot a the snake so its position is now 79.");
					}

				}
				else if (playerposition==snake2||ai1pos==snake2||ai2pos==snake2||ai3pos==snake2||playerposition==snake1||ai1pos==snake1||ai2pos==snake1||ai3pos==snake1)
				{
					System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
					System.out.println("A snake has been hit");
					if (turn==1){
						playerposition=playerposition-20;
						System.out.println("You hit a snake so now your position is now "+playerposition+".");
						if (playerposition<1){
							playerposition=1;
						}
						else if (turn==2)
						{
							ai1pos=ai1pos-20;
							System.out.println("The bot hit a snake so its position is now "+ai1pos+".");
							if (ai1pos<1){
								ai1pos=1;
							}
							else if (turn==3)
							{
								ai2pos=ai2pos-20;
								System.out.println("The bot hit a snake so its position is now"+ai2pos+".");
								if (ai2pos<1)
								{
									ai2pos=1;
								}

							}
							else if (turn==4)
							{
								ai3pos=ai3pos-20;
								System.out.println("The bot hit a snake so its position is now "+ai3pos+".");
								if (ai3pos<1)
								{
									ai3pos=1;
								}
							}				
						}
						else if (playerposition==ladder1||ai1pos==ladder1||ai2pos==ladder1||ai3pos==ladder1||playerposition==ladder2||ai1pos==ladder2||ai2pos==ladder2||ai3pos==ladder2||playerposition==ladder3||ai1pos==ladder3||ai2pos==ladder3||ai3pos==ladder3)
						{
							if (turn==1){
								playerposition=playerposition+20;
								System.out.println("You hit a ladder so now your position is now "+playerposition+".");
							}
							else if (turn==2)
							{
								ai1pos=ai1pos+20;
								System.out.println("The bot hit a ladder so its position is now "+ai1pos+".");
							}
							else if (turn==3)
							{
								ai2pos=ai2pos+20;
								System.out.println("The bot hit a ladder so its position is now"+ai2pos+".");
							}
							else if (turn==4)
							{
								ai3pos=ai3pos+20;
								System.out.println("The bot hit a ladder so its position is now "+ai3pos+".");
							}
						}

						else 
						{
							System.out.println("Your role was "+movep+" and your position is "+playerposition+", the positions of the AI are "+ai1pos+","+ai2pos+","+ai3pos+".");
						}
						if (turn==1)
						{
							turn=2;
						}
						else if (turn==2)
						{
							turn=3;
						}
						else if (turn==3)
						{
							turn=4;
						}
						else if (turn==4)
						{
							turn=1;
						}
					}
					System.out.println("The game is over!");
				}
				else
				{
					//Var
					//Eels & Escalators
					ladder1= rnd.nextInt(90-80+1)+80;
					ladder2= rnd.nextInt(150-140+1)+140;
					ladder3= rnd.nextInt(300-290+1)+290;
					snake1= rnd.nextInt(500-490+1)+490;
					snake2= rnd.nextInt(900-890+1)+890;
					int ladder4= rnd.nextInt(534-441+1)+441;
					int ladder5= rnd.nextInt(147-134+1)+134;
					int ladder6= rnd.nextInt(471-454+1)+454;
					int snake3= rnd.nextInt(435-412+1)+412;
					int snake4= rnd.nextInt(865-855+1)+855;
					int ladder7= rnd.nextInt(879-867+1)+867;
					while (playerposition<=1000&&ai1pos<=1000&&ai2pos<=1000&&ai3pos<=1000)
					{
						System.out.println("Okay lets roll!");
						in.nextLine();
						dice1= rnd.nextInt(32-1+1)+1;
						dice2= rnd.nextInt(32-1+1)+1;
						diceai1= rnd.nextInt(32-1+1)+1;
						diceai2= rnd.nextInt(32-1+1)+1;
						diceai3= rnd.nextInt(32-1+1)+1;
						diceai4= rnd.nextInt(32-1+1)+1;
						diceai5= rnd.nextInt(32-1+1)+1;
						diceai6= rnd.nextInt(32-1+1)+1;
						movep=dice1+dice2;
						moveai1=diceai1+diceai2;
						moveai2=diceai3+diceai4;
						moveai3=diceai5+diceai6;
						playerposition=playerposition+movep;
						ai1pos=ai1pos+moveai1;
						ai2pos=ai2pos+moveai2;
						ai3pos=ai3pos+moveai3;
						if (playerposition==999)
						{
							System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
							System.out.println("A snake has been hit");
							if (turn==1){
								playerposition=playerposition-200;
								System.out.println("You hit a snake so now your position is now 799.");
							}
							else if (turn==2)
							{
								ai1pos=ai1pos-200;
								System.out.println("The bot hit a snake so its position is now 799.");
							}
							else if (turn==3)
							{
								ai2pos=ai2pos-200;
								System.out.println("The bot hit a snake so its position is now 799.");
							}
							else if (turn==4)
							{
								ai3pos=ai3pos-200;
								System.out.println("The bot hit a snake so its position is now 799.");
							}

						}
						else if (playerposition==snake1||playerposition==snake2||playerposition==snake3||playerposition==snake4||ai1pos==snake1||ai1pos==snake2||ai1pos==snake3||ai1pos==snake4||ai2pos==snake1||ai2pos==snake2||ai2pos==snake3||ai2pos==snake4||ai3pos==snake1||ai3pos==snake2||ai3pos==snake3||ai3pos==snake4)
						{
							System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
							System.out.println("A snake has been hit");
							if (turn==1){
								playerposition=playerposition-70;
								System.out.println("You hit a snake so now your position is now "+playerposition+".");
								if (playerposition<1)
								{
									playerposition=1;
								}
							}
						}
						else if (turn==2)
						{
							ai1pos=ai1pos-70;
							System.out.println("The bot hit a snake so its position is now "+ai1pos+".");
							if (ai1pos<1)
							{
								ai1pos=1;
							}
						}
						else if (turn==3)
						{
							ai2pos=ai2pos-70;
							System.out.println("The bot hit a snake so its position is now"+ai2pos+".");
							if (ai2pos<1)
							{
								ai2pos=1;

							}
							else if (turn==4)
							{
								ai3pos=ai3pos-70;
								System.out.println("The bot a the snake so its position is now "+ai3pos+".");
								if (ai3pos<1)
								{
									ai3pos=1;

								}	
							}
							else if (playerposition==ladder1||playerposition==ladder2||playerposition==ladder3||playerposition==ladder4||playerposition==ladder5||playerposition==ladder6||playerposition==ladder7||ai1pos==ladder1||ai1pos==ladder2||ai1pos==ladder3||ai1pos==ladder4||ai1pos==ladder5||ai1pos==ladder6||ai1pos==ladder7||ai2pos==ladder1||ai2pos==ladder2||ai2pos==ladder3||ai2pos==ladder4||ai2pos==ladder5||ai2pos==ladder6||ai2pos==ladder7||ai3pos==ladder1||ai3pos==ladder2||ai3pos==ladder3||ai3pos==ladder4||ai3pos==ladder5||ai3pos==ladder6||ai3pos==ladder7)
							{
								System.out.println("Your role was "+movep+"and the rolls of the first second and third Ai in their respective order."+moveai1+".");
								if (turn==1){
									playerposition=playerposition+70;
									System.out.println("You hit a ladder so now your position is now "+playerposition+".");
								}
							}
							else if (turn==2)
							{
								ai1pos=ai1pos+70;
								System.out.println("The bot hit a ladder so its position is now "+ai1pos+".");
							}
						}
						else if (turn==3)
						{
							ai2pos=ai2pos+70;
							System.out.println("The bot hit a ladder so its position is now"+ai2pos+".");
						}
						else if (turn==4)
						{
							ai3pos=ai3pos+70;
							System.out.println("The bot hit a ladder so its position is now "+ai3pos+".");	
						}
						else
						{
							System.out.println("Your role was "+movep+" and your position is "+playerposition+", the positions of the AI are "+ai1pos+","+ai2pos+","+ai3pos+".");
						}

					}
					System.out.println("The game is over!");
				}
			}
		}
	}
}

