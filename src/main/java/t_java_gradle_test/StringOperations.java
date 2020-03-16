package t_java_gradle_test;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {
	
  public String reverse(String a) {
	  List<String> tempArray = new ArrayList<String> (a.length());
	  for (int i=0; i< a.length(); i++) {
		  tempArray.add(a.substring(i, i+1));
	  }
	  StringBuilder reversedString = new StringBuilder(a.length());
	  for (int i = tempArray.size()-1; i>=0; i--) {
		  reversedString.append(tempArray.get(i));
	  }
	  return reversedString.toString();
  }
  
  public String concat(String a, String b) {
	  String retVal = null;
	    if (a != null && a.length() > 0) {
	      StringBuilder sb = new StringBuilder();
	      sb.append(a);
	        if (b != null) {
	          sb.append(b);
	        }
	      retVal = sb.toString();
	    }
	    //Fixed in case a null but b still contains something
	    else if (b != null && b.length() > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(b);
			if (a != null) {
				sb.append(b);
			}
			retVal = sb.toString();
		}
	    return retVal;
  }
  
  public boolean isPalindrome(String a) {
  	//Added null exception
  	if (a == null){
  		throw new NullPointerException();
	}

	  if(a.length() <= 1){
			return true;
		}

	  	//Added lowercase, fixed charAt
		if(!(a.toLowerCase().charAt(0) + "").equals(a.toLowerCase().charAt(a.length() - 1) + "")){
			return false;
		}
		//Fixed a.lenght
		return isPalindrome(a.substring(1, a.length() - 1));

  }
  
}