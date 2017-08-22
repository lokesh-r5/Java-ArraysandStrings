import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class PalindromePermutation{
	public static int isPalindrome(String input){
		int num;
		Hashtable<Character, Integer> count=new Hashtable<Character, Integer>();
		if(input.length()==1){
			System.out.println("Yes");
			return 0;
		}
		for(int i=0; i<input.length();i++){
			if(count.containsKey(input.charAt(i))){
				num=count.get(input.charAt(i));
				num++;
				System.out.println(num);
				count.put(input.charAt(i), num);
			}
			else
				count.put(input.charAt(i), 1);
		}
		int valueCount=0;
		Set<Character> keys= count.keySet();
		for(Character key: keys){
			if(count.get(key)%2==1)
				valueCount++;
		}
		if(valueCount>1)
			System.out.println("No");
		else
			System.out.println("Yes");
		return 0;
		
	}
	public static void main(String args[]){
		String input;
		Scanner sc= new Scanner(System.in);
		input=sc.nextLine();
		sc.close();
		isPalindrome(input);
		
	}
}