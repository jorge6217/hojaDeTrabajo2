package hojaDos;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ClaseCalculadora implements ICalculator {
	clasestack stack = null;
    public Clasecalculadora(){
        stack = new clasestack();
    }
    public double parsear(String expression){
        return Double.parseDouble(expression);
    }
    public String remover(String s){
        return s.replace(" ", "");
    }
    public double evaluate(String ope) {
        String expression = ope;
        int len = expression.length();
        double res = 0.0;
        for (int i = 0; i < len; i++){
            char c = expression.charAt(i);
            String co = String.valueOf(c);
            if (c != '\n'){
                if(Character.isDigit(c)){
                    stack.push(parsear(co));
                }
                else{
                    double a = stack.pop(), b = stack.pop();
                    if (c == '+'){
                        res = a + b;
                    }
                    if (c == '-'){
                        res = a - b;
                    }   
                    if (c == '/'){
                        res = a / b;
                    }
                    if (c == '*'){
                        res = a * b;
                    }
                    stack.push(res);
                }
            }
        }
        return stack.pop();
    }
    public double getPrevious(){
        return 0.0;
    }
}

	