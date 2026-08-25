class Solution {
    public boolean isValid(String s) {
        Stack<Character>Stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                Stack.push(c);
            }else{
                if(Stack.isEmpty())
                return false;
                char top=Stack.pop();
                if((c==')'&&top!='(')||(c=='}'&&top!='{')||(c==']'&&top!='[')){
                    return false;
                }
            }
        }
        return Stack.isEmpty();
    }
}