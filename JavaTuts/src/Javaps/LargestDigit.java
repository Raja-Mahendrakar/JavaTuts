package Javaps;

public class LargestDigit
{
	public static void main(String[] args) 
	{

		System.out.println(new LargestDigit().getLargestDigit(7896));
		
	}

	public int getLargestDigit(int number) 
	{
		int rem = 0, lar = 0;
		while(number > 0)
		{ 
			rem = number % 10;
			if(rem > lar )
			{
				lar = rem;
				
			}
			number = number / 10;	
		}
		return lar;
				
	}

}
