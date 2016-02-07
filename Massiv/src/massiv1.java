
public class massiv1 {
	
		

		public static void main(String args[]){
		//int [][] m = new int[4][4];
		int [][] m = {{1,0,6,3},{8,0,0,7},{2,0,0,5},{2,3,4,5}};
		for(int row=0;row<m.length;row++){
			for(int col=0;col<m[row].length;col++){
				System.out.print(m[row][col] + "  ");
				try{
					Thread.sleep(500);
					
				}catch(Exception e){}
				
			}
				System.out.println();
		}
		
		}}
		