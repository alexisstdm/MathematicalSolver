package mathematical.solver;
import java.util.HashMap;


public interface ZeroAlgorithm {
	public Double advance(Function function, HashMap<String,Double> parameters, 
			String independentParameter, Double functionValue);
}
