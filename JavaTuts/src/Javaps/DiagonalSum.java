package Javaps;

	public class DiagonalSum {

		
		public static void main(String[] args) 
		{

				
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

				
		System.out.println(new DiagonalSum().getDiagonalSum(matrix));

			
		}

			
		public int getDiagonalSum(int[][] matrix) 
		{
			int sum = 0;
			for(int i=0;i < matrix.length ; i++)
			{
				for(int j = 0;j < matrix[i].length;j++)
				{
					if(i == j)
					{
						sum = sum + matrix[i][j];
					}
				}
			}

			
			return sum;

		}
}





