public class DFS {
    
}
class Solution {
	public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> ans = new ArrayList<>();
		boolean[] visit = new boolean[adj.size()];
		
		helper(0, ans, visit, adj);
		
		return ans ;
		
	}
	
	public void helper(int node, ArrayList<Integer> ans, boolean[] visit, ArrayList<ArrayList<Integer>> adj) {
		
		if (visit[node] == true) {
			return ;
		}
		
		ans.add(node);
		visit[node] = true ;
		for (int vertex : adj.get(node)) {
			
			if (visit[vertex] == false) {
				
				helper(vertex, ans, visit, adj);
			}
		}
	}
	
}
