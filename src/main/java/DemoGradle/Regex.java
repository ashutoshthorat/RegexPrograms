package DemoGradle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main( String args[] ) {
	      // String to be scanned to find the pattern.
	      String line = "HiiAshutosh";
	      String pattern = "[a-zA-Z]{3,}";
	      System.out.println("hello");
	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      if (m.matches()) {
	         System.out.println("Matching pattern");
	      }else {
	         System.out.println("NO MATCH");
	      }
	   }
	}
