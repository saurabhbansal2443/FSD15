public class FloodFill {
    
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int rows = image.length ; 
        int cols = image[0].length ; 
        int intialColor = image[sr][sc]; 
        boolean[][] visit = new boolean[rows][cols]; 
        
        helper(sr, sc , rows,cols , intialColor , newColor ,image , visit  ); 
        
        return image ; 
    }
    
    public void helper(int r , int c , int rows , int cols , int intialColor , int newColor , int[][] image ,  boolean[][] visit  ){
        if(r<0 || r>=rows || c<0 || c>=cols || image[r][c] != intialColor || visit[r][c] == true ){
            return ; 
        }
        
        visit[r][c] = true ; 
        image[r][c] = newColor; 
        
       helper(r, c+1 , rows,cols , intialColor , newColor ,image , visit  ); 
       helper(r+1, c , rows,cols , intialColor , newColor ,image , visit  ); 
       helper(r, c-1 , rows,cols , intialColor , newColor ,image , visit  ); 
       helper(r-1, c , rows,cols , intialColor , newColor ,image , visit  ); 
    }
    
    
}