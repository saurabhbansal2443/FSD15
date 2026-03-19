package Recursion;

import java.util.ArrayList;

public class RatInAMAze {
    class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length ; 
      ArrayList<String> list = new ArrayList<String>(); 
      boolean[][] visit = new boolean[n][n]; 
      
      helper(0,0,n,maze,"",visit, list ); 
      return list ; 
        // DLRU
    }
    
    public void helper(int r , int c , int n ,int[][] maze, String path ,boolean[][] visit  , ArrayList<String> list  ){
            
            if(r<0 || c<0 || r>= n || c>=n ||maze[r][c] == 0 || visit[r][c] == true  ){
                return ; 
            }
            
            if(r== n-1 && c== n-1 ){
                list.add(path); 
                return ; 
            }
            
            visit[r][c] = true ; 
            
            helper(r+1,c,n, maze , path + "D" , visit , list); 
             helper(r,c-1,n, maze , path + "L" , visit , list); 
              helper(r,c+1,n, maze , path + "R" , visit , list); 
               helper(r-1,c,n, maze , path + "U", visit , list); 
               
                  visit[r][c] = false ; 
               
    }
}
}
