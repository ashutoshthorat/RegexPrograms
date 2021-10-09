package DemoGradle;

public class AgeValidate {
	public static void validate(int age) throws AgeValidatiobException {
		if(age>18) {
			throw new AgeValidatiobException("age is not valid");
		}
	}
	public static void main(String[] args)  {
	int age=24;
	try {
		validate(24);
	} catch (AgeValidatiobException e) {
		// TODO Auto-generated catch block
		System.out.println("enter valid age");
	}
	}
}
