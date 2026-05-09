public class StockSpan {
    
}
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        ans.add(1); 
        
        Stack<Pair> st = new Stack<>(); 
        
        int n = arr.length ; 
         
         Pair p1 = new Pair(arr[0] , 0); 
         
         st.push(p1);
         
         for(int i=1 ; i<n ; i++){
             
             int ele = arr[i]; 
             
             if(st.peek().ele > ele  ){
                    ans.add(1); 
                    
             }else {
                 
                 while(st.size()>0 && st.peek().ele<= ele ){
                     st.pop(); 
                 }
                 
                 if(st.size() == 0 ){
                     ans.add(i+1); 
                 }else{
                     ans.add(i-st.peek().idx); 
                 }
             }
             
              Pair p2 = new Pair(ele, i); 
             st.push(p2); 
             
             
         }
        
        return ans ; 
        
    }
    
    class Pair{
        int ele ; 
        int idx ; 
        Pair(int ele , int idx ){
                this.ele = ele ; 
                this.idx = idx ; 
        }
    }
}