package application;

public class Model {
    public float calculate(long n1,long n2,String operator) {
    	switch(operator) {
    	case "+":
    		return n1+n2;
    	case "-":
    		return n1-n2;
    	case "*":
    		return n1*n2;
    	case "/":
    		if(n2!=0)
    		{return n1/n2;}
    		else 
    			return 0;
    	default :
    		break;
    	}
    	return 0;
    }
}
