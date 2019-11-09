/*
Make a calculator that takes a string of operators: (), +, -, *, / 
and numbers separated by spaces and returns the Double value of that expression.
*/
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {
    public static Double evaluate(String expression) {
    
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        String finalAnswer = "";
        Object result = null;
                try {
                    result = engine.eval(expression);
                } 
                catch (ScriptException e1) {
                    e1.printStackTrace();
                }
                if (result != null) {
                    finalAnswer = result.toString();
                }
                
        return Double.parseDouble(finalAnswer);
    }
    public static void main(String[] args) {
        String test = "2 / 2 + 3 * 4 - 6 * (4 / 2)";

        System.out.println(evaluate(test));
    }
}