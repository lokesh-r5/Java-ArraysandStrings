import java.util.Hashtable;
import java.util.Scanner;

public class StringPermutation{
	public static boolean isPermutation(String input1, String input2){
		Hashtable<Character, Integer> count= new Hashtable<>();
		for(int i=0; i<input1.length(); i++){
			if(count.containsKey(input1.charAt(i))){
				int num= count.get(input1.charAt(i));
				num++;
				count.put(input1.charAt(i), num);
			}
			else
				count.put(input1.charAt(i), 1);
		}
		
		for(int i=0; i<input2.length(); i++){
			if(count.containsKey(input2.charAt(i))){
				int num= count.get(input2.charAt(i));
				num--;
				if(num>0)
					count.put(input2.charAt(i), num);
				else
					count.remove(input2.charAt(i));
			}
			else 
				return false;
		}
		return true;
	}
	
	public static void main(String args[]){
		String input1, input2;
		System.out.println("enter strings");
		Scanner sc=new Scanner(System.in);
		input1= sc.nextLine();
		input2= sc.nextLine();
		sc.close();
		if(isPermutation(input1, input2))
			System.out.println("Yes, permutation");
		else
			System.out.println("No");
		
	}
}