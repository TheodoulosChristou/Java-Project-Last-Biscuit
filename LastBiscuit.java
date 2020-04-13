 /* A program that calculates the biscuits at barrels and finds who is the winner
  attempt to level3 */

import java.util.Scanner;
class LastBiscuit
{
	public static void main (String [] args)
	{
		
		//Here are the values that we need to use in our program 
		Scanner in = new Scanner(System.in);
		int bag1 = 6;
		int bag2 = 8;
		int playerTurn = 1;
		String barrel; 
	
		//Here we have a loop that calculate who player plays
		do
		{
			if ( playerTurn == 1 )
			{
				
		// we see how many biscuits have in bags and how many biscuits that player1 choose
				System.out.println("Biscuits Left - Barrel 1: " + bag1);
				System.out.println("Biscuits Left - Barrel 2: " + bag2);
				System.out.print("Biscuits taken by player 1: ");
				
		//we do a loop to check if the biscuits that player1 choose are integer and not String 
				while (!in.hasNextInt())
				{
					System.out.println("The variable isn't integer, please put integer!!");
					System.out.println("Biscuits taken by player 1: ");
					in.next();
				}
				int player1 = in.nextInt();
				System.out.print("From barrel1 (one), barrel2 (two), or both (both)? ");
				barrel =in.next();
				
		/* with that loop we are going to check if the barrel isn't equal with one or two or both and if isn't then it will show 
		 a message that will ask the right number of barrel */
				while ( ( !barrel.equals("one") ) && ( !barrel.equals("two") )&& (!barrel.equals("both") ) )
				{
					System.out.println("The barrel isn't the right! Please use one, two or both ");
					barrel =in.next();
				}
				
		//with that switch we check if the biscuits are in the limits of bags each of them one and two or both
					
					switch ( barrel )
					{
						case "one":
							if ( ( player1 <= bag1 ) && ( player1 > 0 ) )
							{
							bag1 = bag1 - player1;
							playerTurn = 2;
							}	
							else
							{
								System.out.println("The number of biscuits aren't right.Please put the right number of biscuits!!");
							}
						break;
							
					
						case "two":
							if ( ( player1 <= bag2 ) && ( player1 > 0 ) ) 
							{
								bag2 = bag2 - player1;
								playerTurn = 2;
								
							}
							else
							{
								System.out.println("The number of biscuits aren't right.Please put the right number of biscuits!!");
							}
						break;
							
					
						case "both":
							if  ( ( player1 <= bag1 ) && ( player1 > 0 ) && ( player1 <= bag2 ) )
							{
								bag1 = bag1 - player1;
								bag2 = bag2 - player1;
								playerTurn = 2;
							}
							else
							{
								System.out.println("The number of biscuits aren't right.Please put the right number of biscuits!!");
							}
						break;
					}
			}
			
		// we see how many biscuits have in bags and how many biscuits that player2 choose
			else if ( playerTurn == 2 )
			{
				System.out.println("Biscuits Left - Barrel 1: " + bag1);
				System.out.println("Biscuits Left - Barrel 2: " + bag2);
				System.out.print("Biscuits taken by player 2: ");
				
		// we do a loop to check if the biscuits that player2 choose are integer and not String
				while (!in.hasNextInt())
				{
					System.out.println("The variable isn't integer, please put integer!!");
					System.out.println("Biscuits taken by player 2: ");
					in.next();
				}
				
				int player2 = in.nextInt();
				System.out.print("From barrel1 (one), barrel2 (two), or both (both)? ");
				barrel =in.next();
				
		/* with that loop we are going to check if the barrel isn't equal with one or two or both and if isn't then it will show
		 a message that will ask the right number of barrel */
				while ( ( !barrel.equals("one") ) && ( !barrel.equals("two") ) && ( !barrel.equals("both") ) )
				{
					System.out.println("The barrel isn't the right! Please use one, two or both");
					barrel =in.next();
				}
					
		//with that switch we check if the biscuits are in the limits of bags each of them one and two or both of them 
					switch ( barrel )
					{
						case "one":
							if ( ( player2 <= bag1 ) && ( player2 > 0 ) )
							{
								bag1 = bag1 - player2;
								playerTurn = 1;
							}
							else
							{
								System.out.println("The number of biscuits aren't right.Please put the right number of biscuits!!");
							}
						break;
							
					
						case "two":
							if ( ( player2 <= bag2 ) && ( player2 > 0 ) )
							{
								bag2 = bag2 - player2;
								playerTurn = 1;
							}
							else
							{
								System.out.println("The number of biscuits aren't right.Please put the right number of biscuits!!");
							}
						break;
							
						
						case "both":
							if  ( ( player2 <= bag1 ) && ( player2 > 0 ) && ( player2 <= bag2 ) )
							{
								bag1 = bag1 - player2;
								bag2 = bag2 - player2;
								playerTurn = 1;
							}
							else
							{
								System.out.println("The number of biscuits aren't right.Please put the right number of biscuits!!");
							}
						break;
					}
			}	
		}  while ( ( bag1 > 0 ) || ( bag2 > 0 ) );
		
		System.out.println("Biscuits Left - Barrel 1: " + bag1);
		System.out.println("Biscuits Left - Barrel 2: " + bag2);
		
		// We do if statements to see who player is going to win the game 
		if ( playerTurn == 2 ) 
		{
			System.out.println("Winner is player 1");
		}
		else if  ( playerTurn == 1 ) 
		{
			System.out.println("Winner is player 2");
		}
	}
}
