package DemoGradle;

import java.util.function.Predicate;

public class PredicateTes {
	  static void pred(int number, Predicate<Integer> predicate)
	    {
	        if (predicate.test(number)) {
	            System.out.println("Number " + number);
	        }
	    }
	 public static void main(String[] args)
	    {
	Predicate<Integer> lesserthan = i -> (i < 18); 
	  
    // Calling Predicate method
    System.out.println(lesserthan.test(10));
    Predicate<Integer> greaterThanTen = (i) -> i > 10;
    
    // Creating predicate
    Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
    boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
    System.out.println(result);

    // Calling Predicate method
    boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
    System.out.println(result2);
    pred(10, (i) -> i > 7);
	    }
}
