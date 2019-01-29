
public class Array {
	
	public static int sumArray(int[][] matrix) 
	{
		//int x, y;
		//int[] array = matrix[0][y];
		int m = 0;
		for(int x = 0; x < matrix.length; x++ ) {
			//int m = 0;
			int m1 = 0;
			int m2 = 0;
			for(int y = 0; y < matrix.length; y++) {
				m1 = matrix[x][y];
				if(m1 > 0) {
					break;
				}
			}
			for(int y = matrix.length; y != 0; y-- ) {
				//m2 = matrix[x][y];
				if(m2 > 0 ) {
					m2 = matrix[x][y];
					break;
				}
			}
			
			if(m1 != 0 && m2 != 0) {
				m = m1 * m2;
				System.out.println(m);
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		
		int[][] matrix = {{2, 3, 4}, {5, 6, 7}};
		sumArray(matrix);
		System.out.println(matrix);
		
	}
}
