package telran.string;

public class StringMethods {
	 public static void charAtMethod (String myStr) {

		    char result = myStr.charAt(0);
		    System.out.println( result);
		  }
		  
		  public static void compareToMethod(String myStr1,String myStr2) {

			    System.out.println(myStr1.compareTo(myStr2));
			  }  
		  public static void compareToIgnoreCaseMethod(String myStr1,String myStr2) {

			  System.out.println(myStr1.compareToIgnoreCase(myStr2));
			  }  
		  public static void concatMethod(String firstName,String lastName) {

			  System.out.println(firstName.concat(lastName));
		  }
		  public static void startWithMethod(String myStr1,String myStr2) {

			  System.out.println(myStr1.startsWith(myStr2));   
			  
			  }  
		  public static void endWithMethod(String myStr1,String myStr2) {

			  System.out.println(myStr1.endsWith(myStr2));   
			 
			  
			  
			  }  
		  public static void containsMethod(String myStr1,String myStr2) {

			  System.out.println(myStr1.contains(myStr2));   
			
			  }  
		  public static void indexOfMethod(String myStr1,String myStr2) {

			  System.out.println(myStr1.indexOf(myStr2));
			  
			  
			  }  
		  public static void lastIndexOfMethod(String myStr1,String myStr2) {

			  System.out.println(myStr1.lastIndexOf(myStr2));
			 		  
			  }  
}
