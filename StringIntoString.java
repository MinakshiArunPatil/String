package String;

public class StringIntoString {  
	        public static void main(String[] args)
	        {
	      
	            
	            String firstString = "Update";
	            String stringToBeInserted = "to";
	            int index = 1;
	            String newString = new String();
	  	      
	            for (int i = 0; i < firstString.length(); i++) {
	      
	                
	                newString=newString+firstString.charAt(i);
	      
	                if (i == index) {
	      
	                   
	                    newString=newString+stringToBeInserted;
	                }
	      
	            System.out.println("first String: "
	                               + firstString);
	            System.out.println("String to be inserted: "
	                               + stringToBeInserted);
	            System.out.println("String to be inserted at index: "
	                               + index);
	      
	            
	            System.out.println("Modified String: "
	                               +newString);
}}
}
