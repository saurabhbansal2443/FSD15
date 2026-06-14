
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        
        List<List<Integer>> adj = new ArrayList<>(); 
        
        for(int i=0 ; i<V; i++ ){
            adj.add(new ArrayList<>()); 
        }
        
        for(int[] data : edges ){
            
            int edge1 = data[0]; 
            int edge2 = data[1]; 
            
            adj.get(edge1).add(edge2);
            adj.get(edge2).add(edge1);
        }
        
        return adj ; 
    }
}