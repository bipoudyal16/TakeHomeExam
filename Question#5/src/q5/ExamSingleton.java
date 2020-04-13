package q5;

public class ExamSingleton {
    private static ExamSingleton SINGLE_INSTANCE = null; 
    private ExamSingleton() {} 
    public static ExamSingleton creareInstance() { 
        if (SINGLE_INSTANCE == null) { 
            synchronized(ExamSingleton.class) {
            SINGLE_INSTANCE = new ExamSingleton(); 
            }
        }
        return SINGLE_INSTANCE; 
    	
    }
public void telljoke() { 
	System.out.println("Hear about the new restaurant called Karma?\n" + 
			"There’s no menu: You get what you deserve.");     
}
    

}
