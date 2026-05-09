public class NGR {
    
}
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        ans.add(0,-1); 
        
        Stack<Integer> st = new Stack<>(); 
        
        int  n = arr.length ; 
        
        st.push(arr[n-1]); 
        
        for(int i= n-2 ; i>=0 ; i--){
            
            int ele = arr[i]; 
            
            if(st.peek()> ele){
                  ans.add(0,st.peek()); 
            }else {
                
                while(st.size()>0 && st.peek()<= ele){
                    st.pop(); 
                }
                
                if(st.size() == 0 ){
                      ans.add(0,-1); 
                }else{
                     ans.add(0,st.peek()); 
                }
            }
            
            st.push(ele); 
        }
        
        return ans ; 
    }
}