class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        for(String str:tokens){
            switch(str){
                case "+"->{
                    int b=st.pop();
                    int a=st.pop();
                    st.push(a+b);
                }
                case "-"->{
                    int b=st.pop();
                    int a=st.pop();
                    st.push(a-b);
                }
                case "*"->{
                    int b=st.pop();
                    int a=st.pop();
                    st.push(a*b);
                }
                case "/"->{
                    int b=st.pop();
                    int a=st.pop();
                    st.push(a/b);
                }
                default->{
                    st.push(Integer.parseInt(str));
                }
            }
        }
        return st.pop();
    }
}