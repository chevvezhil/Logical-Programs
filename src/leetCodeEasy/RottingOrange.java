package leetCodeEasy;

import java.util.LinkedList;
import java.util.Queue;

/* Frequently asked question in Amazon, google
   * 
   */
public class RottingOrange {

	public static void main(String[] args) {
		int[][] grid = new int[][] {{2,2,2,1,1}};
		
		int rows = grid.length;
		int columns  = grid[0].length;
		
		int freshOranges = 0;
		
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j] ==2) {
					queue.add(new int[] {i,j});
				}
				
				if(grid[i][j] ==1)
					freshOranges++;
			}
		}
		
		System.out.println("queue size " + queue.size());
		
		
		int count =0;
		int[][] directions = new int[][] {{-1,0},{1,0},{0,-1},{0,1}};
	
		while(!queue.isEmpty() && freshOranges >0) {
			
			for(int i=0;i<queue.size();i++) {
				
				int[] node = queue.poll();
				
				for(int[] dirs : directions) {
					int x = node[0] + dirs[0];
					int y = node[1] + dirs[1];
					
					if(x< 0 || y<0 || x >= rows || y >= columns || grid[x][y] ==0 || grid[x][y]==2)continue;
					grid[x][y] = 2;
					queue.add(new int[] {x,y});
					freshOranges--;
					
					System.out.println("fresh orange value " + freshOranges);
				}
				System.out.println("queue size now " + queue.size());
				
			}
			count++;
			System.out.println("count value " + count);
		} 
		
		System.out.println(freshOranges==0 ?count : -1);
	}
	
}
