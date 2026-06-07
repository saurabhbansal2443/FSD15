public class PrintInRange {
    
}
class Solution {
	
	public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
		ArrayList<Integer> ans = new ArrayList<>();
		
		if (root == null) {
			return ans ;
		}
		
		ArrayList<Integer> lans = printNearNodes(root.left, low, high);
		for (int ele : lans) {
			ans.add(ele);
		}
		if (root.data >= low && root.data <= high) {
			ans.add(root.data);
		}
		
		ArrayList<Integer> rans = printNearNodes(root.right, low, high);
		
		for (int ele : rans) {
			ans.add(ele);
		}
		
		return ans ;
	}
}
