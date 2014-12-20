package mathematical.solver;
import java.util.HashMap;
import mathematical.solver.Function;


public class NewtonAlgorithm implements ZeroAlgorithm{
	final double EPSILON = 0.000001;
	final int MAX_ITERATIONS = 4;
	
	public Double advance(Function function, HashMap<String, Double> parameters, 
			String independentParameter, Double functionValue){
		
		Double f = function.evaluate(parameters);
		Double d_f = Calculus.derivative(function, parameters, independentParameter);
		
		Double epsilon = 0.0001;
		
		int i = 0;
		while ((Math.abs(d_f) <= this.EPSILON) && (i < this.MAX_ITERATIONS)){
			Calculus.setEpsilon(Math.pow(10, i)*epsilon);
			d_f = Calculus.derivative(function,  parameters, independentParameter);
			i++;
		}
		
		return parameters.get(independentParameter) + 
				(functionValue - f)/d_f;
	}
}
