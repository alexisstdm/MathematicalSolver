package mathematical.solver;
import java.util.HashMap;
public class Calculus {
	private static double epsilon = 0.01;
	
	public static void setEpsilon(double __epsilon){
		epsilon = __epsilon;
	}
	
	public static double getEpsilon(){
		return epsilon;
	}
	
	public static Double derivative(Function function, HashMap<String,Double> parameters, String independentParameter){
		HashMap<String,Double> parametersAux = new HashMap<String,Double>(parameters);
		parametersAux.put(independentParameter, 
				parametersAux.get(independentParameter)-epsilon);
		Double f_0 = function.evaluate(parametersAux);
		parametersAux.put(independentParameter, 
				parametersAux.get(independentParameter)+2.0*epsilon);
		Double f_1 = function.evaluate(parametersAux);
		return (f_1 - f_0)/(2.0*epsilon);
	}
}
