package hojaDos;
import java.util.EmptyStackException;
import java.util.ArrayList;

public class ClaseStack implements IStack<Double> {
	ArrayList<Double> stack = null;
	int count = 0;

    public void stackClass(){
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
   


    //public Double pop() {
    //    if (count > 0) {
    //        stack.remove(0);
    //        count--;
    //    }
    //    else {
    //        throw new EmptyStackException();
    //    }
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
