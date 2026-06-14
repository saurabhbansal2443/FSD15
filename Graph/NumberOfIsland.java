class Solution {
	public int countIslands(char[][] grid) {
		
		int count = 0 ;
		int rows = grid.length;
		int cols = grid[0].length ;
		
		for (int r = 0 ; r<rows; r++) {
			for (int c = 0 ; c<cols ; c++) {
				
				if (grid[r][c] == 'L') {
					count++;
					helper(r, c, rows, cols, grid);
				}
			}
		}
		
		return count ;
		
	}
	
	public void helper(int r, int c, int rows, int cols, char[][] grid) {
		
		if (r<0 || c<0 || r >= rows || c >= cols || grid[r][c] != 'L') {
			return ;
		}
		
		grid[r][c] = 'V';
		
		helper(r - 1, c, rows, cols, grid);
		helper(r - 1, c + 1, rows, cols, grid);
		helper(r , c + 1, rows, cols, grid);
		helper(r + 1, c + 1, rows, cols, grid);
		helper(r +1, c , rows, cols, grid);
		helper(r + 1, c - 1, rows, cols, grid);
		helper(r , c - 1, rows, cols, grid);
		helper(r - 1, c - 1, rows, cols, grid);
	}
}
