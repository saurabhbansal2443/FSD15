public class CountConnectedComponents {
    
}
class Solution {
	int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
		// making adj
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		
		for (int i = 0 ; i<V; i++) {
			adj.add(new ArrayList<>());
		}
		
		for (ArrayList<Integer> data : edges) {
			
			int edge1 = data.get(0);
			int edge2 = data.get(1);
			
			adj.get(edge1).add(edge2);
			adj.get(edge2).add(edge1);
		}
		
		// visit array
		
		boolean[] visit = new boolean[adj.size()];
		
		int ans = 0 ; 
		
		for (int i = 0 ; i<adj.size(); i++) {
			
			if (visit[i] == false) {
			    ans++; 
				helper(i, visit, adj);
			}
		}
		
		return ans ; 
		
	}
	
	public void helper(int node,  boolean[] visit, ArrayList<ArrayList<Integer>> adj) {
		
		if (visit[node] == true) {
			return ;
		}
		
		visit[node] = true ;
		for (int vertex : adj.get(node)) {
			
			if (visit[vertex] == false) {
				
				helper(vertex, visit, adj);
			}
		}
	}
}
