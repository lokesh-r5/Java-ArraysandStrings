import java.util.Scanner;

public class URLify{
	public static void removeSpaces(char[] input, int length){
		int count=0;
		for(int i=0; i<length;i++){
			if(input[i]==' ')
				count++;
		}
		System.out.println(input);

		int newLength= length+2*count;
		System.out.println(newLength);

		input[newLength]='\0';
		for(int j=newLength-1,i=length-1;i>0;i--,j--){
			if(input[i]==' '){
				input[j]='0';j--;
				input[j]='2';j--;
				input[j]='%';
			}
			else
				input[j]=input[i]; 
		}
	}
	public static void main(String args[]){
		String input;
		Scanner sc= new Scanner(System.in);
		input= sc.nextLine();
		sc.close();
		int length= input.length();
		char[] charInput= input.toCharArray();
		removeSpaces(charInput, length);
		System.out.println(input);
	}
}