import java.lang.*;
import java.util.*;

class NumberGame{

     public static void main(String args[]){

	 int guess,number;
	 String ch;
	do
     	{
		Scanner s=new Scanner(System.in);
		Random ran=new Random();
		number=ran.nextInt(100)+1;
	 	System.out.println("\n\t\t\tChoose A number Between 1 to 100 .\n");
		System.out.println("\t\t\tGuess the number within 5 Trials .!!");
		int count=0;
		while(true)
		{
			if(count!=5)
			{
				System.out.print("Guess the no :");
				guess=s.nextInt();
				if(guess==number)
				{
					System.out.println("Good job !!\n");
					int z=count+1;
					System.out.println("you find the no "+number+" in "+z+" attempt .");
					break;
				}
				else if(guess>number)
				{
					System.out.println("Your guess is too HIGH !!!");
					System.out.println("The number is lower than "+guess+"\n");
					count++;
					int x=5-count;
					System.out.println("\t\t*** Now You have only "+x+" attempt"+" ***"+"\n");
				}
				else if(guess < number)
				{
					System.out.println("Your guess is too LOW !!!");
					System.out.println("The number is greater than "+guess+"\n");
					count++;
					int y=5-count;
					System.out.println("\t\t*** Now You have only "+y+" attempt" +" ***"+"\n");
				}
			}
			else
			{
			System.out.println("\n\n>>> Oops !! You Exceed The Limit .");
			System.out.println("The number was "+number);
			break;
			}
	
		}
System.out.print("\nDo You want to play again . Please press (y/Y) : ");
Scanner st=new Scanner(System.in);
ch=st.nextLine();
     	}
	while(ch.equals("y") || ch.equals("Y"));
    }
}

