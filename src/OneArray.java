import java.util.Scanner;

public class OneArray{
	public static boolean threeChecks(String input1, String input2){
		int length;
		length= (input1.length()>=input2.length())? input1.length(): input2.length();
		int count =0;
		for(int i=0; i<length; i++){
			if(input1.length()==input2.length()){
				if(input1.charAt(i)!=input2.charAt(i))
					count++;
			}
			else{
				if(input1.charAt(i)!=input2.charAt(i-count))
					count++;
			}
		}
		if(count==1)
			return true;
		return false;
	}
	
	public static void main(String args[]){
		String input1, input2;
		System.out.println("enter strings");
		Scanner sc=new Scanner(System.in);
		input1= sc.nextLine();
		input2= sc.nextLine();
		sc.close();
		if(threeChecks(input1, input2))
			System.out.println("Yes, 1 Insert or Replace difference");
		else
			System.out.println("No");
		
	}
}