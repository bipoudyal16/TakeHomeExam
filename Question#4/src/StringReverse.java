import java.lang.*; 
import java.io.*; 
import java.util.*; 

public class  StringReverse{	
	public String reverseString(String str) {
		
		if(str == null) {
			return null;
	}	
	StringBuilder output = new StringBuilder(str).reverse();
	return output.toString();

}
}

