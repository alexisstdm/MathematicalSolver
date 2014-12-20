package mathematical.solver;

//import java.util.HashMap;
//import european.options.*;
//import american.options.*;

public class TestSolver {
	
	/* public class FunctionCall implements Function{
		public Double evaluate(HashMap<String,Double> parameters){
			BlackScholesModel model = new BlackScholesModel(parameters.get("SPOT"),
															parameters.get("VOLATILITY"),
															parameters.get("RATE"),
															parameters.get("DIVIDEND"));
			EuropeanCall call = new EuropeanCall(model, parameters.get("STRIKE"), 
														parameters.get("TIME"));
			
			return parameters.get("PRICE") - call.getPrice(true);
		}
	}
	
	public class FunctionAmericanCall implements Function{
		public Double evaluate(HashMap<String,Double> parameters){
			BinomialModel model = new BinomialModel(parameters.get("SPOT"),
													parameters.get("RATE"),
												    parameters.get("DIVIDEND"),
												    parameters.get("VOLATILITY"),
												    10,
												    parameters.get("TIME"));
			AmericanCallOption call = new AmericanCallOption(model, parameters.get("STRIKE"));
			
			return parameters.get("PRICE") - call.evaluate();
		}
	}
	
	public static void main(String[] args) {
		
		HashMap<String,Double> parameters = new HashMap<String,Double>();
		HashMap<String,Double> parameters_2 = new HashMap<String,Double>();
		
		parameters.put("SPOT", 1.0);
		parameters.put("VOLATILITY", 0.249999);
		//parameters.put("RATE", 0.00345);
		parameters.put("RATE", 0.01);
		parameters.put("DIVIDEND", 0.018);
		parameters.put("STRIKE", 0.8);
		parameters.put("TIME", 1.0);
		parameters.put("PRICE", 0.21);
		
		parameters_2.put("SPOT", 1.0);
		parameters_2.put("VOLATILITY", 0.55);
		parameters_2.put("RATE", 0.00462);
		parameters_2.put("DIVIDEND", 0.12);
		parameters_2.put("STRIKE", 0.8);
		parameters_2.put("TIME", 1.0);
		parameters_2.put("PRICE", 0.250559);
		// TODO Auto-generated method stub
		
	    Solver sol = new Solver(new Function(){
						public Double evaluate(HashMap<String,Double> parameters){
							return Math.pow(parameters.get("x"),2.0)-2.0;
						}}, new NewtonAlgorithm(), "x", 0.0, parameters);
		
		TestSolver test = new TestSolver();		
		Solver europeanSolver = new Solver(test.new FunctionCall(), new NewtonAlgorithm(), "VOLATILITY", 0.0, 
									parameters, 50);
		Solver americanSolver = new Solver(test.new FunctionAmericanCall(), new NewtonAlgorithm(), "DIVIDEND", 0.0, 
				parameters_2, 50);
		System.out.println("El resultado del solver europeo es " + europeanSolver.solve() + '\n');
		System.out.println("El número de iteraciones efectuado es " + europeanSolver.getCurrentIterations() + '\n');
		System.out.println("El resultado del solver americano es " + americanSolver.solve() + '\n');
		System.out.println("El número de iteraciones efectuado es " + americanSolver.getCurrentIterations() + '\n');
		}	 */
}
