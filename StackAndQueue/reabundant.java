public class reabundant {
    
}
class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>(); 
        
        for(int i=0 ; i<s.length(); i++){
            
            char ch = s.charAt(i); 
            
            if(ch != ')'){
                st.push(ch); 
            }else if (st.peek() == '(' ){
                return true ; 
            }else {
                int count = 0 ; 
                while(st.size()>0 && st.peek() != '('){
                    st.pop();
                    count++; 
                }
                if(count == 1 ){
                    return true ; 
                }
                st.pop(); 
            }
        }
        return false ; 
    }
}
