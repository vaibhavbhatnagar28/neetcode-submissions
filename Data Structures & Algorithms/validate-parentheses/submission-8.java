class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int n = s.length();

        if(n%2 != 0)return false;
        
        char[] charArray = s.toCharArray();
        for(int i = 0; i<n; i++){
            if(charArray[i] == '('){
                stack.push(charArray[i]);
            }
            else if(charArray[i] == '['){
                stack.push(charArray[i]);
            }
            else if(charArray[i] == '{'){
                stack.push(charArray[i]);
            }
            else if(charArray[i] == '}'){
                if(stack.empty())return false;
                if(stack.peek()!='{')return false;
                stack.pop();
            }
            else if(charArray[i] == ']'){
                if(stack.empty())return false;                
                if(stack.peek()!='[')return false;
                stack.pop();
            }
            else if(charArray[i] == ')'){
                if(stack.empty())return false;                
                if(stack.peek()!='(')return false;
                stack.pop();
            }
        }
        if(!stack.empty())return false;

        return true;
    }
}
