import java.util.Scanner;

public class StringCompression{
	public static void compress(String input){
		String output="";
		int count=0;
		for(int i=0; i<input.length();i++){
			count++;
			if(i+1>=input.length()||input.charAt(i+1)!=input.charAt(i)){
				output+=""+input.charAt(i)+count;
				count=0;
			}
		}
		if(output.length()<input.length())
			System.out.println(output);
		else
			System.out.println(input);
	}
	
	public static void main(String args[]){
		String input;
		Scanner sc= new Scanner(System.in);
		input= sc.nextLine();
		sc.close();
		compress(input);
	}
}