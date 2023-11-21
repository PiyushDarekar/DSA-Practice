import java.util.Stack;

public class EvaluatePostfix {
    public static int evaluatePostfix(String exp){
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<exp.length();i++){

            if(Character.isDigit(exp.charAt(i))){
                stack.push(exp.charAt(i)-'0');
            }else{
                int num1=stack.pop();
                int num2=stack.pop();

                switch(exp.charAt(i)){
                    case '+':
                        stack.push(num2+num1);
                        break;
                    case '-':
                        stack.push(num2-num1);
                        break;
                    case '*':
                        stack.push(num2*num1);
                        break;
                    case '/':
                        stack.push(num2/num1) ;
                        break;           
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String exp="231*+9-";
        System.out.println(evaluatePostfix(exp));
    }
}
