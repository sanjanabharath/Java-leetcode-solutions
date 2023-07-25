//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(!stack.empty() && stack.peek()=='('){
                    stack.pop();
                }else{
                stack.push(ch);
               
            }
            }else{
                stack.push(ch);
               
            }
        }

        while(!stack.empty()){
            stack.pop();
            count++;
        }

        return count;
    }
}
