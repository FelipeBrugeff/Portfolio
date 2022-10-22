package stringExtraction;
import java.util.Scanner;
public class Names 
{
	public static void print(String phrase)
	{
		System.out.println(phrase);
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int option;
		String name;
		int index1 = 0;
		int index2 = 0;
		print("Please, insert a compound name of two or tree names: ");
		name = scan.nextLine();
		name = name + " ";
		print("Please insert the postition of the name you want to extract (1 for First name, 2 for Second name and etc...)");
		option = scan.nextInt();
		
		
		
		switch(option)
		{
			case 1:
	
					for(int i = 0; i < name.length(); i++ )
					{
						if(Character.isWhitespace(name.charAt(i)))
						{
							index2 = i;
							break;
						}
						
					}
					
					print(name.substring(index1,index2));
					break;
			
			case 2:
				
				for(int i = 0; i < name.length(); i++ )
				{
					if(Character.isWhitespace(name.charAt(i)))
					{
						index1 = i + 1;
						break;
					}
					
				}
				
				for(int i = index1; i < name.length(); i++)
				{
					if(Character.isWhitespace(name.charAt(i)))
					{
						index2 = i;
						break;
					}
				}
				 
				print(name.substring(index1, index2));
				break;
				
			case 3:
				
				for(int i = 0; i < name.length(); i++ )
				{
					if(Character.isWhitespace(name.charAt(i)))
					{
						index1 = i + 1;
						break;
					}
					
				}
				
				for(int i = index1; i < name.length(); i++)
				{
					if(Character.isWhitespace(name.charAt(i)))
					{
						index2 = i;
						break;
					}
				}
				
				print(name.substring(index2));
				break;
				
		}
	
		
		
	}
		
		
		
}
		

