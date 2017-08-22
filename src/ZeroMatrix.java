public class ZeroMatrix{
	public static int[][] zeroMatrix(int[][] matrix, int n){
		boolean firstColumn=false;
		boolean firstRow=false;
		for(int i=0;i<n; i++){
			if(matrix[i][0]==0){
				firstColumn= true;
			}
		}
		for(int j=0; j<n; j++){
			if(matrix[0][j]==0){
				firstRow=true;
			}
		}
		for(int i=1; i<n;i++){
			for(int j=1; j<n; j++){
				if(matrix[i][j]==0){
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for(int i=n-1; i>=1; i--){
			if(matrix[i][0]==0){
				for(int j=0; j<n; j++)
					matrix[i][j]=0;
			}
		}
		
		for(int j=n-1; j>=1;j--){
			if(matrix[0][j]==0){
				for(int i=0; i<n; i++){
					if(matrix[0][j]==0){
						matrix[i][j]=0;
					}
				}
			}
		}
		if(firstRow==true){
			for(int i=0; i<n; i++){
				matrix[0][i]=0;
			}
		}
		if(firstColumn==true){
			for(int i=0; i<n; i++){
				matrix[i][0]=0;
			}
		}
		return matrix;
	}
	public static void printMatrix(int[][] matrix, int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");System.out.print("\n");
		
	}
	public static void main(String args[]){
		int[][] matrix={{0,2,0,1},{4,5,6,1},{7,8,9,1},{1,1,1,1}};
		printMatrix(matrix,4);
		matrix= zeroMatrix(matrix, 4);
		printMatrix(matrix,4);
	}
}