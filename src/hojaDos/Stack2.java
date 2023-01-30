package hojaDos;
import java.util.EmptyStackException;
import java.util.ArrayList;

public class Stack2 implements IStack<Double> {
	ArrayList<Double> stack = null;

    public void clasestack(){
        stack = new ArrayList<Double>();
    }

    public void push(Double item){
        stack.add(item);
    }


   public Double pop() throws EmptyStackException {
        if (empty()){
            return null;
        }
        else{
            Double op =  stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return op;
        }
   }


   public Double peek() throws EmptyStackException{
        if (empty()){
            return null;
        }
        else{
            return stack.get(stack.size()-1);
        }
   }


   public boolean empty(){
        if (stack.size()==0){
            return true;
        }
        else{
            return false;
        }
   }


   public int size(){
        return stack.size();
   }

}
