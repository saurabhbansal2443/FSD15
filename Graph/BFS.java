public class BFS {
    
}
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        Queue<Integer> que = new LinkedList<>(); 
        
        boolean[] visit = new boolean[adj.size()]; 
        
        
        que.add(0); 
        visit[0] = true ;
        
        while(que.size()>0 ){
            int node = que.remove(); 
         
            ans.add(node); 
            
            for(int vertex : adj.get(node)){
                if(visit[vertex] == false ){
                    que.add(vertex); 
                      visit[vertex] = true ;
                }
            }
            
            
        }
        
        return ans ; 
        
    }
}