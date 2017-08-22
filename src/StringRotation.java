public class StringRotation{
	public static void main(String args[]){
		String input1= "okeshl";
		String input2= "lo kesh";
		String join=input1+input1;
		if(join.contains(input2)){
			System.out.println("Yes, rotation");
		}
		else{
			System.out.println("No");
		}
		
	}
}