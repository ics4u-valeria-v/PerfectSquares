import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PerfectSquares {
	
	public static void main (String[]args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		MagicSquares(numbers);
		}
	
	
	public static void MagicSquares(ArrayList<Integer> numbers)
	{
		//check if there are 9 elements
		if (numbers.size() != 9)
		{
			System.out.print("Not perfect squares");
		}
		else
		//if there  are 9 numebrs
		{
			//itterate the list and add them to other three lists
			ArrayList<Integer> num1 = new ArrayList<>();
			ArrayList<Integer> num2 = new ArrayList<>();
			ArrayList<Integer> num3 = new ArrayList<>();
			for (int count = 0; count <= 6; count = count +3)
			{
				if (count == 0)
				{
					num1.add(numbers.get(count));
					num1.add(numbers.get(count+1));
					num1.add(numbers.get(count+2));
				}
				else if (count == 3)
				{
					num2.add(numbers.get(count));
					num2.add(numbers.get(count+1));
					num2.add(numbers.get(count+2));
				}
				else if (count == 6)
				{
					num3.add(numbers.get(count));
					num3.add(numbers.get(count+1));
					num3.add(numbers.get(count+2));
				}
			}
			
			if(CheckMagic(num1, num2, num3) == false)
			{
				Collections.shuffle(numbers);
				MagicSquares(numbers);
				System.out.print("Here");
			}
			else
			{
				System.out.print(num1 + " " + num2 + num3 + " are perfect squares");
			}
				
			/*{
				MagicSquares(shuffleArray(numbers));
				System.out.print("Here");
			}*/
			
			
		}
	}
	

	//this function adds the row, columns, and them horizontally to see if they add up to 15, if not return false
	public static boolean CheckMagic(ArrayList<Integer>num1, ArrayList<Integer>num2,ArrayList<Integer>num3)
	{
		if ( num1.get(0) + num2.get(0) + num3.get(0) == 15 && num1.get(1) + num2.get(1) + num3.get(1) == 15 && num1.get(2) + num2.get(2) + num3.get(2) == 15)
		{
			if ( num1.get(0) + num1.get(1) + num1.get(2) == 15 && num2.get(0) + num2.get(1) + num2.get(2) == 15 && num3.get(0) + num3.get(1) + num3.get(2) == 15)
			{
				if ( num1.get(0) + num2.get(1) + num3.get(2) == 15 && num1.get(2) + num2.get(1) + num3.get(0) == 15)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

}
