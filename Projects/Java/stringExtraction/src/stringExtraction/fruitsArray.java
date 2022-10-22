package stringExtraction;
import java.util.Scanner;
public class fruitsArray 
{
	
	String [] fruits = new String [5];
	
	public static void main(String[] args) 
	{
		fruitsArray f = new fruitsArray();
		Scanner s = new Scanner(System.in);
		System.out.println("Insert the names of the fruits:");
		
		for(int i = 0; i < 5; i++)
		{
			f.fruits[i] = s.nextLine();
		}
			
		
		for(int j = 0; j < 5; j++)
		{
			System.out.println(f.fruits[j]);
		}
		
	}
	
}
