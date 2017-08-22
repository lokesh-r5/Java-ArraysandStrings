import java.util.Scanner;
import java.util.Hashtable;


class StringUniqueCharacters{
	public static boolean isUnique(String input){
		for(int i=0; i<input.length(); i++){
			for(int j=i+1; j<input.length();j++)
				if(input.charAt(i)==input.charAt(j))
					return false;
		}
		return true;
	}
	
	public static boolean isUniqueSecondMethod(String input){
		int check=0;
		for(int i=0; i<input.length(); i++){
			int val=input.charAt(i)-'a';
			if((check & (1<<val))>0)
				return false;
			else 
				check|=1<<val;
		}
		return true;
	}
	
	public static boolean isUniqueHashMethod(String input){
		Hashtable<Character, Integer> count= new Hashtable<>();
		for(int i=0; i<input.length(); i++){
			if(count.containsKey(input.charAt(i)))
				return false;
			count.put(input.charAt(i), 1);
		}
		return true;
		
		
		
	}

	public static void main(String args[]){
		String input= new String();
		System.out.println("enter string");
		Scanner sc= new Scanner(System.in);
		input= sc.nextLine();
		sc.close();
		if(isUnique(input))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
		
		if(isUniqueSecondMethod(input))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
		
		if(isUniqueHashMethod(input))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
		
	}
	
	
	
	
}