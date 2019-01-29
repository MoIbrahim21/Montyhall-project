import java.util.Random;
import java.util.Scanner;

public class Montyhallpt3 {

	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner user = new Scanner(System.in);
		int won = 0;
		System.out.println("Please enter the amount of plays: ");
		int rounds = user.nextInt();
		while (rounds < 10 || rounds > 10000)
		{
			System.out.println("Error please chose a number between 10 and 10,000");
			rounds = user.nextInt();
			
		}
		System.out.println("Following each round would you like to switch or stay ");
		String jawn = user.next();
		while (jawn.equals("Switch\n") || jawn.equals("stay\n")) 
		{
			System.out.println("Error Please Enter whether to switch or stay");
			jawn = user.nextLine();
		}
		int car, door, goat;
		for(int i=0; i < rounds; i++) 
		{
			car=rand.nextInt(3) + 1;
			door=rand.nextInt(3)+ 1;
			if ( car == door)
			goat = door%3 +1;
			else if (Math.abs(car-door) == 2)
			goat=2;
			else if((car == 1&& door == 2 ||(door ==1&& car ==2)
			goat = 3;
			else
			goat = 1;
			if (jawn.equals("switch"))
			{
				if(car != door)
				won++;
				System.out.printf("Car: %s Door picked: %s Goat: %s/n" , car, door, goat);
			}
			else if (jawn.equals("stay"))
			{
				if(door == car)
				won++;
				System.out.printf("car: %s Door picked: %s Goat: %s/n", car,door,goat);
			}
			double numberwon = won, plays=rounds;
			double percentage = (numberwon/plays)*100;
			System.out.printf("Congrats you won % out of % times! Thats %.2f", won, plays, percentage);	
			System.out.println("%.");
				
			
			
			}
				
	
		
		
		}
	
	}

