package Easy;

public class DelGreatVal {
	public static void main(String[] args) {
		int a[][] = {{1,2,0},{3,3,1}};
		int ghosts[][]= {{1,0}};
		int []target = {2,0};
		System.out.println(escapeGhosts(ghosts, target));
		//System.out.println(deleteGreatestValue(a));
	}
	public static int deleteGreatestValue(int[][] grid) {
		int row = grid[0].length;
		int col = grid.length;
		int rmax = 0,cmax = 0;
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
			System.out.print(grid[i][j]);
//			max = grid[i][j];
			if(rmax < grid[i][j]) {
				rmax = grid[i][j];
				grid[i][j] = -1;
			}
		}
			
			System.out.println();
		}

		return rmax;
        
    }
	 public static boolean escapeGhosts(int[][] g, int[] target) {
		 int flag = 0;
		 int row = g.length;
		 int col = g[0].length;
//		 for(int i=0;i<row;i++) {
//			 for(int j=0;j<col;j++) {
//				 for(int k = 0;k<target.length;k++) {
//					 if(g[i][j] == target[k]) {
//						 flag=1;
//						 break;
//					 }
//				 }
//				 if(flag==1) 
//					 break;
//			 }
//			 if(flag==1) 
//				 break;
//		 }
//		 if(flag==1) 
//			return true;
		 String str = "";
		 String tar = "";
		 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++) {
			 str += g[i][j];
		 		}
		 }
		 for(int i=0;i<target.length;i++) {
			 tar += target[i];
		 }
		 StringBuffer sb = new StringBuffer(str);
		 sb.reverse();
		 String fuck = sb.toString();
		 if(str.contains(tar) || fuck.contains(tar)) {
			 return true;
		 }
		return false;
	        
	    }
}
