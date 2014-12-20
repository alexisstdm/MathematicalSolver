package mathematical.solver;
import java.util.HashMap;


public class Solver {
	private Function function;
	private ZeroAlgorithm algorithm;
	private String independentParameter;
	private Double functionValue;
	private HashMap<String, Double> parameters;
	private int maxIterations;
	private int currentIterations;
	
	final double ERROR = 0.0001;
	
	
	public Solver(Function function, ZeroAlgorithm algorithm, String independentParameter,
					Double functionValue, HashMap<String, Double> parameters, int maxIterations){
		this.function = function;
		this.algorithm = algorithm;
		this.independentParameter = independentParameter;
		this.functionValue = functionValue;
		this.parameters = parameters;
		this.maxIterations = maxIterations;
		this.currentIterations = 0;
	}
	
    public Double solve(){
    	double error = 0;
    	
    	double x0 = 0.0;
    	double x1 = 0.0;
    	int i = 1;
    	
    	this.currentIterations = 0;
    	
    	this.parameters.
    			put(independentParameter,
    				this.algorithm.advance(this.function, this.parameters, 
    						this.independentParameter, this.functionValue));
    	x0 = parameters.get(independentParameter);
    	error = this.ERROR + 1.0;
    	while ((error > this.ERROR) && (i <= this.maxIterations)) {
    		this.parameters.
    			put(independentParameter,
    				this.algorithm.advance(this.function, this.parameters, 
    						this.independentParameter, this.functionValue));
    		x1 = parameters.get(independentParameter);
    		error = Math.abs(x1-x0);
    		x0 = x1;
    		this.currentIterations++;
    		i++;
    	}
    	return this.parameters.get(independentParameter);
    }
    
    public void setFunction(Function function){
    	this.function = function;
    }
    

    public Function getFunction(){
    	return this.function;
    }
    
    public void setMaxIterations(int maxIterations){
    	this.maxIterations = maxIterations;
    }
    
    public int getMaxIterations(){
    	return this.maxIterations;
    }
    
    public int getCurrentIterations(){
    	return this.currentIterations;
    }
    
    public void setZeroAlgorithm(ZeroAlgorithm algorithm){
    	this.algorithm = algorithm;
    }
    
    public ZeroAlgorithm getZeroAlgorithm(){
    	return this.algorithm;
    }
}
