public class PreorderItretative {
    
}
/*
class Node {
	int data;
	Node left, right;
	Node(int item) {
		data = item;
		left = right = null;
	}
}
*/
class Pair {
	int level ;
	Node node ;
	Pair(int level, Node root) {
		this.level = level ;
		node = root ;
	}
}
class Solution {
	ArrayList<Integer> preOrder(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans ;
		Stack<Pair> st = new Stack<>();
		Pair p = new Pair(1, root);
		st.push(p);
		while (st.size() > 0) {
			Pair p1 = st.peek();
			
			if (p1.level == 1) {
				ans.add(p1.node.data);
				p1.level = 2 ;
				if (p1.node.left != null) {
					Pair p2 = new Pair(1, p1.node.left);
					st.push(p2);
				}
			} else if (p1.level == 2) {
				p1.level = 3;
				if (p1.node.right != null) {
					Pair p2 = new Pair(1, p1.node.right);
					st.push(p2);
				}
			} else {
				st.pop();
			}
		}
		return ans ;
		
	}
}
