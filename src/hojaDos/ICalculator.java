package hojaDos;
//Calcula la expresión postfix dada
public interface ICalculator {
	//Obtiene el resultado de la operación anterior.
	public double evaluate(String expression) throws ArithmeticException;
	public double getPrevious();
	
}
