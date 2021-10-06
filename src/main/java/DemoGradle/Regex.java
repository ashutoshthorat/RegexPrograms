package DemoGradle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main( String args[] ) {
	      // String to be scanned to find the pattern.
	      String line = "Hiig5";
	      String pattern = "[a-zA-Z0-9]{3,5}";

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
